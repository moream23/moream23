
public class Today {

	public static void main(String[] args) {
	  int a=121;
	  int rev=0;
	  int orig_a=a;
	  while(a>0) 
	  {rev=rev*10+a%10;
	  a=a/10;
	  }
	  if(orig_a==rev) 
	  {
		  System.out.println("number is pallindrome");
	  }
	  else {
		  System.out.println("not pallindrome");}
	}
}
