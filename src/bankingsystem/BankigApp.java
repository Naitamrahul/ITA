package bankingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BankigApp {
private static final String url="jdbc:mysql://localhost:3306/bank_db";
private static final String username="root";
private static final String password="Admin@123";
	
	public static void main(String[] args) {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }catch(Exception e) {
			 System.out.println(e);
		 }
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			Scanner sc= new Scanner(System.in);
			User user=new User(sc,con);
			user.register();
		}catch(Exception e) {
			System.out.println(e);
		}
        

	}

}
