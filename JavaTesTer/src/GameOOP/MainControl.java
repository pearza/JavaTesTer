package GameOOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class MainControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login();
		File directory = new File("temp\\mygame\\");

		System.out.println(directory);
		// store all names with same name
		// with/without extension
		String[] flist = directory.list();
		int flag = 0;
		if (flist == null) {
			System.out.println("Empty directory.");
		}else {
			// Linear search in the array
			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				if (filename.equalsIgnoreCase("ddasdasd.txt")) {
					// หาไฟล์ไม่เจอ เพราะยังไม่มี
					System.out.println(filename + " found");
					flag = 1;
					try {
						File directory2 = new File("temp\\mygame\\ddasdasd.txt");
						Scanner myReader = new Scanner(directory2);
						System.out.println(directory2);
						while (myReader.hasNextLine()) {
							String data = myReader.nextLine();
							System.out.println(data);
						}
						myReader.close();
					} catch (FileNotFoundException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					}
				}
			}
		}
		if (flag == 0) {
			System.out.println("File Not Found");
		}

	}

	public static void Login() {
		LoginClass login = new LoginClass(); // call instance loginclass
		login.getlogin();


	}

}
