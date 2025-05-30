package services;

import dtos.request.ResidentLoginRequest;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;
import dtos.response.ResidentLoginResponse;

public interface ResidentServices {

    RegisterResidentResponse register(RegisterResidentRequest request);

    ResidentLoginResponse login (ResidentLoginRequest loginRequest);
}
