import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;

public class heap{
	
	
    static ArrayList<Integer> makeTree (Scanner input){
    	//crete an empty arraylist
    	ArrayList<Integer> tree = new ArrayList<>();
    	//loop through the indexes of the file
    	while(input.hasNextInt()) {
    		//add each node to the arraylist
    		tree.add(input.nextInt());
    	}
    	return tree;
    }
     
    
    void makeHeap (ArrayList<Integer> tree , int n) {
    	for(int i=n/2-1;i>=0;i--) {
    		heapItUp(tree,n,i);
    		
    	}
    }
	    
    public ArrayList<Integer> heapSort (ArrayList<Integer> tree){
    	int length = tree.size();
    	
    	makeHeap(tree,length);
    	ArrayList<Integer> cleanList = new ArrayList<>();
    	for(int i=length-1;i>=0;i--) {
    		int copy = tree.get(0);
    		tree.set(0, tree.get(i));
    		tree.set(i,copy);
    		
    		cleanList.add(tree.get(i));
    		heapItUp(tree,i,0);
    		
    	}
    	return cleanList;
    }
    
    
    private static void heapItUp(ArrayList<Integer> tree, int x, int y) {
    	int bigger = y;
    	int lc = 2 * y + 1;
    	int rc = 2 * y + 2;
    	
    	//case for left child being larger than the parent node
    	if(lc<x && tree.get(lc) > tree.get(bigger)) {
    		bigger = lc;
    	}
    	//case for right child being larger than the parent node
    	if(rc<x && tree.get(rc) > tree.get(bigger)) {
    		bigger = rc;
    	}
    	
    	//case for root not being the biggest
    	if(bigger!=y) {
    		//this will swap the bigger number with the root
    		int copy = tree.get(y);
    		tree.set(y, tree.get(bigger));
    		tree.set(bigger, copy);
    		
    		
    		//recursive call to continue sorting the heap
    		heapItUp(tree,x,bigger);
    		
    	}
    }
    
    public File getFile() {
    	//method to retrieve a file using JFileChooser
    	File file = null;
    	JFileChooser jfc = new JFileChooser();
		int result = jfc.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();

		}
		
		
		return file;
		
    }
	    
	 
	 
	
}