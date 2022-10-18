import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        String scelta;

            do {
                System.out.println("Inserisci un numero da 1 a 6");
                predictedValue = in.nextInt();

                if (predictedValue < 1 || predictedValue > 6) {
                    System.out.println("non OK");
                    break;
                }

                Random ra = new Random();
                actualValue = ra.nextInt(1, 6);

                System.out.println("Inserisci il bet:");
                bet = in.nextDouble();

                if (bet < playerAccount.getBalance() || bet * 5 < casinoAccount.getBalance())
                    System.out.println("Puoi scommettere!");
                else {
                    System.out.println("Non puoi scommettere");
                    break;
                }

                if (actualValue == predictedValue)  {
                    System.out.println("Hai indovinato!");
                    casinoAccount.withdraw(5 * bet);
                    playerAccount.deposit(5 * bet);
                } else {
                    System.out.println("Non hai indovinato :( il valore era -> " + actualValue);
                    playerAccount.withdraw(bet);
                    casinoAccount.deposit(bet);
                }
                Scanner risposta = new Scanner(System.in);
                System.out.println("Vuoi scommettere ancora? (si per continuare, no per quittare)");
                scelta = risposta.nextLine();


                if(scelta.equalsIgnoreCase(choice))
                    break;

            }while(playerAccount.getBalance() > 0 && !scelta.equalsIgnoreCase(choice));




        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}