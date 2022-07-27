import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int num;
		System.out.println("enter any number:");
		Scanner N=new Scanner(System.in);
		num=N.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print(num*i);
		}
			
				

	}

}
