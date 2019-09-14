package com.basics.maths;

/*
 * x^y
 * 
 * if y is even ==> (x^2)^(y/2) -- this reduce half of execution
 * 
 * time complexity k(log(N)) k is very minimal
 * almost logN
 */

public class Power {

	public static int pow(int a, int b) {
		int temp = 1;
		int numberOfLoops = 0;
		while (b > 1) {
			numberOfLoops++;
			if (b % 2 == 1)
				temp = temp * a;
			a = a * a;
			b = b / 2;

		}
		System.out.println(":::numberOfExecutions : " + numberOfLoops);
		return a * temp;
	}

	public static void main(String[] args) {
		System.out.println(pow(2, 10));
	}

}
