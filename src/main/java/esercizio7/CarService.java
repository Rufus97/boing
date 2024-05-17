package esercizio7;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CarService {

	private final CarRepository carRepository;

	public CarService(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	public Car save(Car car) {
		return carRepository.save(car);
	}

	public List<Car> getAllCar() {
		return carRepository.findAll();

	}

	public Optional<Car> getCarById(Long id) {
		return carRepository.findById(id);
	}

	public boolean existsById(Long id) {
		return carRepository.existsById(id);
	}

	public void deleteById(Long id) {
		carRepository.deleteById(id);
	}

	public void delete(Car car) {
		carRepository.delete(car);
	}

	public Car update(Car car) {
		return carRepository.save(car);
	}

	public void deleteAll() {
		carRepository.deleteAll();
	}

}
