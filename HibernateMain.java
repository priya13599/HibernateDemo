package com.nucleus.execution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nucleus.entity.Student;

public class HibernateMain {
public static void main(String[] args) 
{
Configuration configuration=new Configuration();
configuration.configure();
SessionFactory sessionFactory=configuration.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction transaction=session.beginTransaction();
/*Student student=new Student();
student.setStudentId(1);
student.setStudentName("aaaaa");
session.persist(student);
System.out.println("saved");
*/
Student student=(Student)session.get(Student.class, 2);
System.out.println(student.getStudentId()+" "+student.getStudentName());
transaction.commit();
session.close();
sessionFactory.close();




}
}
