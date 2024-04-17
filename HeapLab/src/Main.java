import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        heap h = new heap();
        File file = h.getFile();

        if (file != null) {
            try {
            	//get the numbers from the file
                Scanner scanner = new Scanner(file);
                ArrayList<Integer> inputList = h.makeTree(scanner);
                scanner.close();

                // Display the original list
                System.out.println("Original List: " + inputList);
                
                //do the heapsort
                ArrayList<Integer> sortedList = h.heapSort(inputList);
                
                //print out the new list that should be sorted
                System.out.println("Sorted List: " + sortedList);
                
            } catch (FileNotFoundException e) {
            	//error exception handling for file not being found
                System.out.println("File not found: " + e.getMessage());
            }
        } else {
        	//error when no file is selected
            System.out.println("No file selected.");
        }
    }
}
