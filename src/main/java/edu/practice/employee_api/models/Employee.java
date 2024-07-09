package edu.practice.employee_api.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employees")
@NoArgsConstructor
@Data
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String surname;
	@Column(nullable = false)
	private Float salary;
	@OneToOne
	@JoinColumn(name = "passport_id", referencedColumnName = "id")
	@JsonManagedReference
	private Passport passport;

	public Employee(String _name, String _surname, Float _salary, Passport _passport) {
		this.name = _name;
		this.surname = _surname;
		this.salary = _salary;
		this.passport = _passport;
	}

}
