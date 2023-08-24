public class Account {
        private  int accountNumber;
		private String accountHolderName;
		private double balance;
		
		public Account(){ }
		public Account(int accountNumber, String accountHolderName, double balance){
			this.accountNumber=accountNumber; 
			this.accountHolderName=accountHolderName;
			this.balance=balance;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber=accountNumber;
		}
		
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName=accountHolderName;
		}
		
		public void setBalance(double balance) {
			this.balance=balance;
		}
		public int getAccountNumber() {
			return this.accountNumber;
		}
		
		public String getAccountHolderName() {
			  return this.accountHolderName;
		  }
		  
		public double getBalance() {
			  return this.balance;
		  }
		  
		public void showDetails(){
			System.out.println();
			System.out.println("The Account Number of the Account is :"+accountNumber);
			System.out.println("The Account Holder Name of the Account is :"+accountHolderName);
			System.out.println("The Blance of the Account is :"+balance);
			System.out.println();
		}
		 
		void withdraw(double amount) {
			if(balance<amount&&amount<1){
				System.out.println("\nInvalid ammount! Can not be withdrawed\n");
				return;
			}
			System.out.println("\nAmmount withdrawed: "+amount);
			System.out.println();
			balance= balance-amount;
		}
		
		void deposit(double amount) {
			if(amount<1){
				System.out.println("\nInvalid ammount! Can not be deposited\n");
				return;
			}
			System.out.println("\nAmmount diposited: "+amount);
			System.out.println();
			balance= balance+amount;
		}
}