class Ex1
{
	public void m1(){
		System.out.println("Snehal");
	}
	public void Qulification(){
	System.out.println("B.tech");
	}
}
class Ex2 extends Ex1
{
	public void m1(int a){
		System.out.println("Jagannath");
	}
	public void Qulification(){
	    System.out.println("B.tech");
		super.Qulification();
	}
}
class Ex3 extends Ex2
{
	public void m1(int a, int b){
		System.out.println("Saroj");
	}
	public void Qulification(){
	    System.out.println("B.tech");
		super.Qulification();
	}
}
class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Multi-level Inheritance with Method OverLoading!");
		System.out.println("------------------------");
		Ex3 m = new Ex3();
		m.m1();
		m.m1(11);
		m.m1(1,2);
		System.out.println("------------------------");2
		m.Qulification();
	}
}
