package com.cisc181.core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Student_Test{
	/**
	 * @throws java.lang.Exception
	 */

	@BeforeClass
	public static void setUpBeforeClass() {

		ArrayList<Course> CourseList = new ArrayList<Course>();
		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();
		CourseList.add(course1);
		CourseList.add(course2);
		CourseList.add(course3);
		
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		Semester fallSemester = new Semester();
		Semester springSemester = new Semester();
		SemesterList.add(fallSemester);
		SemesterList.add(springSemester);
		
		ArrayList<Section> SectionList = new ArrayList<Section>();
		Section course1semester1 = new Section();
		Section course1semester2 = new Section();
		Section course2semester1 = new Section();
		Section course2semester2 = new Section();
		Section course3semester1 = new Section();
		Section course3semester2 = new Section();
		SectionList.add(course1semester1);
		SectionList.add(course1semester2);
		SectionList.add(course2semester1);
		SectionList.add(course2semester2);
		SectionList.add(course3semester1);
		SectionList.add(course3semester2);
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student10 = new Student();
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		StudentList.add(student4);
		StudentList.add(student5);
		StudentList.add(student6);
		StudentList.add(student7);
		StudentList.add(student8);
		StudentList.add(student9);
		StudentList.add(student10);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testEnrollment() {
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().cours2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student1.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student2.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student3.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student4.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student5.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student6.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student7.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student8.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student9.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
		
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course1semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course1semester2.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course2semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course2semester2.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course3semester1.getSectionID());
		Enrollment(setUpBeforeClass().student10.getStudentID(), setUpBeforeClass().course3semester2.getSectionID());
	}
}