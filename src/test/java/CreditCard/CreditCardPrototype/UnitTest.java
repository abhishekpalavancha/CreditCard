package CreditCard.CreditCardPrototype;

import org.testng.Assert;
import org.testng.annotations.Test;

import CreditCard.CreditCardApplication.UserInformation;
import CreditCard.CreditCardApplication.creditCardMethods;


public class UnitTest {
	UserInformation run = new UserInformation();
	creditCardMethods testStub = new creditCardMethods();
	
	@Test()
	public void checkInputWithInvalidString() {
		Assert.assertFalse(run.formatInput("not a valid String"));
	}
	
	@Test()
	public void checkInputWithValidString() {
		Assert.assertTrue(run.formatInput("Add Tom 4111111111111111 $1000"));
	}

	@Test()
	public void checkInputWithNull() {
		Assert.assertFalse(run.formatInput(""));
	}
	
	@Test()
	public void testAddwithValid()
	{
		String name = "TOM";
		String creditCard = "4111111111111111";
		String amount = "1000";
		Assert.assertEquals(testStub.add(name, creditCard, amount), "SUCCESS");
	}
	@Test()
	public void testAddwithInValid()
	{
		String name = "FAIL";
		String creditCard = "4111111111111";
		String amount = "1000";
		Assert.assertEquals(testStub.add(name, creditCard, amount), "ERROR");
	}
	@Test()
	public void testChargewithValid()
	{
		String name = "TOM";
		String creditCard = "4111111111111111";
		String amount = "1000";
		String charge = "500";
		testStub.add(name, creditCard, amount);
		Assert.assertEquals(testStub.charge(name, charge), "SUCCESS");
		
	}
	@Test()
	public void testChargewithInValid()
	{
		String name = "TOM";
	    String creditCard = "4111111111111111";
		String amount = "1000";
		String charge = "5000";
		testStub.add(name, creditCard, amount);
		Assert.assertEquals(testStub.charge(name, charge), "ERROR");
	}
	@Test()
	public void testCreditwithValid()
	{
		String name = "TOM";
		String creditCard = "4111111111111111";
		String amount = "1000";
		String charge = "300";
		String credit = "100";
		testStub.add(name, creditCard, amount);
		testStub.charge(name, charge);
		Assert.assertEquals(testStub.credit(name, credit), "SUCCESS");
		
	}
	@Test()
	public void testCreditwithInValid()
	{
		String name = "TOM";
		String creditCard = "4111111111111111";
		String amount = "1";
		String charge = "2";
		String credit = "";
		testStub.add(name, creditCard, amount);
		testStub.charge(name, charge);
		Assert.assertEquals(testStub.credit(name, credit), "ERROR");
		
	}
	
}
