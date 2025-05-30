package services;

import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.request.RegisterResidentRequest;
import dtos.request.ResidentLoginRequest;
import dtos.response.RegisterResidentResponse;
import exceptions.InvalidEmailException;
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
        request.setPhone("09012345678");
        request.setEmail("adedeji@fake.com");
        request.setHashedPassword(PasswordUtil.hashPassword("12345"));
        System.out.println(request.getHashedPassword());
        RegisterResidentResponse response = residentServices.register(request);
        assertNotNull(response);
        assertEquals("1", response.getId());
        assertEquals("Registration successful", response.getMessage());
    }

    @Test
    public void registerNewResidentWithInvalidEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setEmail("adedeji@f_ake_.com");
        request.setPhone("0908736672");
        request.setHashedPassword("hashedPassword");
        Exception exception = assertThrows(InvalidEmailException.class, () -> residentServices.register(request));
        assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    public void registerNewResidentWithNoEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main street");
        request.setEmail(" ");
        request.setPhone("0908736672");
        request.setHashedPassword("hashedPassword");
        Exception error = assertThrows(InvalidEmailException.class, () -> residentServices.register(request));
        assertEquals("Invalid email format", error.getMessage());
    }

    @Test
    public void registerNewResidentWithInvalidPhone__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setPhone("0123456789");
    }

    @Test
    public void residentCabLoginAfterRegister__loginResidentTest() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setEmail("Ola123@fake.com");
        request.setPhone("0908976787");
        request.setHashedPassword("");
    }
}