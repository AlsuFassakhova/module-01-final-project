import java.io.*;
import java.util.*;

public class InputOutput {
    public String inputFile() {
        String text = "";
        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) { //не работает со сканером
            while (reader.ready()) {
                String line = reader.readLine();
                text = text + line + "\n";
            }
        } catch (FileNotFoundException e) {
            throw new WrongInputException("Wrong input.\n" + "Start the program again.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }
    public void outputFile(String result) {
        try (Scanner scanner = new Scanner(System.in);
                FileWriter writer = new FileWriter("test2.txt")) { //тоже не работает со сканером, не пойму почему
            writer.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
