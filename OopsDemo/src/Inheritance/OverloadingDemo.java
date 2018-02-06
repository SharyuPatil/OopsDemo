package Inheritance;

public class OverloadingDemo
{
	void display(int a)
	{
		System.out.println("a"+a);
	}
	void display(int a,int b)
	{
		System.out.println("a"+a +"b"+b);
	}
	void display(int x,int y,int z)
	{
		System.out.println("x"+x +"y"+y);
	}
	

}
class Demo
{
	public static void main(String[] args) {
		OverloadingDemo od=new OverloadingDemo();
		od.display(1);
		od.display(30,20);
		od.display(10, 20, 30);
		
	}
}
