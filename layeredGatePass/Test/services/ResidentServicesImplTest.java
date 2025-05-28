package services;

import data.repository.ResidentRepository;
import data.repository.Residents;
import dtos.request.RegisterResidentRequest;
import dtos.response.RegisterResidentResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResidentServicesImplTest {

    private ResidentRepository residentRepository;
    private ResidentServices residentServices;

    @BeforeEach
    void setUp() {
        residentRepository = new Residents();
        residentServices = new ResidentServicesImpl(residentRepository);
    }

    @Test
    public void registerNewResident__registerResidentTest() {
        RegisterResidentRequest request = new RegisterResidentRequest();
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setPhone("09012345678");
        request.setEmail("adedeji@fake.com");
        RegisterResidentResponse response = residentServices.register(request);
        assertNotNull(response);
        assertEquals("1", response.getId());
    }

    @Test
    public void registerNewResidentWithInvalidEmail__throwsException() {
        RegisterResidentRequest request = new RegisterResidentRequest();
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main Street");
        request.setEmail("adedeji@f_ake.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> residentServices.register(request));
        assertEquals(exception.getMessage(), "Invalid email");
    }

    @Test
    public void registerNewResidentWithNoEmail__throwsException() {
        RegisterResidentRequest request = new RegisterResidentRequest();
        request.setFullName("Adedeji Ibrahim");
        request.setAddress("123 Main street");
        request.setEmail(" ");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> residentServices.register(request));
        assertEquals(exception.getMessage(), "Invalid email");
    }
}