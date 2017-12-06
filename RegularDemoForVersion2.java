package InsertionSort;

import java.util.Scanner;

public class RegularDemoForVersion2 {
	
public  static void main (String args[]){
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input the number of the elements\n");
		int number=scanner.nextInt();
		System.out.println("please input the upper boundary of the elements\t");
		int  bound=scanner.nextInt();
		
		int inputArray[]=InsertSortVersion1.generateIntegerList(number, bound);
		System.out.println("generating.........\n");
		System.out.println("generate successful, the results are \n");
		for (int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");

		}
		InsertSortVersion2.InsertSortVersion2(inputArray);
		System.out.println("\n the sorted Array is \n");
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");
		}
		}
	}


