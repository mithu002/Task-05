package functionalprogrammingdatafilehandling;

import java.io.*;



public class File03 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/O Pioneers.txt"));

		r.lines().filter(l -> l.contains("red")).forEach(l -> System.out.println(l));

		r.close();
	}

}
