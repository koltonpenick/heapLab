import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class heapLabUnitTesting {

    @Test
    public void testMakeTree() {
        String inputString = "1 2 3 4 5";
        Scanner input = new Scanner(inputString);
        
        ArrayList<Integer> result = heap.makeTree(input);
        
        //expected
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void testMakeHeap() {
    	 String inputString = "1 2 3 4 5";
         Scanner input = new Scanner(inputString);
         heap hp = new heap();
         ArrayList<Integer> result = heap.makeTree(input);
         
         hp.makeHeap(result,5);
         
         
    }
    @Test
    public void testHeapSort() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, 10, 3, 5, 1));
        
        heap hp = new heap();
        
        ArrayList<Integer> result = hp.heapSort(input);
        
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(10, 5, 4, 3, 1));
        
        assertEquals(expected, result);
    }
}
