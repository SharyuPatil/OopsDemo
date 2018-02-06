
public class OverloadingDemo {
	void add(int x){
		System.out.println(x);
	}
void add(int x,int y){
	System.out.println("x and y"+x+" " +y);
	}
void add(int x,int y,int z){
	System.out.println("x and y and z"+x+" " +y+" " +z);
}
//Constructor Overloading
OverloadingDemo()
{
	System.out.println("hi");
}
OverloadingDemo(int x)
{
	System.out.println("hello"+x);
}

	public static void main(String[] args) {
		OverloadingDemo od=new  OverloadingDemo();
		new OverloadingDemo(10);
		od.add(10);
		od.add(10, 20);
		od.add(10, 20, 30);
	}

}
