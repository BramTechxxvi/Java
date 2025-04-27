package assignments.Problem;
public class Problem {

    private String name;
    private ProblemType type;
    private boolean isSolved;
    private int id;


    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
        this.id = -1;
    }
    public void solve() { this.isSolved = true; }

    public boolean isSolved() { return isSolved; }

    public String getName() { return name; }

    public ProblemType getType() { return type; }

    @Override
    public String toString() {
        return "Problem [name=" + name + ", type=" + type + "]";
    }
}