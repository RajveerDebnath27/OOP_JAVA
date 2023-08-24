public class Product
{
	String productId;
	String productName;
	double price;
	int availableQuantity;

 public void setProductId(String productId)
{
	productId =productId;
}

public void setProductName(String productName)
{
	productName = productName;
}
public void setPrice(double price)
{
	price = price;
}
public void setAvailableQuantity(int availableQuantity)
{
	availableQuantity = availableQuantity;
}
public String getProductId( )
{
	return productName ;
}
public String getProductName( )
{
	return productName;
}
public double getPrice( )
{
	return price;
}
public void display()
	{
		System.out.println("The Book ID is :"+Bid);
		System.out.println("The Book name is :"+bname);
		System.out.println("The Author name is :"+AuthorName);
		
	}	
public static void main(String args[])
    {
	    Product p1=new Book(425,"Object oriented programming ","Rajveer");
		/*b1.display();*/
		System.out.println("The Book ID is :"+b1.getProductId);
	}
};