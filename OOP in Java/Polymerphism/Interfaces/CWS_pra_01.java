interface a{
    void ab();
    void ba();
}
interface b{
    void cd();
    public void ad();
}
abstract class c implements a,b{
    public void m1(){
        System.out.println("hii i'm m1 method!");
    }
    public void ab(){
        System.out.println("i'm ab method");
    }
}
abstract class d extends c{
    public void ba(){
        System.out.println("i'm ba methods!");
    }
}
class e extends d{
    public void cd(){
        System.out.println("I'm cd methods");
    }
    public void ad(){
        System.out.println("I'm ad methods");
    }
}

public class CWS_pra_01 {
    public static void main(String[] args) {
        e rf = new e();
        rf.m1();
        rf.ab();;
        rf.cd();
        rf.ba();
        rf.ad();
       // d er = new d(); // You cannot create an object of an abstract class (d) because abstract classes cannot be instantiated
    }
}
