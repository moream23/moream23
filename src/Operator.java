import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("enter any two numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("enterr your choice");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:c=a+b;
		System.out.println("addition"+c);
		break;
		case 2:c=a-b;
		System.out.println("substraction"+c);
		break;
		case 3:c=a/b;
		System.out.println("division"+c);
		break;
		case 4:c=a%b;
		System.out.println("reminder"+c);
		break;
		default:
			System.out.println("invalid choice");
		
		}
		}

	}




