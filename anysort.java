package asg11;

import java.util.Arrays;

public class anysort {
	 
	
	public static <G> void sortArray(G[] arr){
		Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println();
	}
	
	
	public static void main(String args[]) {
		   
		    Integer[] integerArray = { 11, 23, 31, 24, 52, 26 };
		    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		    Character[] characterArray = { 'V', 'I', 'P', 'U', 'L' };

		   
		    sortArray(integerArray);
		   
		    sortArray(doubleArray); 
		   
		    sortArray(characterArray); }

}
