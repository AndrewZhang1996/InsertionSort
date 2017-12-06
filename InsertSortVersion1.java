package InsertionSort;

import java.util.Random;

public class InsertSortVersion1 {
	/**
	 * insert way sorting the array
	 * 
	 * this method just sort the array by using local swap method 
	 * 
	 * @param inputarray :the array to be sorted
	 * @return the sorted array
	 */
	private static int count=0;
	
	//space complexity=2n+4 time complexity :(5n/2)^3-(5n)^2+(9n/2)-1
	public static int[] InsertSortVersion1(int inputArray[]) {
		//initialize the return array£¬
		int outputArray[]=inputArray;//        time:n    space:n
		for(int j=1;j<outputArray.length;j++)//       time:n-1  space:1
		{
			// to confirm the length of the array to be sorted (using local swap method)
			int length=j-1;//                 time:n-1  space:1
			//local swap procedure
			for(int i=length;i>=0;i--) {   //decrement time:(n/2)*(n-1) space:1
				if(outputArray[i]>outputArray[i+1]) {// compare time worst case:(n/2)*(n-1)
					count=count+1;
					int temp=outputArray[i+1];//           time:  (n/2)*(n-1)     space:1
					outputArray[i+1]=outputArray[i];//      time:(n/2)*(n-1)
					outputArray[i]=temp;//               time:(n/2)*(n-1)
				}
				
					
				
			}
		}
		System.out.println("\n the time of basic operations are: "+count);
		count=0;
		return outputArray;
		
	}
	
	/**
	 *the method will generate a array whose integers are randomly generated 
	 * @param length the length of the array
	 * @param bound the upper boundary of the generate number
	 * @return the generated array 
	 */
	 public  static int[] generateIntegerList(int length,int bound) {
	    	//initialize the random generator 
		 	Random random=new Random();
	    	//initialize array, the array's length will depend on the user
	    	int cookedArray[]=new int[length];
	    	//put the generate value into array
	    	for(int i=0;i<length;i++) {
	    		cookedArray[i]=random.nextInt(bound);
	    	}
	    	return cookedArray;
	    }
	

}
