import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main (String... args) throws Exception {
        File file = new File("the_art_of_war.txt");
        String nameOfFile = file.getName();
        Scanner scanner = new Scanner(file);
        int totalWordCount = 0;

        while(scanner.hasNextLine()){  // bool value
            String line = scanner.nextLine();

            totalWordCount += line.split("\\s+").length;  // don't use .split(" ") as it only splits 1 space vs all whitespace and multiple spaces. http://javadevnotes.com/java-string-split-space-or-whitespace-examples

//            // alternatively if you wanted to capture the words in an array
//            String [] splitLine = line.split("\\s+");
//            int wordCount = splitLine.length;
//            totalWordCount = totalWordCount + wordCount;

        }
        System.out.println("There are " + totalWordCount + " words in the file, " + nameOfFile + ".");
    }
}
