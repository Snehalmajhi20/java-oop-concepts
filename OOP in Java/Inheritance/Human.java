class Robot{
    int eye = 2;
    String body = "Metallic body";
	String speak = "Hello, good Morning!";
    public void robot(){
        System.out.println("i'm robot and created and programmed by Human! ");
    }
}
public class Human extends Robot {
	public void human(){
        System.out.println("I'm Human!");
    }
    String body = "Human body";
    public static void main(String[] args) {
        
		Human hu = new Human();
        hu.human();
        System.out.println("I have "+ hu.eye +" Eyes.");
        System.out.println("My body structure is: "+ hu.body);
		System.out.println("As Human:- "+ hu.speak);
		
		System.out.println("----------------------------------");
		
		Robot ro = new Robot();
        ro.robot();
        System.out.println("I have "+ ro.eye +" eyes as like human");
        System.out.println("My Body structure is: "+ ro.body);
		System.out.println("As Robot:- "+ ro.speak);

    }
}
