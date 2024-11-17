// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		double piQuarter = 1;
		for (int i = 2; i <= length; i++) {
			int muliplier = i % 2 != 0 ? 1 : -1;
			piQuarter += ((double) 1 / (2 * i - 1)) * muliplier;
		}
		double pi = piQuarter * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi);
	}
}
