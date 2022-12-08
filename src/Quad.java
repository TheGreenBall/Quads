/*  ax^2 + bx + c = 0
 *
 * To square b, you must use the Math method pow(). To square root the discriminant,
 * you must use the Math method sqrt(). We are completely ignoring the values
 * that make the equation imaginary. Just use values that give you real answers.
 *
 * To test, use the values a = 1, b = 3, c = 2 and you should get x = -1.0,-2.0.
 * You should try with others as well.
 */

import javax.swing.*;

public class Quad {
	public static void main(String args[]) {

		greeting();

		int a = getInput("Please enter a value for A"),
		    b = getInput("Please enter a value for B"),
		    c = getInput("Please enter a value for C");

		double solution1 = quadraticFormulaPositive(a,b,c);
		double solution2 = quadraticFormulaNegative(a,b,c);

		output(a,b,c,solution1,solution2);

	}

	public static void greeting() {

		System.out.println("Hello, this program solves the quadratic equation");

	}

	public static int getInput(String a) {;

		String y = JOptionPane.showInputDialog(a);

		int d = Integer.parseInt(y);

		return d;

	}

	public static double quadraticFormulaPositive(int a,int b,int c) {

		double solution = -b + Math.sqrt(Math.pow(b, 2) - (4 * (a*c))  ) / 2 * a;

		return solution;


	}
	public static double quadraticFormulaNegative(int a,int b,int c) {

		double solution2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * (a*c))  ) / 2 * a;

		return solution2;


	}
	public static void output(int c, int d, int e, double a, double b) {

		System.out.println("the solution to the quadratic formula is: " + a + " or " + b +
				"from the numbers A: " + c + " b: " + d + " C: " + e);

	}


}
