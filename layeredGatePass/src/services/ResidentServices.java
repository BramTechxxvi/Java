package services;

import dtos.request.ResidentLoginRequest;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;

public interface ResidentServices {

    RegisterResidentResponse register(RegisterResidentRequest request);

    RegisterResidentResponse login (ResidentLoginRequest loginRequest);
}
