package com.dhruv;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        try {
        	Configuration cfg = new Configuration();
        	cfg.configure();
        	SessionFactory sf = cfg.buildSessionFactory();
        	Session sess = sf.openSession();
        	Scanner sc = new Scanner(System.in);
        	
        	Student s = new Student();
        	Transaction tx = sess.beginTransaction();
        	System.out.println("STUDENT MANAGEMENT SYSTEM USING HIBERNATE");
        	System.out.println("1. Add a new Student");
        	System.out.println("2. Update an Old Student");
        	System.out.println("3. Delete an Old Student");
        	System.out.println("4. View an Old Student");
        	System.out.println("Enter your choice : ");
        	Integer choice = sc.nextInt();
        	
        	switch (choice) {
			case 1:
			{
				System.out.println("Enter Student's Roll No. :");
				s.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter Student's Name :");
				s.setName(sc.nextLine());
				System.out.println("Enter Student's Age :");
				s.setAge(sc.nextInt());
				System.out.println("Enter Student's Percentage :");
				s.setPer(sc.nextFloat());
				sc.nextLine();
				System.out.println("Enter Student's Address :");
				s.setAdd(sc.nextLine());
				
				sess.save(s);
	        	tx.commit();
	        	System.out.println("Data inserted Succesfully...");
				
			}
			    break;
			
			case 2:
			{
				System.out.println("STUDENT MANAGEMENT SYSTEM USING HIBERNATE");
				System.out.println("Enter Student's Roll No. :");
				Student stu=(Student)sess.get(Student.class, sc.nextInt());
				sc.nextLine();
				
				System.out.println("5. To update Student's Name");
				System.out.println("6. To update Student's Age");
				System.out.println("7. To update Student's Percentage");
				System.out.println("8. To update Student's Address");
				Integer c = sc.nextInt();
				sc.nextLine();
				
				switch (c) {
				case 5:
				{
					System.out.println("Enter New Student's Name :");
					stu.setName(sc.nextLine());
					sess.update(stu);
					tx.commit();
					System.out.println("Name Updated Succesfully...");
				}
					break;
				case 6:
				{
					System.out.println("Enter New Student's Age :");
					stu.setAge(sc.nextInt());
					sess.update(stu);
					tx.commit();
					System.out.println("Age Updated Succesfully...");
				}
					break;
				case 7:
				{
					System.out.println("Enter New Student's Percentage :");
					stu.setPer(sc.nextFloat());
					sess.update(stu);
					tx.commit();
					System.out.println("Percentage Updated Succesfully...");
				}
					break;
				case 8:
				{
					System.out.println("Enter New Student's Address :");
					stu.setAdd(sc.nextLine());
					sess.update(stu);
					tx.commit();
					System.out.println("Address Updated Succesfully...");
				}
					break;
				default:{
					System.out.println("You've entered a Wrong Number !!!");
				}
					break;
				}
				break;
			}
			case 3:
			{
				System.out.println("Enter Student's Roll No. :");
				s.setId(sc.nextInt());
				sess.delete(s);
	        	tx.commit();
	        	System.out.println("Data deleted Succesfully...");
			}
			    break;
			case 4:
			{
				System.out.println("Enter Student's Roll No. :");
				Student stu=(Student)sess.get(Student.class, sc.nextInt());
				System.out.println("Student's ID : "+stu.getId());
				System.out.println("Student's Name : "+stu.getName());
				System.out.println("Student's Age : "+stu.getAge());
				System.out.println("Student's Percentage : "+stu.getPer());
				System.out.println("Student's Address : "+stu.getAdd());
				
	        	tx.commit();
	        	System.out.println("Data Shown Succesfully...");
			}
                break;
			default:{
				System.out.println("You've entered a Wrong Number !!!");
			}
				break;
			}

        	sc.close();
        	sess.close();
        	
        }
        catch(Exception e) {
        	System.out.println(""+e.getMessage());
        }
    }
}
