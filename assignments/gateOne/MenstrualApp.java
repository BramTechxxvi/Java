package assignments.gateOne;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MenstrualApp {

    private String name;
    private final int periodLength;
    private final int cycleLength;
    private final Calendar myCalendar = Calendar.getInstance();
    private final SimpleDateFormat date = new SimpleDateFormat("dd MMM yyyy");

    public MenstrualApp() {
        this.name = name;
        this.periodLength = 5;
        this.cycleLength = 28;
    }
    public String getUserDetails(String name) {
        if (!name.matches("^[A-Za-z]+$")) {
            System.out.println("Invalid name!");
        } this.name = name;
        return this.name;
    }
    public String getFlowPeriod(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        Date startDate = myCalendar.getTime();
        myCalendar.add(Calendar.DAY_OF_MONTH, + periodLength);
        Date endDate = myCalendar.getTime();
        return "Your flow period is between " +date.format(startDate)+" and " + date.format(endDate);
    }
    public String getSafePeriod(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        myCalendar.add(Calendar.DAY_OF_MONTH, + periodLength);
        Date startDate = myCalendar.getTime();
        myCalendar.add(Calendar.DAY_OF_MONTH, + 4);
        Date endDate = myCalendar.getTime();
        return "Your safe period is between " +date.format(startDate)+" and " + date.format(endDate);
    }
    public String getSecondSafePeriod(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        myCalendar.add(Calendar.DAY_OF_MONTH, + periodLength);
        Date startDate = myCalendar.getTime();
        myCalendar.add(Calendar.DAY_OF_MONTH, + 4);
        Date endDate = myCalendar.getTime();
        return "Your second safe period is between " +date.format(startDate)+" and " + date.format(endDate);
    }
    public String getFerTileWindow(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        myCalendar.add(Calendar.DAY_OF_MONTH, +9);
        Date startDate = myCalendar.getTime();
        myCalendar.add(Calendar.DAY_OF_MONTH, + 6);
        Date endDate = myCalendar.getTime();
        return "Your fertile window period is between " +date.format(startDate) + " and " + date.format(endDate);
    }
    public String getOvulationPeriod(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        myCalendar.add(Calendar.DAY_OF_MONTH, + 14);
        Date ovulationDay = myCalendar.getTime();
        return "Your ovulation day is "+date.format(ovulationDay);
    }
    public String getNextCycleDate(int startDay, int month) {
        myCalendar.set(Calendar.DAY_OF_MONTH, startDay);
        myCalendar.set(Calendar.MONTH, month - 1);
        myCalendar.add(Calendar.DAY_OF_MONTH, +cycleLength);
        Date cycleDate = myCalendar.getTime();
        return "Your next cycle day is "+date.format(cycleDate);
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
        System.out.printf("""
        %s%n%s%n%s%n%s%n%s%n%s
        """,  myPeriod.getFlowPeriod(startDay, month), myPeriod.getSafePeriod(startDay, month), myPeriod.getSecondSafePeriod(startDay, month), myPeriod.getFerTileWindow(startDay, month),myPeriod.getOvulationPeriod(startDay, month),  myPeriod.getNextCycleDate(startDay, month));
    }}