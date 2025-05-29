package services;

import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.request.RegisterResidentRequest;
import dtos.request.ResidentLoginRequest;
import dtos.response.RegisterResidentResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        RegisterResidentResponse response = residentServices.register(request);
        assertNotNull(response);
        assertEquals("1", response.getId());
        assertEquals("Registration Successful", response.getMessage());
    }

    @Test
    public void registerNewResidentWithInvalidEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setEmail("adedeji@f_ake.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> residentServices.register(request));
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    public void registerNewResidentWithNoEmail__throwsException() {
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main street");
        request.setEmail(" ");
        Exception error = assertThrows(IllegalArgumentException.class, () -> residentServices.register(request));
        assertEquals("Invalid email", error.getMessage());
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