package com.cg.placement.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.placement.entities.Admin;
import com.cg.placement.entities.Certificate;
import com.cg.placement.entities.College;
import com.cg.placement.entities.Placement;
import com.cg.placement.entities.Student;
import com.cg.placement.entities.User;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICertificateService;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IPlacementService;
import com.cg.placement.service.IStudentService;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.PlacementServiceImpl;
import com.cg.placement.service.StudentServiceImpl;
import com.cg.placement.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		////CRUD OPERATION for all the Entities
		
		Student student = new Student();
		IStudentService Sservice = new StudentServiceImpl();
		
		Certificate certificate = new Certificate();	
		ICertificateService Crserivece = new CertificateServiceImpl();
		
		Placement placement = new Placement();
		IPlacementService Pservice = new PlacementServiceImpl();	
		
		Placement placement1 = new Placement();
		IPlacementService Pservice1 = new PlacementServiceImpl();
	
		
	    College college=new College();
		ICollegeService Cservice= new CollegeServiceImpl();
		
		College college1=new College();
		ICollegeService Cservice1 = new CollegeServiceImpl();
		
		User user = new User();
		IUserService Uservice = new  UserServiceImpl();
			
		Admin admin = new Admin();
		
		// Student, Certificate and College Association
/*
		    //college record create
		   	college.setCollegeadmin("MS");
			college.setId(30);
			college.setCollegename("Ranchi College");
			college.setLocation("Ranchi, Chennai");
			Cservice.addCollege(college);
			
			//certificate record create 
      	    certificate.setId(6);
	        certificate.setYear(2019);
   		    certificate.setCollege(college);
			Crserivece.addCertificate(certificate);
		
               
		    //Student record create 
		      student.setId(6);
		      student.setName("Ms Dhoni");
	          student.setRoll(7);
	          student.setQualification("B.Com");
	          student.setCollege(college);
		      student.setCourse("Commerce");
              student.setCertificate(certificate);
		      student.setYear(2019);
	          student.setHallTicketNo(057);
	          Sservice.addStudent(student);
		
		      
				List<Student> list=new ArrayList<Student>();
				list.add(student);
				college.setStudent(list);
				certificate.setStudent(student);
				
				List<Certificate> list1=new ArrayList<Certificate>();
				list1.add(certificate);
				college.setCertificate(list1);
				student.setCertificate(certificate);
				
				
				System.out.println("Record is added to the database...");
		*/		
				// Create   //association college, user and admin
		/*		
	        	admin.setId(6);
				admin.setName("zubeir");
				admin.setPassword("7863");
				admin.setUser(user);
					
				college.setId(6);
				college.setCollegeadmin("DOC");
				college.setCollegename("RYMEC College");
				college.setLocation("Karnataka Ballari");
				Cservice.addCollege(college);
					
				user.setId(6);
				user.setName("Mohammed Zubeir");
				user.setType("user");
				user.setPassword("7863");
				user.setAdmin(admin);
				user.setCollege(college);
				Uservice.addUser(user);
				
				System.out.println("Record added ");
		*/
				// Creating College record // college and placement association

		/*			college.setCollegeadmin("BITM");
					college.setId(100);
					college.setCollegename("Mangalore College");
					college.setLocation("Mangalore");
					Cservice.addCollege(college);
					
					// Creating Placement record
					
					placement.setP_id(1);
					placement.setS_name("K.L Rahul");
					placement.setCollege(college);
					placement.setDate("18/04/1992"); 
					placement.setQualification("BE");
					placement.setYear(2021);
					
					Pservice.addPlacement(placement);
					
					placement1.setP_id(2);
					placement1.setS_name("Sameer");
					placement1.setCollege(college);
					placement1.setDate("12/03/1997");
					placement1.setQualification("BE");
					placement1.setYear(2021);
					
					Pservice1.addPlacement(placement1);
					
					List<Placement> list2 = new ArrayList<Placement>();
					list2.add(placement1);
					list2.add(placement);
					college.setPlacement(list2);
					
					System.out.println("Record added to the database");
		*/		
					
		// Create	// admin and user association
	/*	EntityManagerFactory fact = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = fact.createEntityManager();
		
		 em.getTransaction().begin();

		
			admin.setId(8);
			admin.setName("Zubeir");
			admin.setPassword("Zubeir@786");
			admin.setUser(user);
					
			user.setId(13);
			user.setName("Ishtiaq Ahmed");
			user.setType("user");
			user.setPassword("ahmed@123");
			user.setAdmin(admin);
			Uservice.addUser(user);				
					
		    em.getTransaction().commit();			
		System.out.println("Record added is added to the database");
	 */	

	//======================================================================================
	
		// Retrieve Placement record
	/*		System.out.println("Placement Details are : ");
			placement = Pservice.searchPlacementById(1);
			
			college = Cservice.searchCollegeById(100);
			System.out.println("ID is:"+placement.getP_id());
			System.out.println("Student Name is:"+placement.getS_name());
						
			System.out.println("College name is:"+college.getCollegename());
			System.out.println("Qualification is:"+placement.getQualification());
			System.out.println("Date is:"+placement.getDate());
			System.out.println("Year is:"+placement.getYear());
					
		// Retrieve college record
			System.out.println("********************************");
			System.out.println("College Details are : ");
			
			college = Cservice.searchCollegeById(100);
			System.out.println("College id :" + college.getId());
			System.out.println("College Admin is : "+college.getCollegeadmin());
			System.out.println("College name is : "+college.getCollegename());
		*/
						
		// Retrieve student record
		/*	System.out.println("Student details are...");
			student = Sservice.searchStudentById(2);
			System.out.println("Student id : "+student.getId());
			System.out.println("Student name : "+student.getName());
			System.out.println("Student course : "+student.getCourse());
				
									
		// Retrieve certificate record
			System.out.println("*********************************");
			System.out.println("Certificate Details are : ");
			
		   certificate = Crserivece.searchCertificateById(2);
		   student = Sservice.searchStudentById(2);
		   college = Cservice.searchCollegeById(26);
		   System.out.println("Certificate id : "+certificate.getId());
		   System.out.println("Certificate student name : "+student.getName());
		   System.out.println("Certificate college name  : "+college.getCollegename());
		   System.out.println("Certificate year : "+certificate.getYear()); 
		*/				
    //****************************************************************

		 // Update Placement record
    	/*	placement1 = Pservice1.searchPlacementById(2);
			placement1.setS_name("Sameer P");
			Pservice1.updatePlacement(placement1);
			System.out.println("Update is successful");
	 */
					
		 // Update college record
	/*	    college = Cservice.searchCollegeById(100);
			college.setLocation("Mangalore near Malpi Beach");
			college = Cservice.updateCollege(college);	
			System.out.println("Update is successful");
	*/	
		 
		  // Update Student record
	/*	  student = Sservice.searchStudentById(2);
		  student.setRoll(5);
		  Sservice.updateStudent(student);
		  System.out.println("Update is successful");
	*/

		//************************************************************
		// Delete Placement record				
	   /* 	
		    placement1 = Pservice1.searchPlacementById(2);
			Pservice1.cancelPlacement(placement1);			
		    System.out.println("Canceled and Deletion is successful");
		*/
		
		//************************************************************
		//Delete Student record
	/*	student = Sservice.searchStudentById(6);
		Sservice.deleteStudent(student);
		System.out.println("Deleted successfully");
     */
}
}	