import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStarted();
	}
	

	public static void getStarted() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input your number of employee");
		int number = 0;
		int count = 0;
		number = kb.nextInt();
		String[] employ_name = new String[number];
		int[] employ_wage = new int[number];
		System.out.println("Your number of employee is "+number);
		// รับข้อมุลจาก user จำนวนของพนักงาน
		for (int i = 0; i < number; i++) {
			System.out.print("input Name of employee ");
			employ_name[i] = kb.next();
			System.out.print("input Wage of employee ");
			employ_wage[i] = kb.nextInt();
			count++;
			
			//output
			if(count == number) {	
				count =0;
				/*System.out.println(Arrays.toString(employ_name));
				System.out.println(Arrays.toString(employ_wage));*/
				
				for (int j = 0; j < number; j++) {
					count++;
					System.out.println("Employ["+count+"]  "+employ_name[j]+"  "+employ_wage[j]+" Bath");
				
				}

			}
		}
		System.out.println("-------------- Table for wokr -------------- ");
			
		
		
		
	}
	

}
