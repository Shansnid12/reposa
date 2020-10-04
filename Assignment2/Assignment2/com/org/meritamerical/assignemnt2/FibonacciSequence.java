package com.org.meritamerical.assignemnt2;

public class FibonacciSequence {

	// Sets my constant value for the Max Term Value used to set the boundary of the
	// FibonacciSequence output
	private static final int MAX_TERM_VALUE = 10000;

	// This function calculates the Fibonnaci sequence
	static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);

		}
	}

	/*
	 * This method being the main - I did not use the acm console as this prints to
	 * the console as well. This method tells the Fibonnaci sequence method to
	 * increment n by one creating a loop for the sequence output. This also sets
	 * the bounds for how many times the sequence is to repeat determined by the
	 * MAX_TERM_VALUE.
	 */
	public static void main(String[] args) {
		int n = 0;
		while (fib(n) <= MAX_TERM_VALUE) {
			n++;
			if (fib(n) <= MAX_TERM_VALUE)
				System.out.println(fib(n));
		}

	}
}