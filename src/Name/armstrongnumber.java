package Name;

public class armstrongnumber {

	public static void main(String[] args) {
		int a=123;
		int rev=0;
		int c=0;
		int orig_a=a;
		while(a>0) 
		{
			rev=a%10;
			a=a/10;
			c=c+(rev*rev*rev);
		}
		if(orig_a==c) 
		{
			System.out.println(orig_a+"is armstrong number");
		}
		else 
		{
			System.out.println(orig_a+"is not armstrong number");
		}
	}

}
