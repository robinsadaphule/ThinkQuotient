package homework;

public class Inh_Car_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Inh_Car Cars=new Inh_Car();
		Cars.setName("Baleno");
		Cars.setBrand("Suzuki");
		Cars.setColor("Red");
		
		System.out.println("Name of the Car: " +Cars.getName());
		System.out.println("Name of Car Company: " +Cars.getBrand());
		System.out.println("Color of Car: " +Cars.getColor());
		

	}

}
