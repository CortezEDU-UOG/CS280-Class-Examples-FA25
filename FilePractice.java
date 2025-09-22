import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class FilePractice {
    public static void main(String[] args) {
        int numLines = 0;
        int nonEmptyLines = 0;
        int numWords = 0;
        int numChars = 0;
        try (Scanner input = new Scanner(new File("input_contents.txt"))) {
            System.out.println("File successfully opened.");
            while (input.hasNextLine()) {
                numLines++;
                String line = input.nextLine().strip();
                if (!line.isEmpty()) {
                    nonEmptyLines++;
                }
                numChars += line.length();
                int spaceIndex = line.indexOf(" ");
                while (spaceIndex != -1) {
                    numWords++;
                    line = line.substring(spaceIndex + 1);
                    spaceIndex = line.indexOf(" ");
                }
                if (!line.isEmpty()) {
                    numWords++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Try again.");
        } catch (IOException e) {
            
        }

        try (PrintStream output = new PrintStream(new File("practice_output.txt"))) {
            output.println("Summary for: input_contents.txt");
            output.printf("Lines: %d%nWords: %d%nChars: %d%nNon-empty: %d%n", numLines, numWords, numChars, nonEmptyLines);
        } catch (FileNotFoundException e) {

        }

        System.out.println("Program complete.");
    }
}
