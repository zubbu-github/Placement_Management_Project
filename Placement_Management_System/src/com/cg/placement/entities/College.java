package com.cg.placement.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "college")
public class College {

		@Id
		private int id;
		private String collegename;
		private String collegeadmin;
		private String location;

		@OneToOne(mappedBy ="college")          //association with User 1:1
		private User user;
		
		@OneToMany(mappedBy="college",cascade=CascadeType.ALL)    // association with placement 1:M
		private List<Placement> placement;

		@OneToMany(mappedBy="college",cascade=CascadeType.ALL)		// association student 1:M
		private List<Student> student;
		
		@OneToMany(mappedBy="college",cascade=CascadeType.ALL)		// association with certificate 1:M
		private List<Certificate> certificate;

		public int getId() {
			return id;
		}

		public String getCollegeadmin() {
			return collegeadmin;
		}

		public void setCollegeadmin(String collegeadmin) {
			this.collegeadmin = collegeadmin;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public List<Placement> getPlacement() {
			return placement;
		}

		public void setPlacement(List<Placement> placement) {
			this.placement = placement;
		}

		public List<Student> getStudent() {
			return student;
		}

		public void setStudent(List<Student> student) {
			this.student = student;
		}

		public List<Certificate> getCertificate() {
			return certificate;
		}

		public void setCertificate(List<Certificate> certificate) {
			this.certificate = certificate;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCollegename() {
			return collegename;
		}

		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

}

