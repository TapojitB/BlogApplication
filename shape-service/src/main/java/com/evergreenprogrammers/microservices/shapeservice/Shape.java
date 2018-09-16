/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice;

/**
 * @author TapojitBhattacharya
 *
 */
public class Shape {

	private String shapeType;
	private Area area;
	private Perimeter perimeter;

	/**
	 * @param shapeType
	 * @param area
	 * @param perimeter
	 */
	public Shape(String shapeType, Area area, Perimeter perimeter) {
		super();
		this.shapeType = shapeType;
		this.area = area;
		this.perimeter = perimeter;
	}

	/**
	 * @return the shapeType
	 */
	public String getShapeType() {
		return shapeType;
	}

	/**
	 * @param shapeType
	 *            the shapeType to set
	 */
	public void setShapeType(String shapeType) {
		this.shapeType = shapeType;
	}

	/**
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
	}

	/**
	 * @return the perimeter
	 */
	public Perimeter getPerimeter() {
		return perimeter;
	}

	/**
	 * @param perimeter
	 *            the perimeter to set
	 */
	public void setPerimeter(Perimeter perimeter) {
		this.perimeter = perimeter;
	}

}
