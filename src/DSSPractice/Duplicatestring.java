package DSSPractice;

public class Duplicatestring {

	public static void main(String[] args) {
		String []a= {"java","bva","c++","java","c","c"};
		Boolean status=false;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("found duplicate"+":-"+a[i]);
					status=true;
				}
			}
		}
		if(status==false) 
		{
			System.out.println("no duplicate found");
		}
	}

}
