package assignments.gateOne.BankeBank.test;
import assignments.gateOne.BankeBank.Account;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AccountTest {

    private Account myAccount;
    @BeforeEach
    public void setUp() {
        myAccount = new Account("Ade", "Banke", "1234567890", "1111");
    }

    @Test
    public void test_If_Account_Has_Balance__getBalance() {
        assertEquals(0, myAccount.getBalance("1111"));
    }
    @Test
    public void testIfAccountHasBalanceWithInvalidPin__Throws_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.getBalance("111w"));
        assertEquals("Invalid pin", exception.getMessage());
    }

    @Test
    public void test_If_Account_Can_Deposit__deposit() {
        myAccount.deposit(1_000);
        assertEquals(1_000, myAccount.getBalance("1111"));
    }

    @Test
    public void test_If_Account_Can_Deposit_Negative_Amount__Throws_Exception() {
        myAccount.deposit(8_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.deposit(-1_000));
        assertEquals("Invalid amount", exception.getMessage());
        assertEquals(8_000, myAccount.getBalance("1111"));
    }

    @Test
    public void test_If_Account_Can_Withdraw__withdraw() {
        myAccount.deposit(1_000);
        myAccount.withdraw(800, "1111");
        assertEquals(200, myAccount.getBalance("1111"));
    }

    @Test
    public void test_If_Account_Can_Withdraw_5k_From_3k_Balance__Throws_Exception() {
        myAccount.deposit(3_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(5_000, "1111"));
        assertEquals("Insufficient funds", exception.getMessage());
        assertEquals(3_000, myAccount.getBalance("1111"));
    }

    @Test
    public void test_If_Account_Can_Withdraw_Negative_Amount__Throws_Exception() {
        myAccount.deposit(8_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(-1_000, "1111"));
        assertEquals("Invalid amount", exception.getMessage());
    }

    @Test
    public void test_If_Account_Can_Withdraw_With_InvalidPin__Throws_Exception() {
        myAccount.deposit(2_000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.withdraw(1_000, "1w31"));
        assertEquals("Invalid pin", exception.getMessage());
    }

    @Test
    public void test_If_Account_Can_Get_Account_Name__getAccountName() {
        assertEquals("Ade Banke", myAccount.getAccountName());
    }

    @Test
    public void test_If_Account_Can_Change_Pin__changePin() {
        myAccount.changePin("1111", "1234");
        assertTrue(myAccount.verifyPin("1234"));
    }

    @Test
    public void test_If_Account_Can_Change_Pin_With_Wrong_OldPin__Throws_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.changePin("1121", "1234"));
        assertEquals("Incorrect old pin", exception.getMessage());
    }

    @Test
    public void test_If_Account_Can_Change_Pin_With_InvalidPin__Throws_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.changePin("1111", "1]3a"));
        assertEquals("Invalid new pin", exception.getMessage());
    }

    @Test
    public void test_If_Account_Can_Change_Pin_With_Same_OldPin__Throws_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myAccount.changePin("1111", "1111"));
        assertEquals("Cannot use previous pin as new pin", exception.getMessage());
    }
}
