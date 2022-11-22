import java.util.*;

public class TryAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        do {
            System.out.println("Dammi un double.");

            try {
                sum += in.nextDouble();
                count = 0;
            } catch (InputMismatchException e) {
                count++;
                if(count == 2)
                    break;
            }   finally {
                in.nextLine();
            }

        }while(true);

        System.out.println("Il totale dei valori inseriti è " + sum);
    }
}