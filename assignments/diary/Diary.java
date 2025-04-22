package assignments.diary;

import java.util.ArrayList;

public class Diary {

    private String userName;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> myEntries = new ArrayList<>();
    private int entryId;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.isLocked = true;

        this.entryId = 1;
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
            int entryId = this.entryId++;
            Entry newEntry = new Entry(entryId, entryTitle, entryBody);
            myEntries.add(newEntry);
        } else throw new IllegalArgumentException("Diary is locked");
    }

    public void deleteEntry(int entryId) {
        if (!isLocked) {
            for (int entry = 0; entry < myEntries.size(); entry++) {
                if (myEntries.get(entry).getId() == entryId) myEntries.remove(entry);
                break;
            }
        }
    }

    public Entry findEntryById(int entryId) {
        if (!isLocked) {
        for (Entry entry : myEntries) {
            if (entry.getId() == entryId) return entry;
        } throw new IllegalArgumentException("Entry not found");
        } throw new IllegalArgumentException("Diary is locked");
    }
    public int getEntrySize() {
        return myEntries.size();
    }

    public void updateEntry(int id, String title, String body) {
        if(!isLocked) {
            Entry entryToUpdate = findEntryById(id);
            entryToUpdate.setTitle(title);
            entryToUpdate.setBody(body);
        }
    }
}
