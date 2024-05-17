package esercizio7;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	String modelName;
	String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
