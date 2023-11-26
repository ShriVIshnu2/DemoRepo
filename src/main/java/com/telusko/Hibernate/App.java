package com.telusko.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student stu1 = new Student(01, "Kunal", 60);
    	Student stu2 = new Student(02, "Raj Vikramadiya", 70);
    	
    	Configuration con = new Configuration().configure("/Hibernate/src/main/java/hibernate.cfg.xml").addAnnotatedClass(Student.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session ses = sf.openSession();
    	
    	Transaction tx = ses.beginTransaction();
    	
    	ses.save(stu1);
    	
    	tx.commit();
    	
    	
    }
}
