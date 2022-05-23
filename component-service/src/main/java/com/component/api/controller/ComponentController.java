package com.component.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.component.api.entity.Components;
import com.component.api.services.ComponentService;

@RestController
@RequestMapping("/api/component")
public class ComponentController {

	@Autowired
	ComponentService componentService;

	@PostMapping
	public String createUser(@RequestBody Components components) throws Exception {
		componentService.saveComponent(components);
		return components.getId();
		
	}
	
	@GetMapping
	List<Components> getComponents() {
		return componentService.getComponent();
	}
	
	@GetMapping("/process/{id}")
	private Components getComponetsById(@PathVariable("id") String id) {
		System.out.println(componentService.getComponentsById(id));
		return componentService.getComponentsById(id);
	
	}
	


//	private ResponseEntity<Components> generateResponse(Optional<Components> components) {
//		return components.isPresent() ? new ResponseEntity(components, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}

}
