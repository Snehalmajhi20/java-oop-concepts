class Snehal
{
	public void marriage(){
		System.out.println("Love and Arranged marriage");
	}
	public void bike(){
		System.out.println("Activa 4G");
	}
}
class Jagannath extends Snehal
{
	public void marriage(){
		System.out.println("Arranged marriage");
		super.marriage();
	}
	public void bike(){
		System.out.println("Ola Scooter");
		super.bike();
	}
}
class Saroj extends Snehal
{
	public void marriage(){
		System.out.println("Love marriage");
		super.marriage();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hierarchical inheritance with Method overriding!");
		Saroj ssj = new Saroj();
		ssj.marriage();
		ssj.bike();
		System.out.println("-------------------------");
		Jagannath jss = new Jagannath();
		jss.marriage();
		jss.bike();
	}
}
