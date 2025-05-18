package assignments.diary;
import java.util.ArrayList;
public class Diaries {

    private final ArrayList<Diary> diaries;

    public Diaries() { diaries = new ArrayList<>(); }

    public void add(Diary diary) { diaries.add(diary);}

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getUserName().equals(username)) return diary;
        } return null;
    }

    public void delete(Diary diary) { diaries.remove(diary); }

}
