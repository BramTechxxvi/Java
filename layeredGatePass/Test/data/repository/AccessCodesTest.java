package data.repository;

import data.models.AccessCode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccessCodesTest {

    private AccessCodes accessCodes;

    @BeforeEach
    void setUp() {
        accessCodes = new AccessCodes();
    }

    @Test
    public void accessCodeHasNotBeenCreated__countIsZeroTest() {
        assertEquals(0, accessCodes.count());
    }

    @Test
    public void saveNewAccessCode__countIsOneTest() {
        AccessCode newAccessCode = new AccessCode();
        accessCodes.save(newAccessCode);
        assertEquals(1, accessCodes.count());
    }

    @Test
    public void deleteAnAccessCode__deleteAccessCodeTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        accessCodes.delete(firstAccessCode);
        assertEquals(1, accessCodes.count());
    }

    @Test
    public void deleteAnAccessCodeWithId__deleteByIdTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        accessCodes.deleteById("1");
        assertEquals(1, accessCodes.count());
    }

    @Test
    public void deleteAllAccessCodes__deleteAllTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        accessCodes.deleteAll();
        assertEquals(0, accessCodes.count());
    }

    @Test
    public void updateAccessCode__updateAccessCodeTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        AccessCode updatedAccessCode = new AccessCode();
        updatedAccessCode.setId(firstAccessCode.getId());
        accessCodes.save(updatedAccessCode);
        assertEquals(2 , accessCodes.count());
    }

    @Test
    public void findAnAccessCode__findByIdTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        AccessCode found = accessCodes.findById(firstAccessCode.getId()).get();
        assertEquals("1", found.getId());
        assertEquals(2 , accessCodes.count());
    }

    @Test
    public void findAllAccessCodes__findAllTest() {
        AccessCode firstAccessCode = new AccessCode();
        AccessCode secondAccessCode = new AccessCode();
        accessCodes.save(firstAccessCode);
        accessCodes.save(secondAccessCode);
        List<AccessCode> allAccessCodes = accessCodes.findAll();
        assertTrue(allAccessCodes.contains(firstAccessCode));
        assertTrue(allAccessCodes.contains(secondAccessCode));

    }

}