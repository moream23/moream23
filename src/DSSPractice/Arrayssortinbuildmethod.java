package DSSPractice;

import java.util.Arrays;
import java.util.Collections;

public class Arrayssortinbuildmethod {

	public static void main(String[] args) {
		// 1st method
	/*	int []a= {10,40,80,30,50,60};
		System.out.println("arry before sorting"+":-"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("arry after sorting"+":-"+Arrays.toString(a));*/
		
		//2nd scenario
		/*int []a= {10,40,80,30,50,60};
		System.out.println("arry before sorting"+":-"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("arry after sorting"+":-"+Arrays.toString(a));*/
		
		//3rd scenario
		Integer a[]= {10,40,80,30,50,60};//for collections.rev primative datatype is not supported 
		System.out.println("arry before sorting"+":-"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("arry after sorting"+":-"+Arrays.toString(a));
		
	}

}
