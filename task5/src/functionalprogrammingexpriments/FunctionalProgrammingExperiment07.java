package functionalprogrammingexpriments;

import java.util.stream.Stream;



public class FunctionalProgrammingExperiment07 {
	class NameStreamBuilder {
		public Stream<String> build() {
			Stream.Builder<String> builder = Stream.builder();
			builder.add("Mithuni");
			builder.add("Nathan");
			builder.add("Alexander");
			return builder.build();
		}
	}

	public void run() {
		NameStreamBuilder builder = new NameStreamBuilder();
		Stream<String> nameStream = builder.build();
		nameStream.forEach(n -> System.out.println(n));
	}

	public static void main(String[] args) {
		new FunctionalProgrammingExperiment07().run();
	}
}
