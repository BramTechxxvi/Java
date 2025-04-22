package assignments.diary;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> myEntries = new ArrayList<>();
    private int id;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = true;
        this.id = 1;
    }
    public void unLockDiary(String password) {
        if (this.password.equals(password)) isLocked = false;
        else throw new IllegalArgumentException("Incorrect password");
    }
    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String entryTitle, String entryBody) {
        if (!isLocked) {
            int entryId = this.id++;
            Entry newEntry = new Entry(entryId, entryTitle, entryBody);
            myEntries.add(newEntry);
        }
    }
    public Entry findEntryById(int entryId) {
        if (!isLocked) {
        for (Entry entry : myEntries) {
            if (entry.getId() == entryId) return entry;
        } throw new IllegalArgumentException("Entry not found");
        } throw new IllegalArgumentException("Diary is Locked");
    }

}
