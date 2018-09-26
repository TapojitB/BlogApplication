/**
 * 
 */
package com.evergreenprogrammers.microservices.perimeterservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.evergreenprogrammers.microservices.perimeterservice.CirclePerimeterCalculator;
import com.evergreenprogrammers.microservices.perimeterservice.PerimeterCalculator;
import com.evergreenprogrammers.microservices.perimeterservice.RectanglePerimeterCalculator;
import com.evergreenprogrammers.microservices.perimeterservice.TrianglePerimeterCalculator;
import com.evergreenprogrammers.microservices.perimeterservice.bo.Perimeter;

/**
 * @author TapojitBhattacharya
 *
 */
@RestController
public class PerimeterServiceController {
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

	private Logger logger = LoggerFactory.getLogger(PerimeterServiceController.class);

	@GetMapping("/perimeter/shapeType/{shapeType}")
	public Perimeter getPerimeter(@PathVariable String shapeType) {
		PerimeterCalculator perimeterCalculator = getPerimeterCalculator(shapeType);
		double perimeter = perimeterCalculator.calculatePerimeter();
		int portNo = getServerPort();
		logger.info("PerimeterServiceController.getPerimeter.perimeter---> {}" + perimeter);
		return new Perimeter(perimeter, portNo);
	}

	private int getServerPort() {
		String port = environment.getProperty("server.port");
		int portNo = Integer.parseInt(port);
		return portNo;

	}

	private PerimeterCalculator getPerimeterCalculator(String shapeType) {
		PerimeterCalculator perimeterCalculator = null;
		if ("Circle".equalsIgnoreCase(shapeType)) {
			perimeterCalculator = new CirclePerimeterCalculator(radius);
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			perimeterCalculator = new RectanglePerimeterCalculator(length, length);
		} else if ("Triangle".equalsIgnoreCase(shapeType)) {
			perimeterCalculator = new TrianglePerimeterCalculator(sideA, sideB, sideC);
		}
		return perimeterCalculator;
	}

}
