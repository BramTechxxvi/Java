package assignments.gateOne;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {

    private String name;
    private int periodLength;
    private int cycleLength;
    private int startDay;

    public MenstrualApp() {
        this.name = name;
        this.startDay = startDay;
        this.periodLength = 6;
    }
    public String getUserDetails(String name) {
        if (!name.matches("^[A-Za-z]+$")) {
            System.out.println("Invalid name!");
        } this.name = name;
        return this.name;
    }
    public void getNextCycleDay () {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.add(Calendar.DAY_OF_MONTH, periodLength);

    }
    public void getSafePeriod() {

    }
    public void getPeriodLength() {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.add(Calendar.DAY_OF_MONTH, +this.periodLength);
        System.out.println(myCalendar.get(Calendar.DATE));
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        MenstrualApp myPeriod = new MenstrualApp();
        System.out.println("====== Menstrual Flow Tracker Application ======");
        System.out.print("Enter start day: ");
        String startDay = userInput.nextLine();
        myPeriod.getPeriodLength();

    }
}
