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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {return title;}

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setBody(String body) { this.body = body; }

    public String getBody() {return body;}

    public String toString() {
        return "Entry ID: " + id + "\nTitle: " + title + "\nBody: " + body;
    }

}
