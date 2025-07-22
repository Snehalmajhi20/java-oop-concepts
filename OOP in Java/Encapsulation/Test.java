class Student{
	private int sid = 100;
	private String sname = "Snehal";
	private String school = "ssvm";
	
	public void setSid(int sid){
		this.sid = sid;
	}
	public int getSid(){
		return sid;
	}
	public void setSname(String sname){
		this.sname = sname;
	}
	public String getSname(){
		return sname;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return school;
		}
}
class Test extends Student
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.setSid(101);
		System.out.println("My student i'd is: "+t.getSid());
		System.out.println("-------------");
		t.setSname("Snehal Majhi");
		System.out.println("My name is: "+t.getSname());
		System.out.println("-------------");
		t.setSchool("Saraswati Sishu Vidya Mandir, Bhadrak");
		System.out.println("I'm Passed from "+t.getSchool());
	}
}
