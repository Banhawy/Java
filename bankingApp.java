import java.io.*;
public class bankingApp{
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Banking App!\nTo set up an account, please enter your name: ");
		String name = input.readLine();
		System.out.println("Now enter a password: ");
		String password = input.readLine();
		
		bankAccount myAccount = new bankAccount(name, password, 100.50);
		//myAccount.name = "Adham";
		//myAccount.setPassword("", "pass");
		//myAccount.deposit("pass", 100.50);

		System.out.println("Your account balance is: "+ myAccount.getBalance("pass"));
	}
}