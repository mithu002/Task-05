package functionalprogrammingexpriments;

import java.util.Arrays;
import java.util.List;



public class FunctionalProgrammingExperiment02 
{
	public void run() {
	    String[] n1 = { "Mithuni Umesha", "Alexander Volkanovski", "Sonny Bill Williams", "Israel Folau", "Cameron Smith", "Nathan Sharpe", "Kurtley Beale" };

	    List<String> n2 = Arrays.asList(n1);

	    n2.stream().filter(name -> name.contains("a"))
	        .forEach(name -> System.out.println(name));

	  }

	  public static void main(String[] args) {
	    new FunctionalProgrammingExperiment02().run();
	  }
}
