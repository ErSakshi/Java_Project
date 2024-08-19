package com.qsp.view;

import java.util.Scanner;

import java.util.List;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {
   public static void main(String []args)
   {
//	   //1st step
//   Employee e=new Employee();
//   e.setId(101);
//   e.setName("XYZ");
//	   e.setSalary(999);
////	   e.setId(102);
////	   e.setName("PQR");
////		   e.setSalary(888);
//	   EmployeeController.insert(e);
//   System.out.println("inserted");
	   
	   //2nd Step
//	 Employee e=EmployeeController.fetchById(101);
//	 System.out.println(e.getName());
	 //3rd step to update
//	 boolean b=EmployeeController.updateNameById(101, "ABC");
//	 System.out.print(b);
	 
	 //4th step to delete 
//	 boolean b=EmployeeController.deleteById(101);
//	 System.out.print(b);
//  boolean b=EmployeeController.updateSalaryById(101, 1000);
//    System.out.println(b);
//    List<Employee> li=EmployeeController.fetchAll();
//    for(Employee e1:li) {
//    	System.out.println(e1);
   // }
	   Scanner sc=new Scanner(System.in);
	   
	    System.out.println("----WELCOME----");
	   do {
		   System.out.println("1->insert Employee");
		   System.out.println("2->update employee name by Id");
		   System.out.println("3->fetch Employee by Id");
		   System.out.println("4->delete Employee by Id");
		   System.out.println("5->fetch all Employee");
		   
		   switch(sc.nextInt()) {
		   case 1:{
			   Employee e=new Employee();
			   System.out.println("enter id");
			   e.setId(sc.nextInt());
			   System.out.println("enter name");
			   e.setName(sc.next());
			   System.out.println("enter salary");
			   e.setSalary(sc.nextDouble());
			   EmployeeController.insert(e);
			   System.out.println("inserted-----!");
			  
		   }
		   break;
		   case 2:{
			   System.out.println("enter id");
			   int id=sc.nextInt();
			   System.out.println("enter new name");
			   String newName=sc.next();
			   boolean b=EmployeeController.updateNameById(id, newName);
			   if(b) {
				   System.out.println("updated------!");
			   }else {
				   System.out.println("id is not present");
			   }
		   }break;
		   case 3:{
			System.out.println("enter id");
			Employee e=EmployeeController.fetchById(sc.nextInt());
			System.out.println(e);
		   }break;
		   case 4:{
			  System.out.println("enter id");
			  boolean b=EmployeeController.deleteById(sc.nextInt());
			  if(b) {
				  System.out.println("deleted-----!");
			  }else {
				  System.out.println("id is not present");
			  }
		   }break;
		   case 5:{
			   List<Employee>li=EmployeeController.fetchAll();
			   for(Employee e:li)
				   System.out.println(e);
		  }
		   break;
		   case 6:{
			   EmployeeController.closeConnection();
			   System.out.println("Connection is closed");
		   }
		   default :
			   System.out.println("Wrong Info");
		   }   
		  System.out.println("enter y to continue"); 
	   }while("Y".equalsIgnoreCase(sc.next()));
	   
   }
   
   
}
