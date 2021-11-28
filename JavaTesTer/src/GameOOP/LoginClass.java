package GameOOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
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
		System.out.println("ID -> "+id);
		Writer(id,pw);

	}
	private static void Writer(String id,String pw) {
		try {
			String nameuser = id;
			
			// check duplicate file อย่าลืมทำ **
			// read file
			int flag = checkFileUser(nameuser); // 1 = found , 0 = not found
			
			File myfile = new File("temp\\mygame\\"+nameuser+".txt");
			System.out.println(myfile);
			Scanner myReader = new Scanner(myfile); // หาไฟล์ไม่เจอ เพราะยังไม่มี
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				// check duplicate file 
				if(data.equals("ID:"+nameuser)) {
					System.out.println("pls input other username!");
					myReader.close();
					getlogin();
				}else if(!data.equals("ID:"+nameuser)){
					// write file
					BufferedWriter out = new BufferedWriter(new OutputStreamWriter( //path file
							new FileOutputStream("temp\\mygame\\"+nameuser+".txt"),"UTF-8"));
					LocalDate date = LocalDate.now(); // Create a date object
					out.write("ID:"+id+"\nPassword:"+pw+"\nCreateDate:"+date); // data in file
					out.close();  
				}
				System.out.println(data);
			}
			//myReader.close();		
			
		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
		} 
	}
	
	private static int checkFileUser(String name) {
		 File directory = new File("temp\\mygame\\");
	        // store all names with same name
	        // with/without extension
	        String[] flist = directory.list(); //keep all file name 0,1,2,3 ++
	        int flag = 0;
	        if (flist == null) {
	            System.out.println("Empty directory.");
	        }else {
	            // Linear search in the array
	            for (int i = 0; i < flist.length; i++) {
	                String filename = flist[i];
	                if (filename.equalsIgnoreCase(name+".txt")) {
	                    System.out.println(filename + " found");
	                    flag = 1;
	            
	                }
	            }
	            
	            
	            
	            
	        }
	        if (flag == 0) { 
	            System.out.println("File Not Found");
	        }
			return flag;// 0,1
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
