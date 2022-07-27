package Name;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readtext {

	public static void main(String[] args) throws IOException {
		//approch 1
	/*FileReader fr=new FileReader("F:\\amit.txt");
	BufferedReader br=new BufferedReader(fr);
	String str;
	while((str=br.readLine())!=null) 
	{
		System.out.println(str);
	}
	br.close();*/
		
		//approch2
		File file=new File("F:\\amit.txt");
		Scanner sc =new Scanner(file);
		/*while(sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		}*/
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	
		}

}
