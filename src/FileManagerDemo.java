package FileManagerApp;

import java.util.List;
import java.util.Scanner;

public class FileManagerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager(System.getProperty("user.dir"));

        while (true) {
            System.out.println("Current Directory: " + fileManager.getCurrentDirectory()); // Should be getPath()
            System.out.println("Options:");
            System.out.println("1. List Files");
            System.out.println("2. Change Directory");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    List<FileItem> files = fileManager.listFiles();
                    for (FileItem file : files) {
                        System.out.println(file);
                    }
                    break;
                case 2:
                    System.out.print("Enter new directory: ");
                    String newDirectory = scanner.next();
                    if (fileManager.changeDirectory(newDirectory)) {
                        System.out.println("Directory changed.");
                    } else {
                        System.out.println("Invalid directory.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
