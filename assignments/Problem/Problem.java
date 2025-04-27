package assignments.Problem;
public class Problem {

    private String name;
    private ProblemType type;
    private boolean isSolved;
    private String id;


    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;
        this.isSolved = false;
        this.id = generateId(type);
    }
    public void solve() { this.isSolved = true; }

    public boolean isSolved() { return isSolved; }

    public String getName() { return name; }

    public ProblemType getType() { return type; }

    private String generateId(ProblemType problem) {
        int counter = 000;
        String id = "";
        if (problem == ProblemType.FINANCIAL) id = "FIN" + Integer.toString(counter++);
        if (problem == ProblemType.SPIRITUAL) id = "SPR" + Integer.toString(counter++);
        if (problem == ProblemType.EDUCATIONAL) id = "EDU" + Integer.toString(counter++);
        if (problem == ProblemType.BUSINESS) id = "BUS" + Integer.toString(counter++);
        if (problem == ProblemType.TECHNICAL) id = "TECH" + Integer.toString(counter++);
        return id;
    }

    @Override
    public String toString() {
        return "Problem [name=" + name + ", type=" + type + "]";
    }
}