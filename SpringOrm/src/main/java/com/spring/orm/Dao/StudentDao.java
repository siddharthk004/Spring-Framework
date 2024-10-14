package com.spring.orm.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.entities.Student;
import jakarta.transaction.Transactional;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	// save student
	@Transactional
	public int insert(Student std)
	{
		//insert
		Integer i = (Integer) this.hibernateTemplate.save(std);
		return i;
	}
	
	// get the single object
	public Student getStudent(int std_id)
	{
		Student std = this.hibernateTemplate.get(Student.class,std_id);
		return std;
	}
	
	// get the all rows
	public List<Student> getAllStudent()
	{
		List<Student> std = this.hibernateTemplate.loadAll(Student.class);
		return std;
	}
	
	//deleting the Data
	@Transactional 
	public void DeleteStudent(int std_id)
	{
		Student std = this.hibernateTemplate.get(Student.class, std_id);
		this.hibernateTemplate.delete(std);
	}
	
	//updating Data
	@Transactional
	public void UpdateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
}
