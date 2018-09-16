/**
 * 
 */
package com.evergreenprogrammers.microservices.areaservice;

/**
 * @author TapojitBhattacharya
 *
 */

public class RectangleAreaCalculator implements AreaCalculator {
	// sides
	private double length;
	private double breadth;

	/**
	 * @param breadth
	 * @param length
	 */
	public RectangleAreaCalculator(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evergreenprogrammers.microservices.areaservice.AreaCalculator#
	 * calculateArea()
	 */
	@Override
	public double calculateArea() {
		// A = l * b
		return length * breadth;
	}

}
