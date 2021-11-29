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
		Login();
		
	}

	public static void Login() {
		LoginClass login = new LoginClass(); // call instance loginclass
		login.getlogin();


	}

}
