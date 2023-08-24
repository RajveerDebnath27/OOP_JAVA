public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public Account()
	{
	System.out.println("Inside empty constructor");	
	}
	public Account(int an,String ahn,double b)
	{
		accountNumber=an;
		accountHolderName=ahn;
		balance=b;
	}
	public void setAccountNumber(int an)
	{
		accountNumber=an;
	}
	public void setAccountHolderName(String ahn)
	{
		accountHolderName=ahn;
	}
	public void setBalance(double b)
	{
		balance=b;;
	}
	public int getAccountNumber( )
	{
		return accountNumber;
	}
	public String getAccountHolderName( )
	{
		return accountHolderName;
	}
	public double getBalance( )
	{
		return balance;
	}
	public void showDetails( )
	{
		System.out.println("The Account Number of the Account is :"+accountNumber);
		System.out.println("The Account Holder Name of the Account is :"+accountHolderName);
		System.out.println("The Blance of the Account is :"+accountHolderName);
		
	}	
	public static void main(String args[])
	{
		Account a1=new Account(12345,"Rajveer",5000.6);
		/*Account =new Account("Mashrafi",20)*/;
		a1.showDetails( );
		/*p1.setName("Shakib");
		p1.setId(10);
		p1.display();
		System.out.println("The name is :"+p1.getName());
		System.out.println("The id is :"+p1.getId());
		System.out.println("The name is :"+p2.getName());
		System.out.println("The id is :"+p2.getId());*/
				
	}
}