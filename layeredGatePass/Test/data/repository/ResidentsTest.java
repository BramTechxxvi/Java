package data.repository;

import data.models.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

    class ResidentsTest {

        private Residents residents;
        @BeforeEach
        void setUp() {
            residents = new Residents();
        }

        @Test
        public void testThatResidentHasNotBeenAdded__countIsZero() {
            assertEquals(0, residents.count());
        }

        @Test
        public void saveResident__countIsOneTest() {
            Resident newResident = new Resident();
            residents.save(newResident);
            assertEquals(1, residents.count());
        }

        @Test
        public void saveResident__findByIdReturnsSavedResidentTest() {
            Resident newResident = new Resident();
            Resident savedResident = residents.save(newResident);
            Resident foundResident = residents.findById(savedResident.getId()).get();
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
            residents.save(firstResident);
            residents.save(secondResident);
            residents.save(thirdResident);
            assertEquals(2, residents.findAllByFullName("Ibrahim Lawal").size());
        }

        @Test
        public void saveResident__UpdateSavedResidentTest() {
            Resident newResident = new Resident();
            newResident.setFullName("GreyJoy");
            residents.save(newResident);
            Resident updateResident = new Resident();
            updateResident.setId(newResident.getId());
            updateResident.setFullName(newResident.getFullName());
            residents.save(updateResident);
            assertEquals("1", updateResident.getId());
            assertEquals(1, residents.count());
            assertEquals("GreyJoy", updateResident.getFullName());
        }

        @Test
        public void deleteAResidentWithId__deleteByIdTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            residents.save(firstResident);
            residents.save(secondResident);
            assertEquals(2, residents.count());
            residents.deleteById("2");
            assertEquals(1, residents.count());
        }

        @Test
        public void deleteAResident__deleteTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            residents.save(firstResident);
            residents.save(secondResident);
            residents.delete(firstResident);
            assertEquals(1, residents.count());
        }

        @Test
        public void deleteAllResidents__deleteAllTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            residents.save(firstResident);
            residents.save(secondResident);
            residents.deleteAll();
            assertEquals(0, residents.count());
        }

        @Test
        public void findAllResident__findAllTest() {
            Resident firstResident = new Resident();
            Resident secondResident = new Resident();
            residents.save(firstResident);
            residents.save(secondResident);
            List<Resident> allResident = residents.findAll();
            assertTrue(allResident.contains(firstResident));
            assertTrue(allResident.contains(secondResident));
        }

        @Test
        public void saveNewResident__findByEmailTest() {
            Resident newResident = new Resident();
            newResident.setFullName("Olabode Lawal");
            newResident.setEmail("123@fake.com");
            var savedResident = residents.save(newResident);
            var foundResident = residents.existByEmail(savedResident.getEmail()).get();
            assertEquals(savedResident, foundResident);
        }

    }
