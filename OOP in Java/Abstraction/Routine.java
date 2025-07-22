abstract class DailyRoutine
{
	abstract void wakeup();
	abstract void brushteeth();
	abstract void breakfast();
	abstract void gotostudy();
}
abstract class Morning extends DailyRoutine
{
	public void wakeup(){
		System.out.println("Woke up at 6AM....!");
	}
	public void brushteeth(){
		System.out.println("Brushed the Teeth....!");
	}
}
abstract class BreakfastRoutine extends Morning
{
	public void breakfast(){
		System.out.println("Doing Healthy Breakfast....!");
	}
}
class Routine extends BreakfastRoutine
{
	public void gotostudy(){
		System.out.println("Went to study at 9AM....!");
	}
	public static void main(String[] args) 
	{
		System.out.println("Abstraction");
		System.out.println("------------------------");
		System.out.println("Daily Moring Routine!");
		System.out.println("------------------------");
		Routine ro = new Routine();
		ro.wakeup();
		ro.brushteeth();
		ro.breakfast();
		ro.gotostudy();
	}
}
