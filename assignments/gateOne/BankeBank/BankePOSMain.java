package assignments.gateOne.BankeBank;
import java.util.Scanner;
public class BankePOSMain {

    public static void main(String[] args) {

        print("<<<<<< Welcome to the BankeAtm App >>>>>>");
        int option = 0;
        int bankServices;
        while (true) {
            print(getMenu());
            try {
                option = Integer.parseInt(input("Select an option: "));
                if (option < 1 || option > 3) throw new Exception("Invalid option...Try again");
            } catch (Exception e) {
                print("Invalid option");
            }
            switch (option) {
                case 1:
                    print("Create an account.......");
                    continue;
                case 2:
                    while (true) {
                        print(getBankServices());
                        try {
                            bankServices = Integer.parseInt(input("Select an Option: "));
                            if (bankServices < 1 || bankServices > 7)
                                throw new Exception("Invalid option... Try again");
                        } catch (Exception e) {
                            print("Invalid option... Try again");
                            continue;
                        }
                        switch (bankServices) {
                            case 1:
                                System.out.print("Deposit money......");
                                continue;
                            case 2:
                                System.out.print("Withdraw money......");
                                continue;
                            case 3:
                                print("Check account balance......");
                                continue;
                            case 4:
                                print("Transfer money......");
                                continue;
                            case 5:
                                print("Close account ......");
                                continue;
                            case 6:
                                print("Change Pin ......");
                                continue;
                            case 7:
                                print("Exiting...");
                        }
                        break;
                    }
                case 3:
                    print("Thank You For Banking With Us");
                    break;
            }
            break;
        }
    }

    public static String getMenu() {
        return "\n1. Create Account \n2. Bank Services \n3. Exit";
    }

    public static String input(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(prompt);
        return userInput.nextLine();
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static String getBankServices() {
        return "\tBank Services \n1. Deposit money \n2. Withdraw money \n3. Check account balance \n4. Transfer money \n5. Close account \n6. Change Pin \n7. Exit";
    }



}