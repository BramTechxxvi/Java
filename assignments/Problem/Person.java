package assignments.Problem;
import java.util.ArrayList;
public class Person {

    private String name;
    private ArrayList<Problem> problems;
    private int id;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
        this.id = 1;
    }
    public String getName() { return name; }

    public int getSize() { return problems.size(); }

    public void addProblem(Problem problem) { problems.add(problem); }

    public void solveProblem(Problem prob) {
        for (Problem problem : problems) if (problem.equals(prob)) problem.solve();
    }

    public int unSolvedProblems() {
        ArrayList<Problem> unSolved = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) unSolved.add(problem);
        } return unSolved.size();
    }
}