package DSSPractice;

public class Reversestring {

	public static void main(String[] args) 
	{
	/*String str="ABCD";
	String rev="";
     for(int i=str.length()-1;i>=0;i--) 
     {
    	 rev=rev+str.charAt(i);
    	 
     }
     System.out.println(rev);
	}*/
		// by string array method
		
		String str="vaishali";
		String rev="";
		/*char[]a=str.toCharArray();
		for(int i=a.length-1;i>=0;i--) 
		{
			rev=rev+a[i];
			}
		System.out.print(rev);*/
		// by string buffer method
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		}

}
