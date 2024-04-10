package esercizio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

	@GetMapping(path = "/ciao")
	public Saluto ciao(@RequestParam String nome, @RequestParam String provincia) {
		return new Saluto(nome, provincia);
	}

}
