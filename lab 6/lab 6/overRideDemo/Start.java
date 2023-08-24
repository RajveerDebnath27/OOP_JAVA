class Start
{
	public static void main(String args[])
	{
		OverRidingDemo o1=new OverRidingDemo();
		o1.displayInfo();
		OverRidingDemo o2=new OverRidingChildDemo();
		o2.displayInfo();
		//super.o2.displayInfo();
		//o1.showInfo();
	}
}