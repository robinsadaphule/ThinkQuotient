package homework;

public class Inh_Bike_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Inh_Bike Bikes=new Inh_Bike();
		Bikes.setName("Splendor");
		Bikes.setBrand("HeroHonda");
		Bikes.setColor("Black");
		
		System.out.println("Name of the Bike: " +Bikes.getName());
		System.out.println("Name of Bike Company: " +Bikes.getBrand());
		System.out.println("Color of Bike: " +Bikes.getColor());
}
}