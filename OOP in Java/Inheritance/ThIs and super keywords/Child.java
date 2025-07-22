class Parent{
	public Parent(){
		System.out.println("I'm The Contructor of the Parent or super Class!");
	}
	public void display(){
		System.out.println("I'm The parent class and Method also");
		}
}
class Child extends Parent
{
	public Child(){
		super(); // This is for contructor calling in parent contructor 
		System.out.println("I'm the contructor of the sub or child class!");
	}
	public void son(){
		System.out.println("I,m the  sub or child class and method also");
		super.display(); // This for parent method calling using super 
	}
	public static void main(String[] args) 
	{
		Child c = new Child();
		System.out.println("--------------------------------------------");
		c.son();
	}
}
