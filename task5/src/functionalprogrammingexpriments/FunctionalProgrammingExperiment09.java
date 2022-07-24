package functionalprogrammingexpriments;

import java.util.*;
import java.util.function.Function;


public class FunctionalProgrammingExperiment09 {
	class ERemover implements Function<String, String> {
		public String apply(String name) {
			return name.replaceAll("e", "");
		}
	}

	public void run() {
		String[] n1 = { "Mithuni Umesha", "Alexander Volkanovski", "Sonny Bill Williams", "Israel Folau", "Cameron Smith", "Nathan Sharpe", "Kurtley Beale" };

		List<String> n2 = Arrays.asList(n1);

		n2.stream().map(new ERemover()).forEach(name -> System.out.println(name));

	}

	public static void main(String[] args) {
		new FunctionalProgrammingExperiment09().run();
	}
}
