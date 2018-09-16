/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author TapojitBhattacharya
 *
 */
@RestController
public class ShapeServiceController {
	@GetMapping("/shapeDetails/shapeType/{shapeType}")
	public Shape getShapeDetails(@PathVariable String shapeType) {

		Area area = invokeAreaService(shapeType);
		Perimeter perimeter = invokePerimeterService(shapeType);
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

}
