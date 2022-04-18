package com.cg.placement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "certificate")
public class Certificate {
	
	@Id
	@JoinColumn(name = "certificate_id")
	private int id;
	private int year;
	
	@ManyToOne                         //association with College M:1
	@JoinColumn(name = "college_id")
	private College college;
	
	@OneToOne(mappedBy = "certificate")    //association with Student 1:1
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
