package Name;

public class primenumber {

	public static void main(String[] args) {
		int a=19;
		int count=0;
		if(a>1) //to check is it natural number
		{
		 for(int i=1;i<=a;i++)
		 {
			 if(a%i==0)
				 count++;
		 }	
		 if(count==2) {
		 System.out.println(a+":-is prime number");
		}
		else 
		{
			System.out.println(a+":-is not prime number");
		}
		 }
		 else 
		 {
			System.out.println("is not primr number"); 
		 }
		}
}
