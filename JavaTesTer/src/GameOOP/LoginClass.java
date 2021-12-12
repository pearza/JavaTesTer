package GameOOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class LoginClass {
	private static String id;
	private static String pass;

	// Default constructor 
	public LoginClass() {

	}
	private LoginClass(String id, String pass) {
		this.id = id;
		this.pass = pass;
		
	}
	public static void getlogin() {
		Scanner kb = new Scanner(System.in);
		boolean check = true;
		do {	
			System.out.println("pls input User 8-10: ");
			id = kb.next();
			System.out.println("pls input Password 8-10: ");	
			pass = kb.next();

			if(id.length() >= 8 && pass.length() >= 8) {
				check = false;
			}
		}while(check == true);
		createUser(id,pass);
	}
	private static void createUser (String user,String pw) {
		try{
			// Create new folder for data
			File folder = new File("src\\GameOOP\\temp\\"); 
			if(!folder.exists()) {
					folder.mkdir();
			}
			// create path file
			String path="src\\GameOOP\\temp\\"+user+".txt";
			File file = new File(path);
			// If file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				Date date = new Date();
				// Write in file
				bw.write("\nUsername: "+user +"\nPassword "+pw + "\nDateCreate :"+date);
				// Close connection
				bw.close();
				System.out.println("Create USER");
			}else{ 
				System.out.println("USER Duplicate!");
				getlogin();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		toCharacter();
	}
	private static void toCharacter() {
		CharacterClass ch = new CharacterClass();
		ch.getStart();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "LoginClass [id=" + id + ", pass=" + pass + "]";
	}



}
