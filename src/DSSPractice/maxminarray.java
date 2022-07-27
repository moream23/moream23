package DSSPractice;

public class maxminarray {

	public static void main(String[] args) {
		int a[]= {10,400,70,100,30};
		int max=a[0];
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max) //< for min number & > for max number
			{
				max=a[i];
			}
		}
		System.out.println("max in array is"+" "+max);

	}

}
