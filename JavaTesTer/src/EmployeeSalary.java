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
		System.out.println("��س����ӹǹ��ѡ�ҹ");
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
		System.out.println("----****** ��س�������,��Ҩ�ҧ,�ӹǹ�ѹ���ӧҹ�����Ф��駷���������顴 space bar ******----");
		for (int i = 0; i < number; i++) {
			count++;
			System.out.print("["+count+"] "+"��س�������,��Ҩ�ҧ,�ӹǹ�ѹ���ӧҹ -> ");
			employ_name[i] = kb.next(); 
			employ_wage[i] = kb.nextInt();
			employ_day[i] = kb.nextInt();

			// call function
			employ_salary[i] = getWork(employ_day[i],employ_wage[i]); // send work for day
			stack.push(sum = sum+employ_salary[i]); //
			
			if(count == number) {
				count =0; 
				for (int j = 0; j < number; j++) {
					count++;
					System.out.println("�ӴѺ["+count+"] ����=> "+employ_name[j]+" ��Ҩ�ҧ=>"+employ_wage[j]+"�ҷ=>"+" �ѹ���ӧҹ=>"+employ_day[j]+"�ѹ �Թ��͹������Ѻ=>"+employ_salary[j]);	
				}
				System.out.println("����ͧ���·����� "+stack.pop());
			}
		}
	}	   

	public static int getWork(int day,int wage) {
		int work = day * wage;
		return work;

	}
}
