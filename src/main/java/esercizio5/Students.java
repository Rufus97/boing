package esercizio5;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "students")

public class Students {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long id



}
