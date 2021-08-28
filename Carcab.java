
//encapsulation program
package Morning;

public class Carcab {
	private int noofpassenger;
	private String droplocation;
	private int maximumluggage;
	private int cost;
	
		
	public int getNoofpassenger() {
		return noofpassenger;
	}

	public void setNoofpassenger(int noofpassenger) {
		this.noofpassenger = noofpassenger;
	}

	public String getDroplocation() {
		return droplocation;
	}

	public void setDroplocation(String droplocation) {
		this.droplocation = droplocation;
	}

		public int getMaximumluggage() {
		return maximumluggage;
	}

	public void setMaximumluggage(int maximumluggage) {
		this.maximumluggage = maximumluggage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	void start()
	{
		System.out.println("Cab Started...");
		
	}

	void stop()
	{
		System.out.print("cab Stop..");
	}
	
}
