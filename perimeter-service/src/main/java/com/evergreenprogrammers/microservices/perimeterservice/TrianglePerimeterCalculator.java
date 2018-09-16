/**
 * 
 */
package com.evergreenprogrammers.microservices.perimeterservice;

/**
 * @author TapojitBhattacharya
 *
 */
public class TrianglePerimeterCalculator implements PerimeterCalculator {
	// sides
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 */
	public TrianglePerimeterCalculator(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.evergreenprogrammers.microservices.perimeterservice.PerimiterCalculator#
	 * calculatePerimeter()
	 */
	@Override
	public double calculatePerimeter() {
		// P = a + b + c
		return sideA + sideB + sideC;
	}

}
