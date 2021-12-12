package GameOOP;

public class WeaponClass {
	private String wp_name;
	private String wp_type;
	private double wp_magazine;
	public double wp_damage;
	
	// Constructor 
	 public WeaponClass() {
		 
	}
	 // static method can call all class.
	// Constructor
	 public WeaponClass(String wp_name, String wp_type, double wp_magazine, double wp_damage) {
		this.wp_name = wp_name;
		this.wp_type = wp_type;
		this.wp_magazine = wp_magazine;
		this.wp_damage = wp_damage;
		
	}
	 
	// **** getter and setter *****
	public String getWp_name() {
		return wp_name;
	}
	public void setWp_name(String wp_name) {
		this.wp_name = wp_name;
	}
	public String getWp_type() {
		return wp_type;
	}
	public void setWp_type(String wp_type) {
		this.wp_type = wp_type;
	}
	public double getWp_magazine() {
		return wp_magazine;
	}
	public void setWp_magazine(double wp_magazine) {
		this.wp_magazine = wp_magazine;
	}
	public double getWp_damage() {
		return wp_damage;
	}
	public void setWp_damage(double wp_damage) {
		this.wp_damage = wp_damage;
	}	
}

