import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

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
		int[] employ_day = new int[number];
		int[] employ_salary = new int[number];
		System.out.println("Your number of employee is "+number);
		int sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		// �Ѻ�����Ũҡ user �ӹǹ�ͧ��ѡ�ҹ
		for (int i = 0; i < number; i++) {
			count++;
			System.out.print("input Name and Wage of employee and day for work "+"["+count+"] ");
			employ_name[i] = kb.next(); 
			employ_wage[i] = kb.nextInt(); 
			employ_day[i] = kb.nextInt();
			employ_salary[i] = getWork(employ_day[i],employ_wage[i]); // send work for day
			stack.push(sum = sum+employ_salary[i]);
			//output
			getData(number,employ_name[i], employ_wage[i],employ_day[i],employ_salary[i]);

			if(count == number) {	
				System.out.println("����ͧ���·����� "+stack.pop());
				/*	count =0;
				for (int j = 0; j < number; j++) {
					count++;
					System.out.println("Employ["+count+"] ���� => "+employ_name[j]+" ��Ҩ�ҧ => "+employ_wage[j]+"�ҷ =>"+" �ѹ���ӧҹ =>"+employ_day[j]+"�ѹ �Թ��͹������Ѻ =>"+employ_salary[j]);
				}
				 */
			}
		}
	}
	public static int getWork(int day,int wage) {
		int work = day * wage;
		return work;

	}
	public static void getData(int number,String name ,int wage,int day,int salary) {
		int count;
		//��С�ȵ����
		int num = number;
		String name1  = name;
		int wage1 = wage;	
		int day1 = day;
		int salary1 = salary;
		System.out.println("Employ["+num+"] ���� => "+name1+" ��Ҩ�ҧ => "+wage1+"�ҷ =>"+" �ѹ���ӧҹ =>"+day1+"�ѹ �Թ��͹������Ѻ =>"+salary1);



	}


}
