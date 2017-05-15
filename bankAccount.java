public class bankAccount {
	String name;
	private String password = "";
	double balance;

	public void withdraw(String enteredPassword, double amount){
		//Only people with the right password and sufficient funds can withdraw
		if (password.equals(enteredPassword) && balance >= amount){
			balance = balance - amount;
		}
	}

	public void deposit(String enteredPassword, double amount){
		if (password.equals(enteredPassword)){
			balance = balance + amount;
		}
	}

	//Getter
	public double getBalance(String enteredPassword){
		if (password.equals(enteredPassword)) {
			return balance;
		} else {
			return -1;
		}
	}

	//Setter
	public boolean setPassword(String oldPassword, String newPassword) {
		if (password.equals(oldPassword)) {
			password = newPassword;
			return true;
		} else {
			return false;
		}
	}

	//Constructor
	public bankAccount(String initName, String initPassword, double initBalance){
		this.name = initName;
		this.password = initPassword;
		this. balance = initBalance;
	}
}