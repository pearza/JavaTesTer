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
	private String id;
	private String pass;

	// Default constructor 
	public LoginClass() {

	}
	private LoginClass(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}

	public static void getlogin() {
		Scanner kb = new Scanner(System.in);
		String id ;
		String pw ;
		boolean check = true;
		do {	
			System.out.println("pls input User 8-10: ");
			id = kb.next();
			System.out.println("pls input Password 8-10: ");	
			pw = kb.next();

			if(id.length() >= 8 && pw.length() >= 8) {
				check = false;
			}
		}while(check == true);
		createUser(id,pw);

	}

	private static void createUser (String id,String pw) {
		try{
			// Create new file
			String path="temp\\mygame\\"+id+".txt";
			File file = new File(path);
			// If file doesn't exists, then create it
			if (!file.exists()) {
				System.out.println("Create USER");
				file.createNewFile();
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				Date date = new Date();
				// Write in file
				bw.write("\nUsername: "+id +"\nPassword "+pw + "\nDateCreate :"+date);
				// Close connection
				bw.close();
			}else{ 
				System.out.println("USER Duplicate!");
				getlogin();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
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
