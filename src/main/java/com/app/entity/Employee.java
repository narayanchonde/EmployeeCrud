package com.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Employee_tab")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id_col")
	private Long id;

	@Column(name="emp_fname_col")
	private String lname;

	@Column(name="emp_salary_col")
	private String salary;
	
	@Column(name="emp_dept_col")
	private String dpet;
	
	@Column(name="emp_gender_col")
	private String gender;
	
	@Column(name="emp_mobile_col")
	private String mobile;
	
	@Column(name="emp_email_col")
	private String email;

	@OneToMany
	@JoinColumn(name="addr_id_fk_col")
	private  List<Address> addr;
}
