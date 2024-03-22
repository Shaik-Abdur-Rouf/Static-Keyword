class Beta
{
	static int a;
	static int b;
	static
	{
		System.out.println("Static Block");
		a=10;
		b=20;
	}
	static void disp()
	{
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
	}
}



public class Launchstatic3 
{

	public static void main(String[] args)
	{
		Beta.disp(); 

	}

}
