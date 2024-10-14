package com.praveenit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")

public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "employee_id")
		private Integer id;
		@Column(name = "emp_name")
		private String name;
		@Column(name = "emp_marks")
		private Integer marks;
}
