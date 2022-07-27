package Name;

public class countint {

	public static void main(String[] args) {
		int a=12345;
		int sum=0;
		while(a>0) 
		{
			sum=sum+a%10;
			a=a/10;
		}
		System.out.print(sum);
	}

}
