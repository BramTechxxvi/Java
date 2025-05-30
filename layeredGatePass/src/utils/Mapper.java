package utils;

import data.models.Resident;
import dtos.request.RegisterResidentRequest;
import dtos.request.ResidentLoginRequest;
import dtos.response.RegisterResidentResponse;
import dtos.response.ResidentLoginResponse;

import static utils.PasswordUtil.hashPassword;
import static utils.PasswordUtil.verifyPassword;

public class Mapper {

    public static Resident map(RegisterResidentRequest request) {
        Resident resident = new Resident();
        resident.setFullName(request.getFullName());
        resident.setEmail(request.getEmail());
        resident.setPhone(request.getPhone());
        resident.setAddress(request.getAddress());
        resident.setHashedPassword(hashPassword(request.getHashedPassword()));
        return resident;
    }

    public static RegisterResidentResponse map(Resident resident) {
        RegisterResidentResponse response = new RegisterResidentResponse();
        response.setId(resident.getId());
        response.setMessage("Registration successful");
        return response;
    }

    //public static Resident map(ResidentLoginRequest loginRequest) {
  //      for (Resident resident : residentRepository.findAll()) {
  //          if (!loginRequest.getEmail().equals(resident.getEmail()) && verifyPassword(loginRequest.getPassword(), resident.getHashedPassword())) {
    }


//}
