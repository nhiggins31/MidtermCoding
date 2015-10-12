package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import com.cisc181.core.Person;
import com.cisc181.eNums.eTitle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	private Date Invalid_DOB;
	private static int Salary1 = 50000;
	private static int Salary2 = 60000;
	private static int Salary3 = 70000;
	private static int Salary4 = 80000;
	private static int Salary5 = 90000;
	
	private static Employee Employee1 = new Employee();
	private static Employee Employee2 = new Employee();
	private static Employee Employee3 = new Employee();
	private static Employee Employee4 = new Employee();
	private static Employee Employee5 = new Employee();
	
	private static String invalid_phone_number = "1234567";
	private static Calendar birthDate = Calendar.getInstance();
	
			
	private static ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	private static ArrayList<Integer> Salaries = new ArrayList<Integer>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		listOfStaff.add(new Staff(eTitle.DEAN));
		Salaries.add(Salary1);
		Salaries.add(Salary2);
		Salaries.add(Salary3);
		Salaries.add(Salary4);
		Salaries.add(Salary5);
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		listOfStaff = null;
		Salaries = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalary() {
		assertTrue((Salary1 + Salary2 + Salary3 + Salary4 + Salary5)/5 == (Employee1.getSalary() +
				Employee2.getSalary() + Employee3.getSalary() + Employee4.getSalary() +
				Employee5.getSalary()));
		assertFalse((Salary1 + Salary2 + Salary3 + Salary4 + Salary5)/5 != (Employee1.getSalary() + 
				Employee2.getSalary() + Employee3.getSalary() + Employee4.getSalary() + 
				Employee5.getSalary()));
	}
	
	@Test(expected = PersonException.class)
	public void testPhoneNumber() throws PersonException {
		// calls the PrintPhoneNumber method in Person, passing through invalid number to throw exception
		Person.PrintPhone_number(invalid_phone_number);
	}
	@Test
	public void testDOB() throws PersonException {
		birthDate.setTime(Invalid_DOB);
		Person.printDOB(Invalid_DOB);
	}
}