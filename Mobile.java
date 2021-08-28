package homework;

public class Mobile {

	private String name;
	private int mobno;
	
	public Mobile(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	
	public void start() {
		System.out.println("Mobile Switch on");
	}
	
	public void stop()
	{
		System.out.println("Mobile Switch off");
		
	}
	
	
	
}
