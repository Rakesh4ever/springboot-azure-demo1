package com.kumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDemoController {

	@GetMapping("/geMessage")
	public String getConnectionWithAzure() {
		return "Conneted to the Azure cloud : Deployed successfully2";
	}
}
