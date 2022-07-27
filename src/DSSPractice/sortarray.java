package DSSPractice;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		int []a= {1,4,2,3,6,5};
		System.out.println("original array"+":-"+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) // no of pass
		{
			for(int j=0;j<a.length-1;j++) // no of iteration 
			{
				if(a[j]>a[j+1]) //> to sort ascending &< to sort descending
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("Arrays after sorting "+":-"+Arrays.toString(a));

	}

}
