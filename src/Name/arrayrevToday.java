package Name;

import java.util.Arrays;

public class arrayrevToday {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
        int []b= {1,2,3,4,5};
      /* boolean status=Arrays.equals(a, b);
       if(status==true) 
       {
    	   System.out.println("arrays are equal");
       }
       else 
       {
    	   System.out.println("arrays are not equal");
       }*/
        boolean status=true;
       if(a.length==b.length) 
       {
    	   for(int i=0;i<a.length;i++) 
    	   {
    		   if(a[i]!=b[i]) 
    		   {
    			   status=false;
    		   }
    		   
    	   }
       }
       else 
       {
    	   status=false;
       }
       if(status==true) 
       {
    	   System.out.println("is equal");
       }
       else 
       {
    	   System.out.println("is not equal");
       }
	}
}

