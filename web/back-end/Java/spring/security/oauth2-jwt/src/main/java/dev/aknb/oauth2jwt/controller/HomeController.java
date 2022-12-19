package dev.aknb.oauth2jwt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home(Principal principal) {
		return "Hello, " + principal.getName();
	}

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/secure")
	public String secure() {
		return "This is secured!";
	}
}