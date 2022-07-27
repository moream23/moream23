package DemoArraylist;

import java.util.ArrayList;

public class a {

	public static void main(String[] args) {
		ArrayList<Integer> ref=new ArrayList<>();
		ref.add(10);
		ref.add(20);
		ref.add(30);
		ref.add(40);
		ref.add(50);
//		int b=ref.get(0);   // .get method
//		System.out.println(b);
		System.out.println(ref.get(3));// other method to call
System.out.println(ref.size());
ref.remove(3);
System.out.println(ref.size());
	}

}
