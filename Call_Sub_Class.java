public class Call_Sub_Class{
	
	public static void main(String ar[])
	{
		//call to sub class inside in main class
		sampaleMethod();
		sampleMethodReturnInt(5);
	}
	//create sub method called sampleMethod()
	public static void sampaleMethod()
	{
		System.out.println("This is the test Method");
	}
	//create sub method with return type
	public static int sampleMethodReturnInt(int i)
	{
		System.out.println("The value that pass "+i);
	}
}
