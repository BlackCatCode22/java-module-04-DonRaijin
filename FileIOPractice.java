// FileIOPractice.java
// dB 9/30/25

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIOPractice {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my File IO App!\n ");

        // Create a file named "something.txt"
        try {
            File fileToCreate = new File("something.txt"); // Create File object
            if (fileToCreate.createNewFile()) {           // Try to create the file
                System.out.println("File created: " + fileToCreate.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); // Print error details
        }

        // Open and read arrivingAnimals.txt
        File myObj = new File("arrivingAnimals.txt");

        // try-with-resources: Scanner will be closed automatically
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // AJ wanted a Buffered File Reader
        System.out.println("\n This is from a buffered reader.\n");
        try (BufferedReader br = new BufferedReader(new FileReader("arrivingAnimals.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                // Parse the string named line into 6 array elements
                // Use a string array to get the six elements separated by comma-space
                String[] mySixParts = line.split(", ");

                // Output the 6 parts that were just parsed.
                for (int i = 0; i < mySixParts.length; i++) {
                    System.out.println("mySixParts[" + i + "] is: " + mySixParts[i]);
                }

                // Parse each part of mySixParts[0] again if needed
                String[] ageAndSexAndSpecies = mySixParts[0].split(", ");
                // Output each of the parts
                // What is the size of our array?
                int numOfElements = ageAndSexAndSpecies.length;
                System.out.println("numOfElements is: " + numOfElements);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
