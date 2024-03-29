package com.ranjit.SpringCore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ranjit.SpringCore.jdbc.dao.JdbcConfiguration;
import com.ranjit.SpringCore.jdbc.dao.StudentDao;
import com.ranjit.SpringCore.jdbc.dao.StudentDaoImp;
import com.ranjit.SpringCore.jdbc.entity.Student;

public class Test {

	public static void main(String[] args) {

		// Not recomended
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjit/SpringCore/jdbc/congigurationjdbc.xml");
		 *  JdbcTemplate bean = context.getBean("jdbcTemplate", JdbcTemplate.class); String
		 * query="insert into student(id,name,city) values(?,?,?)"; int result =
		 * bean.update(query,456,"ranjit Sutar","Rourkela"); System.out.println(result);
		 */

//		 ApplicationContext context = new ClassPathXmlApplicationContext("com/ranjit/SpringCore/jdbc/congigurationjdbc.xml");
	
		// Annotation
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		 Student student1= new Student();
		 //Insert Data
//		 student1.setId(123);
//		 student1.setName("CHandan Mohapatra");
//		 student1.setCity("Bhubaneswar");
//		 
//		 int insert = studentDao.insert(student1);
//		 System.out.println(insert);
		 
		 
		 // Update Data
//		 student1.setId(456);
//		 student1.setName("Sumit");
//		 student1.setCity("jharsuguda");
//		 int change = studentDao.change(student1);
//		 System.out.println(change);
		 
		 //Delete Data
//		 
//		 int delete = studentDao.delete(123);
//		 System.out.println(delete);
		 
		 
		 //singale data retrive
//		 Student student = studentDao.getSingleStudent(456);
//		 System.out.println(student);
		 
		 
		 //get all student data
		 
		List<Student> allStudent = studentDao.getAllStudent();
		System.out.println(allStudent);
	
		
	
	}
}
