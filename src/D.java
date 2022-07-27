
public class D {
	int a;
	D(int a)// parameterized constructor (local variable)
	
	{
		this.a=a;   //this helps to differentiate local and instance variable
		}
	void show() {
		
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
	D r=new D(100);
	r.show();

	}
	
}
