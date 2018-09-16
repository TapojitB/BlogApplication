/**
 * 
 */
package com.evergreenprogrammers.microservices.perimeterservice;

/**
 * @author TapojitBhattacharya
 *
 */
public class CirclePerimeterCalculator implements PerimeterCalculator {
	// sides
	private double radius;

	/**
	 * @param radius
	 */
	public CirclePerimeterCalculator(double radius) {
		super();
		this.radius = radius;
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
		// Perimeter = 2πr
		return 2 * Math.PI * radius;
	}

}
