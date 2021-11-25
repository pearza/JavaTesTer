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
	private int employ_salary;
	private int employ_withdraw;
	private int employ_remain;

	// default constructor
	public DataemployeesClass() {

	}
	// Constructor
	private DataemployeesClass(String name,int wage,int day) {
		this.employ_name = name;
		this.employ_wage = wage;
		this.employ_day = day;
	}	
	// setter data 
	private void setData(String name,int wage,int day,int withdraw) {  
		this.employ_name = name;
		this.employ_wage = wage;
		this.employ_day = day;
		this.employ_withdraw = withdraw;
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
	public int getDatasalary() {
		return  employ_salary;
	}
	public int getDatawaithdraw() {
		return  employ_withdraw;
	}
	public int getDataRemain() {
		return  employ_remain;
	}
	
	
	// get withdraw
	private static int getWithdraw(int w,int d ,int wd) {
		int wd1 = getSalary(w,d) - wd;
		return  wd1;
	}
	// get working
	private static int getSalary(int w , int d) {
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
		int count = 0;
		getdatetime();
		System.out.print("plese input number of employee ");
		int number = kb.nextInt();
		System.out.println("plese input Data employee -> Name , Wage , Day , Withdraw");
		Stack stack = new Stack();
		int remain = 0;
		for (int i = 0; i < number; i++) {
			count++;
			//System.out.print("(" +count+") ");
			String name = kb.next();
			int wage = kb.nextInt();
			int day = kb.nextInt();
			int withdraw = kb.nextInt();
			setData(name, wage, day,withdraw);
			remain = remain + getWithdraw(employ_wage,employ_day,employ_withdraw);
			stack.add(toString());
			
			
		}
		// print all data of employee
		if(count == number) {
			System.out.println();
			int a = 0;
			for (int i = 0; i < stack.size(); i++) {
				a++;
				System.out.println("("+a+") "+stack.get(i));	
				
			}
			
			System.out.println("*** All remaining = "+remain +" Bath ***");
		}
	}
	// get tostring()
	public String toString() {
		return "Name : "+getDataname()+" \n"
				+"  Wage : "+getDatawage()+" \n"
				+"  Wokring Day : "+getDataday()+" \n"
				+"  Salary : "+getSalary(employ_wage,employ_day)+" - "+ getDatawaithdraw()+"(withdraw)\n"
				+"  Remaining : "+getWithdraw(employ_wage,employ_day,employ_withdraw)+" \n";
	}

}
