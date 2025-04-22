package assignments.diary;
import java.time.LocalDateTime;
public class Entry {

    private final int id;
    private String title;
    private String body;
    private final LocalDateTime dateCreated;

    public Entry(int id, String title, String body) {
        this.id =  id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setTitle() {
        this.title = title;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setBody() { this.body = body; }

    public String toString() {
        return "Entry ID: " + id + "\nTitle: " + title + "\nBody: " + body;
    }

}
