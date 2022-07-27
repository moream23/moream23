package Name;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Textwriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("F:\\amit2.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("my name is Amit mohan more /n");
		bw.write("my Wife name is Vaishali amit more");
      System.out.println("finished");
      bw.close();
	}
	

}
