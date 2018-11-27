package CreditCard.CreditCardApplication;


public class UserInformation {

	String userName;
	String creditCardNumber;
	String amount;
	creditCardMethods function = new creditCardMethods();
	
	 
	public boolean formatInput(String input) {
		boolean flag = false ;
		String[] splitInput = input.split("\\s|\\$+");

		if (splitInput[0].equals("Add")) {
			userName = splitInput[1];
			creditCardNumber = splitInput[2];
			amount = splitInput[4];
			function.add(userName, creditCardNumber, amount);
			flag= true;
		}
		if (splitInput[0].equals("Charge")) {
			userName = splitInput[1];
			amount = splitInput[3];
			function.charge(userName, amount);
			flag= true;
		}
		if (splitInput[0].equals("Credit")) {
			userName = splitInput[1];
			amount = splitInput[3];
			function.credit(userName, amount);
			flag= true;
		}
		return flag;
	}
	
	public void display() {
		function.print();
	}

}
