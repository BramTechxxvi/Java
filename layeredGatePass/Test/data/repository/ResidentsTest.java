package data.repository;

import data.models.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ResidentsTest {

        private Residents resident;
        @BeforeEach
        void setUp() {
            resident = new Residents();
        }

        @Test
        public void testThatResidentHasNotBeenAdded__countIsZero() {
            assertEquals(0, resident.count());
        }

        @Test
        public void saveResident__countIsOneTest() {
            Resident newResident = new Resident();
            resident.save(newResident);
            assertEquals(1, resident.count());
        }

        @Test
        public void saveResident__findByIdReturnsSavedResidentTest() {
            Resident newResident = new Resident();
            Resident savedResident = resident.save(newResident);
            Resident foundResident = resident.findById(savedResident.getId()).get();
            assertEquals(savedResident, foundResident);
            assertEquals("1", savedResident.getId());
        }

        @Test
        public void saveThreeResident_findAllByFullName_Returns_SavedResident_WithSameNameTest() {
            Resident firstResident = new Resident();
            firstResident.setFullName("Olabode Lawal");
            Resident secondResident = new Resident();
            secondResident.setFullName("Ibrahim Lawal");
            Resident thirdResident = new Resident();
            thirdResident.setFullName("Ibrahim Lawal");
            resident.save(firstResident);
            resident.save(secondResident);
            resident.save(thirdResident);
            assertEquals(2, resident.findAllByFullName("Ibrahim Lawal").size());
        }

        @Test
        public void saveResident__UpdateSavedResidentTest() {
            Resident newResident = new Resident();
            newResident.setFullName("GreyJoy");
            resident.save(newResident);
            Resident updateResident = new Resident();
            updateResident.setId(newResident.getId());
            updateResident.setFullName(newResident.getFullName());
            assertEquals("1", updateResident.getId());
            assertEquals(1, resident.count());
            assertEquals("GreyJoy", updateResident.getFullName());
        }

        @Test
        public void deleteAResidentWithId__deleteByIdTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            resident.save(firstResident);
            resident.save(secondResident);
            assertEquals(2, resident.count());
            resident.deleteByid("2");
            assertEquals(1, resident.count());
        }

        @Test
        public void deleteAResident__deleteTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            resident.save(firstResident);
            resident.save(secondResident);
            resident.delete(firstResident);
            assertEquals(1, resident.count());
        }

        @Test
        public void deleteAllResidents__deleteAllTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            resident.save(firstResident);
            resident.save(secondResident);
            resident.deleteAll();
            assertEquals(0, resident.count());
        }

        @Test
        public void findAllResident__findAllTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            resident.save(firstResident);
            resident.save(secondResident);
            resident.findAll();
            assertTrue(resident.findAll().contains(firstResident));
            assertTrue(resident.findAll().contains(secondResident));
        }

    }
