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
		 
		void withdraw(double amount) {
			balance= balance-amount;
		}
		void deposit(double amount) {
			balance= balance+amount;
		}



		
		


}