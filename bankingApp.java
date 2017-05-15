import java.io.*;
public class bankingApp{
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Banking App!\nTo set up an account, please enter your name: ");
		String name = input.readLine(); //Input user name
		System.out.println("Now enter a password: ");
		String password = input.readLine(); //Input user password
		bankAccount myAccount = new bankAccount(name, password, 0);

		System.out.println("Hi " + name + ". Please enter choose an action from below:");
		System.out.println("To deposit money, type D.\nTo withdraw money, type W.\nTo check your balance, type B.");
		String action = input.readLine();
		int amount;

		switch(action) {
			case "D": 
				System.out.println("Enter the amount you want to deposit: ");
				amount = Integer.parseInt(input.readLine());
				myAccount.deposit(password, amount);
				break;
			case "W":
				System.out.println("Enter the amount you want to withdraw: ");
				amount = Integer.parseInt(input.readLine());
				myAccount.withdraw(password, amount);
				// if (myAccount.withdraw(password, amount) == -1) {
				// 	System.out.println("Insufficient funds.");
				// } else {
				// 	System.out.println("An amount of " + amount + " was deposited to your account");
				// }
				break;
			case "B":
				System.out.println("Your account balance is: "+ myAccount.getBalance(password));
				break;
			default: System.out.println("Invalid input");
				break;

		}		
		//myAccount.name = "Adham";
		//myAccount.setPassword("", "pass");
		//myAccount.deposit("pass", 100.50);
		System.out.println("Your account balance is: "+ myAccount.getBalance(password));
	}
}