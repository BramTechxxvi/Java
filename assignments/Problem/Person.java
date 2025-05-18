package assignments.Problem;
import java.util.ArrayList;
import java.util.List;

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
        for (Problem problem : problems) if (problem.equals(prob)) problem.solve();
    }

    public int unSolvedProblems() {
        List<Problem> unSolvedProblems = new ArrayList<>();
        for (Problem problem : problems) {
            if (problem.isSolved()) unSolvedProblems.add(problem);
        }
        return unSolvedProblems.size();
    }
}