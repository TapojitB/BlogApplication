/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.evergreenprogrammers.microservices.shapeservice.bo.Area;
import com.evergreenprogrammers.microservices.shapeservice.bo.Perimeter;
import com.evergreenprogrammers.microservices.shapeservice.bo.Shape;
import com.evergreenprogrammers.microservices.shapeservice.proxy.AreaServiceProxy;
import com.evergreenprogrammers.microservices.shapeservice.proxy.PerimeterServiceProxy;

/**
 * @author TapojitBhattacharya
 *
 */
@RestController
public class ShapeServiceController {
	@Autowired
	private AreaServiceProxy areaFeignClient;

	@Autowired
	private PerimeterServiceProxy perimeterFeignClient;
	
	private Logger logger = LoggerFactory.getLogger(ShapeServiceController.class);

	@GetMapping("/shapeDetails/shapeType/{shapeType}")
	public Shape getShapeDetails(@PathVariable String shapeType) {
		Area area = invokeAreaService(shapeType);
		Perimeter perimeter = invokePerimeterService(shapeType);
		logger.info("ShapeServiceController.getShapeDetails---> {}");
		return new Shape(shapeType, area, perimeter);
	}

	private Perimeter invokePerimeterService(String shapeType) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8100/perimeter/shapeType/{shapeType}";
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("shapeType", shapeType);
		ResponseEntity<Perimeter> responseEntity = restTemplate.getForEntity(url, Perimeter.class, uriVariables);
		Perimeter perimeter = responseEntity.getBody();

		return perimeter;
	}

	private Area invokeAreaService(String shapeType) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8000/area/shapeType/{shapeType}";
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("shapeType", shapeType);
		ResponseEntity<Area> responseEntity = restTemplate.getForEntity(url, Area.class, uriVariables);
		Area area = responseEntity.getBody();

		return area;
	}

	@GetMapping("/shapeDetailsFeign/shapeType/{shapeType}")
	public Shape getShapeDetailsFeign(@PathVariable String shapeType) {
		Area area = invokeAreaServiceFeign(shapeType);
		Perimeter perimeter = invokePerimeterServiceFeign(shapeType);
		logger.info("ShapeServiceController.getShapeDetailsFeign---> {}");
		return new Shape(shapeType, area, perimeter);
	}

	private Perimeter invokePerimeterServiceFeign(String shapeType) {
		Perimeter perimeter = perimeterFeignClient.getPerimeter(shapeType);
		return perimeter;
	}

	private Area invokeAreaServiceFeign(String shapeType) {
		Area area = areaFeignClient.getArea(shapeType);
		return area;
	}

}
