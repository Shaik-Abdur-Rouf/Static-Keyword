import java.util.Scanner;
class Farmer
{
	double pa;
	double td;
	double si;
	
	static float ri;
	
	static
	{
		ri=2.4f;
	}
	
	void input()
	{
		//Scanner s=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the loan amount needed");
		pa=scan.nextDouble();
		System.out.println("Kindly enter the time duration");
		td=scan.nextDouble();
	}
	void calculate()
	{
		si=pa*td*ri/100f;
	}
	void disp()
	{
		System.out.println("Simple Interest is: "+ si);
	}
}
public class LaunchApp {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		System.out.println("Farmer 1");
		f1.input();
		f1.calculate();
		f1.disp();
		
		System.out.println("Farmer 2");
		f2.input();
		f2.calculate();
		f2.disp();
		
		System.out.println("Farmer 3 ");

		f3.input();
		f3.calculate();
		f3.disp();


	}

}
