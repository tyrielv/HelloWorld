package edu.gatech;

public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = Integer.parseInt(args[0]);
		Integer b = Integer.parseInt(args[1]);
		Integer sum = a+b;
		System.out.println(a + " + " + b + " = " + sum);
	}

}
