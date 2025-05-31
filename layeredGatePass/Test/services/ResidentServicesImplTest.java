package services;

import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.request.RegisterResidentRequest;
import dtos.request.ResidentLoginRequest;
import dtos.response.RegisterResidentResponse;
import dtos.response.ResidentLoginResponse;
import exceptions.InvalidEmailException;
import exceptions.InvalidPhoneNumberException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.PasswordUtil;

import static org.junit.jupiter.api.Assertions.*;

class ResidentServicesImplTest {

    private ResidentRepository residentRepository;
    private ResidentServices residentServices;
    private RegisterResidentRequest request;
    private ResidentLoginRequest loginRequest;

    @BeforeEach
    void setUp() {
        residentRepository = new Residents();
        residentServices = new ResidentServicesImpl(residentRepository);
        request = new RegisterResidentRequest();
        loginRequest = new ResidentLoginRequest();
    }

    @Test
    public void registerNewResident__registerResidentTest() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setPhone("0901 234-5678");
        request.setEmail("adedeji@fake.com");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        RegisterResidentResponse response = residentServices.register(request);
        assertNotNull(response);
        assertEquals("1", response.getId());
        assertEquals(1, residentRepository.count());
        assertEquals("Registration successful", response.getMessage());
    }

    @Test
    public void registerNewResidentWithInvalidEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setEmail("adedeji@fake..c_om");
        request.setPhone("0908 736 1672");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        Exception exception = assertThrows(InvalidEmailException.class, () -> residentServices.register(request));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    public void registerNewResidentWithNoEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main street");
        request.setEmail(" ");
        request.setPhone("0908-736 1672");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        Exception error = assertThrows(InvalidEmailException.class, () -> residentServices.register(request));
        assertEquals("Invalid email format", error.getMessage());
    }

    @Test
    public void registerNewResidentWithInvalidPhone__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setPhone("0123456789");
        request.setEmail("123@fake.com");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        Exception error = assertThrows(InvalidPhoneNumberException.class, () -> residentServices.register(request));
        assertEquals("Invalid phone number", error.getMessage());
    }

    @Test
    public void registerNewResidentWithoutPhoneNumber__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setPhone(" ");
        request.setEmail("123@fake.com");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        Exception error = assertThrows(InvalidPhoneNumberException.class, () -> residentServices.register(request));
        assertEquals("Invalid phone number", error.getMessage());
    }

    @Test
    public void residentCanLoginAfterRegister__loginResidentTest() {
        registerNewResident__registerResidentTest();
        loginRequest.setEmail(request.getEmail());
        loginRequest.setPassword(request.getHashedPassword());
        ResidentLoginResponse loginResponse = residentServices.login(loginRequest);
        assertNotNull(loginResponse);

    }
}