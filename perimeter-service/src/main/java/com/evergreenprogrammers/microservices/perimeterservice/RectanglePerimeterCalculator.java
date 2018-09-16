/**
 * 
 */
package com.evergreenprogrammers.microservices.perimeterservice;

/**
 * @author TapojitBhattacharya
 *
 */
public class RectanglePerimeterCalculator implements PerimeterCalculator {
	// sides
	private double length;
	private double breadth;

	/**
	 * @param breadth
	 * @param length
	 */
	public RectanglePerimeterCalculator(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;

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
		// P = 2(w + l)
		return 2 * (length + breadth);
	}

}
