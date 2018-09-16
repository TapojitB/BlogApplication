/**
 * 
 */
package com.evergreenprogrammers.microservices.shapeservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.evergreenprogrammers.microservices.shapeservice.bo.Area;

/**
 * @author TapojitBhattacharya
 *
 */
@FeignClient(name = "area-service")
@RibbonClient(name = "area-service")
public interface AreaServiceProxy {

	@GetMapping("/area/shapeType/{shapeType}")
	public Area getArea(@PathVariable("shapeType") String shapeType);

}