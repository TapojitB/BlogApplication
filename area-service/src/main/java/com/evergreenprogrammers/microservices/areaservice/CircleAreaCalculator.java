/**
 * 
 */
package com.evergreenprogrammers.microservices.areaservice;

/**
 * @author TapojitBhattacharya
 *
 */

public class CircleAreaCalculator implements AreaCalculator {
	// sides
	private double radius;

	/**
	 * @param radius
	 */
	public CircleAreaCalculator(double radius) {
		super();
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.evergreenprogrammers.microservices.areaservice.AreaCalculator#
	 * calculateArea()
	 */
	@Override
	public double calculateArea() {
		// Area = π r^2
		return Math.PI * Math.pow(radius, 2);
	}

}
