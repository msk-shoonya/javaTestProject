package javaTestPackage;

public class AccountHolderObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName ="Smith";
		tom.age = 21;
		tom.accountBalance = 10000;
		tom.testEligibilityForCreditCards();
		System.out.println("Is Tom Eligible For Credit Card: "+tom.eligibleForCreditCard);

		henry.firstName = "Henry";
		henry.lastName ="Hill";
		henry.age = 31;
		henry.accountBalance = 20000;
		henry.testEligibilityForCreditCards();
		System.out.println("Is Henry Eligible For Credit Card: "+henry.eligibleForCreditCard);
		
		sarah.firstName = "Sarah";
		sarah.lastName ="Mill";
		sarah.age = 41;
		sarah.accountBalance = 30000;
		sarah.testEligibilityForCreditCards();
		System.out.println("Is Sarah Eligible For Credit Card: "+sarah.eligibleForCreditCard);
	}

}
