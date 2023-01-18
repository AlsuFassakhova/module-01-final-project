import java.util.*;

public class SolutionNew {

    public static void main(String[] args) {
        System.out.println("Choose mode:\n1 - Caesar encrypt\n2 - Caesar decrypt\n3 - Brut force decrypt");
        int number;
        InputOutput file = new InputOutput();

        try (Scanner console = new Scanner(System.in)) {
            number = console.nextInt();
            while (number != 1 && number != 2 && number != 3) {
                System.out.println("Enter number 1 or 2 or 3:");
                number = console.nextInt();
            }
            if (number == 1) {
                CaesarEncrypt.start();
                file.outputFile(CaesarEncrypt.result);
                System.out.println("Your encryption is successfully completed.");
            } else if (number == 2) {
                CaesarDecrypt.start();
                file.outputFile(CaesarDecrypt.result);
                System.out.println("Your decryption is successfully completed.");
            } else {
                BruteForce.start();
                file.outputFile(BruteForce.result);
                System.out.println("Your brute force decryption is successfully completed.");
            }
        } catch (InputMismatchException e) {
            throw new WrongInputException("Wrong input.\n" + "Start the program again.");
        }


    }
}




