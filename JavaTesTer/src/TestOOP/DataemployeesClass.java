package TestOOP;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class DataemployeesClass {

	private String employ_name;
	private int employ_wage;
	private int employ_day;

	// default constructor
	public DataemployeesClass() {

	}
	// Constructor
	public DataemployeesClass(String name,int wage,int day) {
		this.employ_name = name;
		this.employ_wage = wage;
		this.employ_day = day;
	}	
	// setter data 
	public void setData(String name,int wage,int day) {
		this.employ_name = name;
		this.employ_wage = wage;
		this.employ_day = day;
	} 
	// getter data
	public String getDataname() {
		return  employ_name;
	}
	public int getDatawage() {
		return  employ_wage;
	}
	public int getDataday() {
		return  employ_day;
	}
	// get working
	public int getSalary(int w , int d) {
		int work = w * d;
		return work;
	}
	// get date()
	public void getdatetime() {
		//date format
		Date curDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String DateToStr = format.format(curDate);
		format = new SimpleDateFormat("dd-M-yyyy");
		DateToStr = format.format(curDate);
		System.out.println("**** "+DateToStr+" ****");
		
	}
	// get started()
	public void getStart () {
		Scanner kb = new Scanner(System.in);
		getdatetime();
		
		System.out.println("plese input number of employee");
		int number = kb.nextInt();
		int count = 0;
		System.out.println("plese input Data employee -> Name , Wage , Day");
		Stack stack = new Stack();
		for (int i = 0; i < number; i++) {
			String name = kb.next();
			int wage = kb.nextInt();
			int day = kb.nextInt();
			setData(name, wage, day);
			stack.add(toString());
			count++;
		}
		// print all data of employee
		if(count == number) {
			for (int i = 0; i < stack.size(); i++) {
				System.out.println(stack.get(i));	
				
			}
		}
	}
	// get tostring()
	public String toString() {
		return "Name "+employ_name+" Wage "+employ_wage+" Wokring Day "+employ_day+" Salary "+getSalary(this.employ_wage,employ_day);
	}

}
