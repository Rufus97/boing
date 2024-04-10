package esercizio4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
	
	@GetMapping(path = "/prova")
	public String prova(@RequestParam String nome) {
		return ;
	}

	}
}
