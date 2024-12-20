// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int limit = Integer.parseInt(args[0]);
		boolean isVerbose = args[1].equals("v");

		for (int i = 1; i <= limit; i++) {
			int counter = 2;
			int value = i;
			String line = value + " ";
			value = value % 2 == 0 ? value / 2 : value * 3 + 1;
			line += value + " ";
			while (value != 1) {
				value = value % 2 == 0 ? value / 2 : value * 3 + 1;
				line += value + " ";
				counter++;
			}
			line += "(" + counter + ")";
			if (isVerbose) {
				System.out.println(line);
			}
		}
		System.out.printf("Every one of the first %d hailstone sequences reached 1.\n", limit);

	}
}
