import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void createFile(String directoryName) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String directory = directoryName;
        try {
            File someFile = new File(directory);
            if (someFile.createNewFile()) {
                System.out.println("File created in : " + someFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
        public static void main (String[]args) throws FileNotFoundException {
        createFile("C:\\Users\\sowul\\creates_files\\kunolis.txt");
    }
}

