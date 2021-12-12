package GameOOP;

import java.util.Scanner;

public class CharacterClass extends WeaponClass{
	LoginClass log = new LoginClass();
	private String user = log.getId();
	private String ct_name;
	private String ct_hp;
	private double ct_dmg;
	
	
	public CharacterClass() {	

	}
	public CharacterClass(String ct_name, String ct_hp, double ct_dmg) {
		this.ct_name = ct_name;
		this.ct_hp = ct_hp;
		this.ct_dmg = ct_dmg;
	}

	public static void getStart() {
		WeaponClass wp = new WeaponClass();
		Scanner kb = new Scanner(System.in);
		
		
		
		 
	}
	public String getCt_name() {
		return ct_name;
	}
	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}
	public String getCt_hp() {
		return ct_hp;
	}
	public void setCt_hp(String ct_hp) {
		this.ct_hp = ct_hp;
	}
	public double getCt_dmg() {
		return ct_dmg;
	}
	public void setCt_dmg(double ct_dmg) {
		this.ct_dmg = ct_dmg;
	}

} 
