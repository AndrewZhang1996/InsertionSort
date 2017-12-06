package InsertionSort;

import java.util.Scanner;

public class RegularDemoForVersion1 {
	public  static void main (String args[]){
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input the number of the elements\t");
		int number=scanner.nextInt();
		System.out.println("please input the upper boundary of the elements\t");
		int  bound=scanner.nextInt();
		
		int inputArray[]=InsertSortVersion2.generateIntegerList(number, bound);
		System.out.println("generating.........\n");
		System.out.println("generate successful, the results are \n");
		for (int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");

		}
		System.out.println("\n\nthe sorted Array is \n");
		InsertSortVersion1.InsertSortVersion1(inputArray);
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");
		}
		}
	
}