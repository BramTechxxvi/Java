package utils;

import data.models.Resident;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;

import static utils.PasswordUtil.hashPassword;

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


}
