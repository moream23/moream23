
	import java.util.Arrays;
	import java.util.Scanner;
      class twoD_array {

		public static void main(String[] args)
		{
			int a[][]=new int[2][2];
			System.out.print("enter array element:");
			Scanner H=new Scanner(System.in);
			for (int i=0;i<5;i++)
			{
				for (int j=0;j<5;j++)
				{
			
				a[i][j]=H.nextInt();
				}
			}
				System.out.println("matrix elements/n");
		
				for (int i=0;i<5;i++)
				{
					for (int j=0;j<5;j++) { 
				
				System.out.println(a[i][j]+" ");
				}
			}
			
			}
		}



