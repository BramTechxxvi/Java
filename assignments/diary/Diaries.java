package assignments.diary;
import java.util.ArrayList;
public class Diaries {

    private ArrayList<Diary> diaries;

    public Diaries() { diaries = new ArrayList<Diary>(); }

    public void add(Diary diary) { diaries.add(diary);}

    public void findByUsername(String username) {}

    public void delete(Diary diary) { diaries.remove(diary); }

}
