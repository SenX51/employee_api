package edu.practice.employee_api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Entity
@Table(name = "Passports")
@NoArgsConstructor
@Data
public class Passport
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Integer series;
	@Column(nullable = false)
	private Integer number;
	@Column(nullable = false)
	private Date date;
	@OneToOne(mappedBy = "passport", cascade = CascadeType.ALL)
	@JsonBackReference
	private Employee employee;

	public Passport(Integer _series, Integer _number, Date _date)
	{
		this.series = _series;
		this.number = _number;
		this.date = _date;
	}
}
