package assignments.Problem;
public class Problem {

    private String name;
    private String description;
    private final ProblemType type;
    private boolean isSolved;


    public Problem(String name, String description, ProblemType type) {
        if (name.matches("^\\s*$") || description.matches("^\\s*$") || type == null) {
            throw new IllegalArgumentException("Field cannot be empty");
        }
        this.name = name;
        this.description = description;
        this.type = type;
        this.isSolved = false;
    }

    public void solve() { this.isSolved = true; }

    public boolean isSolved() { return isSolved; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public ProblemType getType() { return type; }

    @Override
    public String toString() {
        return "Problem [name=" + name + ", description=" + description + ", type=" + type;
    }
}