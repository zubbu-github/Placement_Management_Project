package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.Student;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		// Creating an object of all entity files
		Student student = new Student();
		student.setName("Gautam Gambhir");
		student.setCollege("Delhi University");
		student.setRoll(5);
		student.setQualification("BE");
		student.setCourse("EEE");
		student.setYear(2005);
		student.setHallTicketNo(25); 
		
	  //Certificate Instances(Record)
		Certificate certificate = new Certificate();
	    certificate.setYear(2011);
	    certificate.setCollege("Kolkata University");
	    
	  //One to One Mapping
	    student.setCertificate(certificate);
	    certificate.setStudent(student);
	    
	    IStudentService service = new StudentServiceImpl();
	    service.addStudent(student);
	   
        System.out.println("Student and Certificate details is added to the database");
     
		//Retrieve
    /*    student = service.searchStudentById(101);
        System.out.println("ID is : " + student.getId());
        System.out.println("College is  : " + student.getCollege());
        System.out.println("Year is : " + student.getYear());
       
        
		//Update
        student = service.searchStudentById(100);
        student.setCollege("VTU University");
        service.updateStudent(student);
        System.out.println("Updated Successfully");
        
        //Delete
        student = service.searchStudentById(102);
        service.deleteStudent(student);
        System.out.println("Deleted Successfully");
        
	}*/
 }
}
