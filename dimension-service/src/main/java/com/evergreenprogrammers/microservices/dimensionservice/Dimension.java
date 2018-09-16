/**
 * 
 */
package com.evergreenprogrammers.microservices.dimensionservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author TapojitBhattacharya
 *
 */
@Component
@ConfigurationProperties(prefix = "dimension-service")
public class Dimension {
	private int length;
	private int breadth;
	private int height;

	/**
	 * 
	 */
	public Dimension() {

	}

	/**
	 * @param length
	 * @param breadth
	 * @param height
	 */
	public Dimension(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

}
