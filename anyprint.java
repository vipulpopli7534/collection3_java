package asg11;

public class anyprint {
	  
	  public static <G> void printArray(G[] arr) {
	    
	    for (G element : arr)
	      System.out.printf("%s ", element);
System.out.println();
	   
	  }

	  public static void main(String args[]) {
	   
	    Integer[] integerArray = { 11, 23, 31, 24, 52, 26 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] characterArray = { 'V', 'I', 'P', 'U', 'L' };

	   
	    printArray(integerArray);
	   
	    printArray(doubleArray); 
	   
	    printArray(characterArray); }
	}