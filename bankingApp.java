public class bankingApp{
	public static void main(String[] args) {
		bankAccount myAccount = new bankAccount("Adham", "pass", 100.50);
		//myAccount.name = "Adham";
		//myAccount.setPassword("", "pass");
		//myAccount.deposit("pass", 100.50);

		System.out.println("My account's balance is: "+ myAccount.balance);
	}
}