/**
 * 
 */
package com.evergreenprogrammers.microservices.areaservice.bo;

/**
 * @author TapojitBhattacharya
 *
 */
public class Area {
	private double area;
	private int port;

	/**
	 * @param area
	 * @param port
	 */
	public Area(double area, int port) {
		super();
		this.area = area;
		this.port = port;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

}
