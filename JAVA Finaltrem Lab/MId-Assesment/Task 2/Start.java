public class Start
{
	public static void main(String args[])
    {
		Account a1 = new Account();
		a1.setAccountNumber(121);
		a1.setAccountHolderName("Rajveer");
		a1.setBalance(10000);
	 
		Account a2,a3,a4,a5;
	 
		a2 = new Account(122,"Talha",20000);
		a3 = new Account(123,"Shifat",30000);
		a4 = new Account(124,"Arni",40000);
		a5 = new Account(125,"Mim",50000);
	 
		Account accounts[] = new Account[5];
	 
		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;
		accounts[3] = a4;
		accounts[4] = a5;
	
		for(int i=0;i<5;i++){
			System.out.println();
			System.out.println("The Account Number of the Account is: "+accounts[i].getAccountNumber());
			System.out.println("The Account Holder Name of the Account is: "+accounts[i].getAccountHolderName());
			System.out.println("The Blance of the Account is: "+accounts[i].getBalance());
			System.out.println();
		}	

		a2.deposit(500);
		a5.withdraw(1000);
		
		for(int i=0;i<5;i++){
			accounts[i].showDetails();
		}
		
		a3 = null;
		
		for(int i=0;i<5;i++){
			accounts[i].showDetails();
		}
	}

}