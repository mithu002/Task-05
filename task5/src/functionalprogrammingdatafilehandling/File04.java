package functionalprogrammingdatafilehandling;

import java.io.*;



public class File04 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/O Pioneers.txt"));

		r.lines().map(l -> l.toLowerCase()).forEach(l -> System.out.println(l));

		r.close();
	}

}
