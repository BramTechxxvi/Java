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
        Resident resident = new Resident();
        resident.setFullName(request.getFullName());
        resident.setEmail(request.getEmail());
        verifyEmail(request.getEmail());
        resident.setPhone(request.getPhone());
        verifyPhone(request.getPhone());
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

    private String verifyEmail(String email) {
        if (email == null || email.isEmpty()) {
        for (Resident resident : residentRepository.findAll()) {
            if (!resident.getEmail().equals(email)) return email;
        }
    }

    private String verifyPhone(String phone) {}
}
