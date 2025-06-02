package services;

import dtos.request.GenerateAccessCodeRequest;
import dtos.request.ResidentLoginRequest;
import dtos.request.RegisterResidentRequest;
import dtos.response.GenerateAccessCodeResponse;
import dtos.response.RegisterResidentResponse;
import dtos.response.ResidentLoginResponse;

public interface ResidentServices {

    RegisterResidentResponse register(RegisterResidentRequest request);

    ResidentLoginResponse login (ResidentLoginRequest loginRequest);

    GenerateAccessCodeResponse generateAccessCode(GenerateAccessCodeRequest accessCodeRequest);
}
