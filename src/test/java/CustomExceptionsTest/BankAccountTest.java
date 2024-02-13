package CustomExceptionsTest;

import CustomExceptions.BankAccount;
import CustomExceptions.InsufficientFundsException;
import CustomExceptions.InvalidWithdrawalException;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    BankAccount account = new BankAccount(1000);
    @Test
    public void testSuccessfulWithdrawal() {

        try {
            account.withdraw(500);
            assertEquals(500.0, account.getBalance());
        } catch (InsufficientFundsException | InvalidWithdrawalException e) {
            fail("Exception not expected");
        }
    }

    @Test
    public void testInsufficientFundsException() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(1500));
        assertEquals(1000.0, account.getBalance()); // Balance should remain unchanged
    }

    @Test
    public void testInvalidWithdrawalException() {
        BankAccount account = new BankAccount(1000);
        assertThrows(InvalidWithdrawalException.class, () -> account.withdraw(-200));
        assertEquals(1000.0, account.getBalance()); // Balance should remain unchanged
    }
}
