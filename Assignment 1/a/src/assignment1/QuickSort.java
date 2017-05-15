package assignment1;

import java.util.ArrayList;

public class QuickSort { //a quicksort algorithm
	     
	    private ArrayList<Integer> array = new ArrayList<Integer>();
	    private int length;
	    
	    public void sort(ArrayList<Integer> inputArr) {
	         
	        if (inputArr == null || inputArr.size() == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.size();
	        quickSort(0, length - 1);
	    }
	 
	    private void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array.get(lowerIndex+(higherIndex-lowerIndex)/2);
	        // Divide into two arrays
	        while (i <= j) {
	            while (array.get(i) < pivot) {
	                i++;
	            }
	            while (array.get(j) > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                i++;
	                j--;
	            }
	        }
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = array.get(i);
	        array.set(i, array.get(j));
	        array.set(j,temp);
	    }
}
