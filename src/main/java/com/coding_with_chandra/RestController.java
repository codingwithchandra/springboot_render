package com.coding_with_chandra;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/")
	public String load() {
		
		return "welcome coding with chandra";
	}

}
