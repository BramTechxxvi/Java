package assignments.diary;

import java.time.LocalDateTime;

public class Entry {

    private int id;
    private String title;
    private String body;
    private final LocalDateTime dateCreated;

    public Entry(int id, String title, String body) {
        this.id =  id;
        this.title = title;
        this.body = body;
        this.dateCreated = LocalDateTime.now();
    }

    public int generateId() {
        return id++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String getBody() { return body; }

    public static void main(String...  args) {
        Entry test = new Entry(1, "Test", "Test");
        System.out.print(test.getDateCreated());
        System.out.println(test.getId());
        System.out.println(test.getTitle());
    }

}
