package assignments.Problem;
import java.util.ArrayList;
public class Person {

    private String name;
    private ArrayList<Problem> problems;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
    }
    public String getName() { return name; }

    public int getSize() { return problems.size(); }

    public void addProblem(Problem problem) { problems.add(problem); }

    public void solveProblem(Problem prob) {
        for (Problem problem : problems) {
            if (problem.equals(prob)) problem.solve();
        }
    }

    public ArrayList<Problem> unSolvedProblems() {
        ArrayList<Problem> unSolved = new ArrayList<>();
        for (Problem problem : problems) {
            if (!problem.isSolved()) unSolved.add(problem);
        } return unSolved;
    }
}