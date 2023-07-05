import Activities.BankAccount;
import Activities.NotEnoughFundsException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    @DisplayName("Test 1 - Not enough Funds")
    void notEnoughFunds(){
        //Create an object of bankAccount Class
        BankAccount account=new BankAccount(9);

        //Assertion for exception
        assertThrows(NotEnoughFundsException.class,() -> account.withdraw(10));
    }

    @Test
    @DisplayName("Test 2 - Enough funds!!")
    void enoughFunds(){
        //Create an object of bankaccount Class
        BankAccount account=new BankAccount(100);

        //Assertions for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}
