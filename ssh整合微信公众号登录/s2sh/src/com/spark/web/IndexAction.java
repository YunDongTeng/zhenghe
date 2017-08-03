package com.spark.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spark.model.Student;
import com.spark.service.StudentService;


public class IndexAction extends ActionSupport {

	@Autowired
	private StudentService studentService;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {

		System.out.println("hello..");

		List<Student> list = studentService.getStudentList();

		for (Student stu : list) {
			System.out.println(stu);
		}

		return "success";
	}

}
