package assignments.Problem;
public class Problem {

    private String name;
    private String description;
    private ProblemType type;
    private boolean isSolved;
    private int id;


    public Problem(String name, String description, ProblemType type) {
        if (name.matches("^\\s*$") || description.matches("^\\s*$") || type == null) {
            throw new IllegalArgumentException("Field cannot be empty");
        }
        this.name = name;
        this.description = description;
        this.type = type;
        this.isSolved = false;
        this.id = 0;
    }
    public void solve() { this.isSolved = true; }

    public boolean isSolved() { return isSolved; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public ProblemType getType() { return type; }

    private String generateId(ProblemType problem) {
        int counter = this.id++;
        String id = "";
        if (problem == ProblemType.FINANCIAL) id = "FIN" + Integer.toString(counter);
        if (problem == ProblemType.SPIRITUAL) id = "SPR" + Integer.toString(counter);
        if (problem == ProblemType.EDUCATIONAL) id = "EDU" + Integer.toString(counter);
        if (problem == ProblemType.BUSINESS) id = "BUS" + Integer.toString(counter);
        if (problem == ProblemType.TECHNICAL) id = "TECH" + Integer.toString(counter);
        return id;
    }

    @Override
    public String toString() {
        return "Problem [name=" + name + ", description=" + description + ", type=" + type;
    }
}