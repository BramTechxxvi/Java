package assignments.diary.test;
import assignments.diary.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiaryTest {

    private Diary diaryApp;
    @BeforeEach
    public void setUp() {
        diaryApp = new Diary("Lola123", "password123");

    }

    @Test
    public void test_If_Diary_Can_Unlock__unlockDiary() {
        diaryApp.unLockDiary("password123");
        assertFalse(diaryApp.isLocked());
    }

    @Test
    public void test_If_Diary_Can_Unlock_With_Incorrect_Password__Throws_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diaryApp.unLockDiary("lola123"));
        assertEquals("Incorrect password", exception.getMessage());
        assertTrue(diaryApp.isLocked());
    }

    @Test
    public void test_If_Diary_Can_Lock__lockDiary() {
        diaryApp.lockDiary();
        assertTrue(diaryApp.isLocked());
    }

    @Test
    public void test_If_Diary_Can_Create_Entry__createEntry() {
        diaryApp.unLockDiary("password123");
        String entryTitle = "Friday activities";
        String entryBody = "School, read, eat, relax, sleep";
        diaryApp.createEntry(entryTitle, entryBody);
        assertEquals(1, diaryApp.findEntryById(1).getId());
    }

    @Test
    public void test_If_Diary_Can_Find_Entry__findEntryById() {
        diaryApp.unLockDiary("password123");
        String entryTitle = "Likes";
        String entryBody = "Phone, food, tennis, money, luxury";
        diaryApp.createEntry(entryTitle, entryBody);
        assertEquals(1, diaryApp.findEntryById(1).getId());
    }

    @Test
    public void test_if_Diary_Can_Find_Entry_When_Locked__Throws_Exception() {

        String entryTitle = "Friday activities";
        String entryBody = "School, read, eat, relax, sleep";
        diaryApp.createEntry(entryTitle, entryBody);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> diaryApp.findEntryById(1));
        assertEquals("Diary is locked", exception.getMessage());
    }

}
