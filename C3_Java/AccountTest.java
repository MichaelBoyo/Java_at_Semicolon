package C3_Java;
import java.util.Scanner;
public class AccountTest {
    public static void main(String... args) {

            Account account1 = new Account("Michael Boyo", 1000);
            Account account2 = new Account("eden", 300);

           displayAccount(account1);
           displayAccount(account2);

           setDeposit(account1);
           setDeposit(account2);

           displayAccount(account1);
           displayAccount(account2);
        }
        public static void displayAccount(Account accountToDisplay) {
                System.out.printf("%s balance is $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
        }
        public static void setDeposit(Account depositToAdd){
            Scanner Input = new Scanner(System.in);

                System.out.printf("Enter deposit amount for %s: ", depositToAdd.getName());
                double depositAmount = Input.nextDouble();

                System.out.printf("%n adding %.2f to %s balance%n%n", depositAmount, depositToAdd.getName());
                depositToAdd.deposit(depositAmount);
        }
    }