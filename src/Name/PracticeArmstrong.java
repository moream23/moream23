package Name;

public class PracticeArmstrong {
	public static void main (String []args) 
	{
	int a=153;
	int c=0;
	int orignum=a;
	while(a>0) {
	int rev=a%10;
	a=a/10;
	c=c+(rev*rev*rev);
	}
	if(orignum==c) 
	{
		System.out.println("num is Armstrong");
	}
	else 
	{
		System.out.println("number is not armstrong");
	}
	}
}
