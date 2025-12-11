import java.io.*;
import java.util.*;

public class SimpleFileReader {

    // Default file path if none is provided
    public static String mockDataFileOne = "src/data.txt";

    public static ArrayList<String> getMockData(String path, boolean printFile) {
        if (path.isBlank()) {
            path = SimpleFileReader.mockDataFileOne; // Use the default file path
        }

        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = null;

        try {
            // Open the file located in the src folder
            reader = new BufferedReader(new FileReader(path));
            
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line); // Add each line to the ArrayList
            }

            // Print the lines if needed
            if (printFile) {
                for (String l : lines) {
                    System.out.println(l);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            // Ensure the reader is closed even if an exception occurs
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }

        return lines;
    }

    // Static method to add a string as a line to the file
    public static void addLineToFile(String path, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(line);
            writer.newLine(); // Add a new line
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Method to find duplicates and their occurrence count
    public static Map<String, Integer> findDuplicates(ArrayList<String> list) {
        Map<String, Integer> occurrenceMap = new HashMap<>();
        
        for (String item : list) {
            occurrenceMap.put(item, occurrenceMap.getOrDefault(item, 0) + 1);
        }

        // Filter out items that appear only once
        Map<String, Integer> duplicates = new HashMap<>();
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicates;
    }

    // Method to delete all duplicates from the list
    public static ArrayList<String> deleteDuplicates(ArrayList<String> list) {
        Set<String> uniqueItems = new HashSet<>(list);
        return new ArrayList<>(uniqueItems);
    }

}
