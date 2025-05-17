/*
package assignmentTest.gateOneTest.bankeBankTest;

import assignments.gateOne.BankeBank.BankApp;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BankAppTest {

    private BankApp myBank;

    @BeforeEach
    public void setUp() {
        myBank = new BankApp();
    }

    @Test
    public void test_If_Bank_Can_Account_Can_deposit_money__depositMoney() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        myBank.depositMoney(accountNumber, 1_000);
        assertEquals(1_000, myBank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void test_If_Bank_Can_Account_Can_Deposit_Negative_Amount__Throws_Exception() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myBank.depositMoney(accountNumber, -1_000));
        assertEquals("Invalid amount", exception.getMessage());
    }

    @Test
    public void test_If_Bank_Can_Account_Can_Deposit_If_Not_Registered_Account__Throws_Exception() {
        myBank.registerUser("John", "Smith", "1234");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myBank.depositMoney("8568312340", -1_000));
        assertEquals("Account not found", exception.getMessage());
    }

    @Test
    public void test_If_Bank_Can_Withdraw_Money__withdrawMoney() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        myBank.depositMoney(accountNumber, 1_000);
        myBank.withdrawMoney(accountNumber, 500, "1234");
        assertEquals(500, myBank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void test_If_Bank_Can_Withdraw_Money_With_Invalid_Pin__Throws_Exception() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        myBank.depositMoney(accountNumber, 1_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myBank.withdrawMoney(accountNumber, 500, "1134"));
        assertEquals("Invalid pin", exception.getMessage());
    }

    @Test
    public void test_If_Bank_Can_Withdraw_Money_With_Invalid_AccountNumber___Throws_Exception() {
        String accountNumber  = myBank.registerUser("John", "Smith", "1234");
        myBank.depositMoney(accountNumber, 1_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myBank.withdrawMoney("123456789", 500, "1234"));
        assertEquals("Account not found", exception.getMessage());
    }

    @Test
    public void test_If_Bank_Can_Check_Balance__checkBalance() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        assertEquals(0, myBank.checkBalance(accountNumber, "1234"));
        myBank.depositMoney(accountNumber, 10_000);
        assertEquals(10_000, myBank.checkBalance(accountNumber, "1234"));
    }

    @Test
    public void test_If_Bank_Can_Check_Balance_With_Invalid_Pin__Throws_Exception() {
        String accountNumber = myBank.registerUser("John", "Smith", "1234");
        myBank.depositMoney(accountNumber, 1_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myBank.checkBalance(accountNumber,  "12a4"));
        assertEquals("Invalid pin", exception.getMessage());
    }

    @Test
    public void test_If_Bank_Can_Transfer_Money__transferMoney() {}

}

 */