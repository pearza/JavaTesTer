package GameOOP;

import java.util.Scanner;

public class CharacterClass {
	private static String ct_name;
	private static int ct_hp;
	private static int ct_level;
	private static int ct_dmg;
	
	
	public CharacterClass() {	

	}
	public CharacterClass(String ct_name, int ct_hp, int ct_dmg) {
		this.ct_name = ct_name;
		this.ct_hp = ct_hp;
		this.ct_dmg = ct_dmg;
		
	}
 
	public static void getStart(String id) {
		mkChracter(id);
		 
	}
	public static void mkChracter(String user) {
		CharacterClass ch = new CharacterClass();
		System.out.println("**** Create Character ****");	
		Scanner kb = new Scanner(System.in);
		
		// Default beginner
		ct_dmg = 10;
		ct_hp = 100;
		ct_level = 1;
		
		System.out.println("USER ID =>"+user);
		System.out.print("Input Youre Name Character : ");
		ct_name = kb.next();
		System.out.println("Your NameChracter => "+ct_name);
		System.out.println("Your HP => "+ct_hp);
		System.out.println("Your Level => "+ct_level);
		System.out.println("Youre DMG => "+ct_dmg);
		
		System.out.println("Chosse your weapon => 1.knife , 2.Gun");
		
		int wp = kb.nextInt();	
		chooseWp(wp);
	}
	public static void chooseWp(int wp) {
		
		do {
			if(wp == 1) {
				System.out.println("You Choose knife");
				wp =1;
				chooseWp(wp);
			}else if(wp == 2) {
				System.out.println("You Choose Gun");
				wp =2;
				chooseWp(wp);
			}	
		}while(wp == 0);	
	
	}
	public String getCt_name() {
		return ct_name;
	}
	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}
	public int getCt_hp() {
		return ct_hp;
	}
	public void setCt_hp(int ct_hp) {
		this.ct_hp = ct_hp;
	}
	public double getCt_dmg() {
		return ct_dmg;
	}
	public void setCt_dmg(int ct_dmg) {
		this.ct_dmg = ct_dmg;
	}

} 
