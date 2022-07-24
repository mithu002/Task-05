package functionalprogrammingdatafilehandling;

import java.io.*;



public class File06 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/O Pioneers.txt"));

		System.out.println(r.lines().reduce("", String::concat));

		r.close();
	}

}
