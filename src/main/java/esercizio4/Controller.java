package esercizio4;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

	@PostMapping(path = "/reverse")
	@CrossOrigin(origins = "http://localhost:8080")
	public String reversatore(@RequestBody String name) {
		StringBuilder reversata = new StringBuilder(name);
		return reversata.reverse().toString();
	}
	@GetMapping(path = "/name")
	@CrossOrigin(origins = "http://localhost:8080")
	public String namer (@RequestParam String name) {
		StringBuilder namer = new StringBuilder(name);
		return namer.toString();
	}

}
