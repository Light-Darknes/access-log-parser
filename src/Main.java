import java.util.Scanner;
import java.io.File;
public class Main {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int fileCount = 0;

            while (true) {
                System.out.println("Please enter the path to the file: ");
                String filePath = sc.nextLine();

                File file = new File(filePath);

                boolean fileExists = file.exists();
                boolean isFile = file.isFile();

                if (!fileExists || !isFile) {
                    System.out.println("The specified file does not exist or the path is a directory, not a file. Please try again.");
                    continue;
                } else {
                    fileCount++;
                    System.out.println("The path is correct. This is file number " + fileCount);
                }
            }
        }
    }

