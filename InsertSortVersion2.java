package InsertionSort;

import java.sql.Time;
import java.util.Random;


public class InsertSortVersion2 {
	/**
	 * another version of insertSortmethod
	 * store the element to be inserted as a key, put all the element greater than this key a step right
	 * reserve a proper position  letting the key insert in
	 * then  insert the key into the  "empty" position
	 * @param inputArray
	 * @return the sorted array
	 */
	private static int count=0;
	//time complexity=((5/2)*n)^3+(5n)^2+(7n/2)-4 space complexity:2n+6
	public static int[] InsertSortVersion2(int inputArray[]){
		//initialize the return array
		int outputArray[]=inputArray;                    //time:n  space:n
		//the index is the position to be inserted
		int index=0;                                      //time:1 space:1
		
		
		for(int j=1;j<outputArray.length;j++) {            //time:n-1 space:1
			// to confirm the length of the array to be inserted
			int length=j-1;                                //time:n-1 space:1
		//inserting procedure
			int key=outputArray[j];                         //time:n-1 space:1
		//check if the index has been modified
		  boolean flag=false;                               // time:n-1 space:1
		//compare if the element  is greater than key or not.
		//when find a element less or equal than key,put the key next to the it
			
			for(int i=length;i>=0;i--){                   // time:(n/2)*(n-1) space:1
				if(outputArray[i]>key) { //time:(n/2)*(n-1)
				 count=count+1;	
				outputArray[i+1]=outputArray[i];         //time:(n/2)*(n-1)
				index=i;                                 //time:(n/2)*(n-1)
				//the index has been modified,set flag is true
				flag=true;                              //time:(n/2)*(n-1)
				}
				
					
			}
			if(flag)                                         //time:n-1
				//if index has been modified ,put key at the index position,else do nothing
				outputArray[index]=key;                  //time:n-1
		}
		System.out.println("\n the number of basic operation is " +count);
		count=0;
		
		return outputArray;
	}

	/**
	 *the method will generate a array whose integers are randomly generated 
	 * @param length   the length of the array
	 * @param bound    the upper boundary of the generate number,all the number will between 0 and the boundary
	 * @return the generate array
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
