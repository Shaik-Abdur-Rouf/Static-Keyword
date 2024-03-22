class Alpha
{
	static int a;
	static int b;
	int c;
	int d;
	static
	{
		System.out.println("Static Block of Alpha class");
		a=10;
		b=20;
	}
	{
		System.out.println("Normal Java initialization block(Non static block)");
		c=30;
		d=40;
	}
	public Alpha()
	{
		System.out.println("Constructor");
	}
	static void disp1()
	{
		System.out.println("Static disp Method");
		System.out.println(a);
		System.out.println(b);
	}
	void disp2()
	{
		System.out.println("Instance disp Method(Non static)");
		System.out.println(c);
		System.out.println(d);
	}
}
public class launchstatic2 {

	public static void main(String[] args) {
		System.out.println("Main Method/Starting point for JVM");
		Alpha.disp1();
		Alpha a=new Alpha();
		a.disp2();

	}

}
