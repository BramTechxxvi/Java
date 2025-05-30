package services;

import data.models.Resident;
import data.repository.ResidentRepository;
import dtos.request.ResidentLoginRequest;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;
import exceptions.InvalidEmailException;
import exceptions.InvalidPhoneNumberException;
import utils.Mapper;


public class ResidentServicesImpl implements ResidentServices {

    private ResidentRepository residentRepository;

    public ResidentServicesImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public RegisterResidentResponse register(RegisterResidentRequest request) {
        verifyNewEmail(request.getEmail());
        Resident resident = Mapper.map(request);
        Resident savedResident = residentRepository.save(resident);

        return Mapper.map(savedResident);
    }

    @Override
    public RegisterResidentResponse login(ResidentLoginRequest loginRequest) {
        validateEmail(loginRequest.getEmail());
        for (Resident resident : residentRepository.findAll()) {

        }return null;
    };


    private void verifyNewEmail (String email){
        validateEmail(email);
        for (Resident resident : residentRepository.findAll()) {
            if (email.equals(resident.getEmail())) throw new IllegalArgumentException("Email already exists");
        }
    }

    private void validateEmail(String email){
        if (email == null || email.isBlank() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidEmailException("Invalid email format");
        }
    }

    private void validatePhone(String phone) {
        if (phone == null || phone.isBlank() || !phone.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }
    }

    private void verifyNewPhone(String phone){}

}
