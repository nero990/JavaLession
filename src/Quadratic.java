import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value for A: ");
		double a = input.nextDouble();

		System.out.print("Enter value for B: ");
		double b = input.nextDouble();

		System.out.print("Enter value for C: ");
		double c = input.nextDouble();

		double sqrt = Math.sqrt(b * b - 4 * a * c);
		double x1 = (- b + sqrt) / (2 * a);
		double x2 = (- b - sqrt) / (2 * a);

		System.out.printf("X1 = %f%n and X2 = %f%n", x1, x2);
	}
}
