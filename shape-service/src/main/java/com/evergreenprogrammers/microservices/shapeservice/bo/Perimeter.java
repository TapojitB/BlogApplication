/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice.bo;

/**
 * @author TapojitBhattacharya
 *
 */
public class Perimeter {
	private double perimeter;
	private int port;

	/**
	 * 
	 */
	public Perimeter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param area
	 * @param port
	 */
	public Perimeter(double perimeter, int port) {
		super();
		this.perimeter = perimeter;
		this.port = port;
	}

	/**
	 * @return the perimeter
	 */
	public double getPerimeter() {
		return perimeter;
	}

	/**
	 * @param perimeter
	 *            the perimeter to set
	 */
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

}
