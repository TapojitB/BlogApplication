/**
 * 
 */
package com.evergreenprogrammers.microservices.areaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.evergreenprogrammers.microservices.areaservice.AreaCalculator;
import com.evergreenprogrammers.microservices.areaservice.CircleAreaCalculator;
import com.evergreenprogrammers.microservices.areaservice.RectangleAreaCalculator;
import com.evergreenprogrammers.microservices.areaservice.TriangleAreaCalculator;
import com.evergreenprogrammers.microservices.areaservice.bo.Area;

/**
 * @author TapojitBhattacharya
 *
 */
@RestController
public class AreaServiceController {

	@Autowired
	private Environment environment;

	@Value("${circle.radius}")
	private double radius;

	@Value("${rectangle.length}")
	private double length;
	@Value("${rectangle.bredth}")
	private double breadth;

	@Value("${triangle.sidea}")
	private double sideA;
	@Value("${triangle.sideb}")
	private double sideB;
	@Value("${triangle.sidec}")
	private double sideC;

	@GetMapping("/area/shapeType/{shapeType}")
	public Area getArea(@PathVariable String shapeType) {
		AreaCalculator areaCalculator = getAreaCalculator(shapeType);
		double area = areaCalculator.calculateArea();
		int portNo = getServerPort();
		return new Area(area, portNo);
	}

	private int getServerPort() {
		String port = environment.getProperty("server.port");
		int portNo = Integer.parseInt(port);
		return portNo;

	}

	private AreaCalculator getAreaCalculator(String shapeType) {
		AreaCalculator areaCalculator = null;
		if ("Circle".equalsIgnoreCase(shapeType)) {
			areaCalculator = new CircleAreaCalculator(radius);
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			areaCalculator = new RectangleAreaCalculator(length, breadth);
		} else if ("Triangle".equalsIgnoreCase(shapeType)) {
			areaCalculator = new TriangleAreaCalculator(sideA, sideB, sideC);
		}
		return areaCalculator;
	}

}
