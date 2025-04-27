package assignments.Problem;
import java.util.ArrayList;
public class Person {

    private String name;
    private ArrayList<Problem> myProblems;

    public Person(String name) {
        this.name = name;
        this.myProblems = new ArrayList<>();
    }
    public String getName() { return name; }

    public int getSize() { return myProblems.size(); }

}