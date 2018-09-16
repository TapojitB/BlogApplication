/**
 * 
 */
package com.evergreenprogrammers.microservices.areaservice;

/**
 * @author TapojitBhattacharya
 *
 */

public class TriangleAreaCalculator implements AreaCalculator {
	// sides
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	public TriangleAreaCalculator(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evergreenprogrammers.microservices.areaservice.AreaCalculator#
	 * calculateArea()
	 */
	@Override
	public double calculateArea() {
		// Using Heron's formula:
		// Area = SquareRoot(s * (s - a) * (s - b) * (s - c))
		// where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
		double s = (sideA + sideB + sideC) / 2;
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

	}

}
