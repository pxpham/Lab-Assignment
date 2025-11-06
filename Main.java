import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        File file = new File("grades.txt");

        // TODO A2: Use try–catch to handle FileNotFoundException

        try {
            // TODO B1: Create a Scanner to read the file
            Scanner scanner = new Scanner(file);
            // TODO B2: Print "Student Grades:"
            System.out.println("Student grades:");
            // TODO B3: Read and print each line from the file
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (Exception e) {
            // TODO C1: Print "File not found!" if grades.txt is missing
            System.out.println("File not found!");
        }

        void printGreeting() {
            System.out.println("Hi Phuong :D");
        }
        printGreeting();
    }
}
