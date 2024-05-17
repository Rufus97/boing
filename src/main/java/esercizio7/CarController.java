package esercizio7;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/car")
public class CarController {

	private final CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@PostMapping
	public ResponseEntity<Car> createCar(@RequestBody Car car) {
		Car auto = carService.save(car);
		return new ResponseEntity<>(auto, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Car>> returnListofCars() {
		List<Car> carList = carService.getAllCar();
		return new ResponseEntity<>(carList,HttpStatus.OK)
	}

	@GetMapping("/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable Long id) {
		Optional<Car> car = carService.getCarById(id);
		if (carService.existsById(id)) {
			return new ResponseEntity<>(car.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Optional<Car>> updateCar(@PathVariable Long id, @RequestBody Car car) {
		if (carService.existsById(id)) {
			Optional<Car> carOptional = carService.getCarById(id);
			Car car = carOptional.get();
			car.setType(type);
			carService.saveCar(car);
			return new ResponseEntity<>(Optional.of(car), HttpStatus.OK);
		}
	}

}
