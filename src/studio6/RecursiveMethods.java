package studio6;

import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if(n==0)
		{
			return 0.0;
		}
		else if(n == 1) {
			return (1.0/2);
		}
		else
		{
			return (1.0/Math.pow(2,n)) + geometricSum(n-1);
		}


		// FIXME compute the geometric sum for the first n terms recursively

	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if(p%q==0)
		{
			return q;
		}
		else
		{
			return gcd(q, p%q);
		}
		// FIXME compute the gcd of p and q using recursion

	}



	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = Arrays.copyOf(array, array.length);
		// FIXME create a helper method that can recursively reverse the given array
		return reverse(reversed,0);

	}
	public static int[] reverse(int[] array, int n) {
		int x = n;
		if(n<array.length/2)
		{
			int end = array.length - 1;
			int store = array[x];
			array[x] = array[end - x];
			array[end-x] = store;
			x++;
			reverse(array, x);
		}
		return array;
	}
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if(radius>radiusMinimumDrawingThreshold)
		{
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter+radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius, yCenter, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius, radius/3, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius, radius/3, radiusMinimumDrawingThreshold);
		}
		
		// FIXME
	}

}
