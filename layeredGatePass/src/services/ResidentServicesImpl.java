package services;

import data.models.Resident;
import data.repository.ResidentRepository;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;


public class ResidentServicesImpl implements ResidentServices {
    private ResidentRepository residentRepository;

    public ResidentServicesImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public RegisterResidentResponse register(RegisterResidentRequest request) {
        verifyEmail(request.getEmail());
        Resident resident = new Resident();
        resident.setFullName(request.getFullName());
        resident.setEmail(request.getEmail());
        resident.setPhone(request.getPhone());
        resident.setAddress(request.getAddress());
        Resident savedResident = residentRepository.save(resident);

        RegisterResidentResponse response = new RegisterResidentResponse();
        response.setFullName(savedResident.getFullName());
        response.setEmail(savedResident.getEmail());
        response.setPhone(savedResident.getPhone());
        response.setAddress(savedResident.getAddress());
        response.setId(savedResident.getId());

        return response;
    }

    private void verifyEmail(String email) {
        if (email == null || email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        for (Resident resident : residentRepository.findAll()) {
            if (email.equals(resident.getEmail())) throw new IllegalArgumentException("Email already exists");
        }
    }

    private void verifyPhone(String phone) {}


}
