package assignments.gateOne;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {

    private String name;
    private int periodLength;
    private int cycleLength;

    public MenstrualApp() {
        this.name = name;
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
    public void getPeriodLength(int startDay, int month) {
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month);
        int startDate = myCalendar.get(Calendar.DATE);
        myCalendar.add(Calendar.DAY_OF_MONTH, periodLength);
        int endDate = myCalendar.get(Calendar.DATE);
        System.out.println(startDate + " - " + endDate);
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        MenstrualApp myPeriod = new MenstrualApp();
        System.out.println("====== Menstrual Flow Tracker Application ======");
        int startDay;
        int month;
        do {
            System.out.print("Enter start day: ");
            startDay = userInput.nextInt();
        }while(startDay <1 || startDay > 31);
        do {
            System.out.print("Enter month: ");
            month = userInput.nextInt();
        }while(month <1 || month > 12);
        myPeriod.getPeriodLength(startDay, month);

    }
}
