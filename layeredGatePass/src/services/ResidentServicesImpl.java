package services;

import data.models.AccessCode;
import data.models.Resident;
import data.repository.ResidentRepository;
import dtos.request.GenerateAccessCodeRequest;
import dtos.request.ResidentLoginRequest;
import dtos.request.RegisterResidentRequest;
import dtos.response.GenerateAccessCodeResponse;
import dtos.response.RegisterResidentResponse;
import dtos.response.ResidentLoginResponse;
import exceptions.InvalidCredentialsException;
import exceptions.InvalidEmailException;
import exceptions.InvalidPhoneNumberException;
import exceptions.DetailsAlreadyInUseException;
import utils.AccessCodeUtil;
import utils.Mapper;

import static utils.PasswordUtil.verifyPassword;

public class ResidentServicesImpl implements ResidentServices {

    private ResidentRepository residentRepository;

    public ResidentServicesImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public RegisterResidentResponse register(RegisterResidentRequest request) {
        verifyNewEmail(request.getEmail());
        verifyNewPhone(request.getPhone());
        Resident resident = Mapper.map(request);
        Resident savedResident = residentRepository.save(resident);

        return Mapper.map(savedResident);
    }

    @Override
    public ResidentLoginResponse login(ResidentLoginRequest loginRequest) {
        validateEmail(loginRequest.getEmail());
        Resident resident = residentRepository.existByEmail(loginRequest.getEmail())
                .orElseThrow(()-> new InvalidCredentialsException("Invalid email or password"));
        if(!verifyPassword(loginRequest.getPassword(), resident.getHashedPassword())) {
            throw new InvalidCredentialsException("Invalid email or password");
        }
        ResidentLoginResponse loginResponse = new ResidentLoginResponse();
            loginResponse.setId(resident.getId());
            loginResponse.setFullName(resident.getFullName());
            loginResponse.setEmail(resident.getEmail());
            loginResponse.setMessage("Login successful");

            return loginResponse;
    }

    @Override
    public GenerateAccessCodeResponse generateAccessCode(GenerateAccessCodeRequest accessCodeRequest) {
        AccessCode accessCode = new AccessCode();
        accessCodeRequest.setAccessCode(AccessCodeUtil.generateToken().getCode());
        GenerateAccessCodeResponse accessCodeResponse = new GenerateAccessCodeResponse();
        accessCodeResponse.setAccessCode(accessCodeRequest.getAccessCode());

        return accessCodeResponse;
    }

    private void verifyNewEmail (String email){
        validateEmail(email);
        for (Resident resident : residentRepository.findAll()) {
            if (email.equals(resident.getEmail())) throw new DetailsAlreadyInUseException("Email already exists");
        }}

    private void validateEmail(String email){
        if (email == null || email.isBlank() || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidEmailException("Invalid email format");
        }}

    private void validatePhone(String phone) {
        if (phone == null || phone.isBlank() || !phone.matches("^0[7-9][0-1]\\d[- ]?\\d{3}[- ]?[0-9]{4}$")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }}

    private void verifyNewPhone(String phone){
        validatePhone(phone);
        for (Resident resident: residentRepository.findAll()) {
            if(phone.equals(resident.getPhone()))  throw new DetailsAlreadyInUseException("Phone already exists");
        }}

}
