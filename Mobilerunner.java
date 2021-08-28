package homework;

public class Mobilerunner {

public static void main(String[] args) {
		
		Mobile mob= new Mobile(null);
	    mob.start();
		mob.setName("Nokia");
		System.out.println("Mobile Brand: "+mob.getName());
		mob.setMobno(95648525);
		System.out.println("Dial Mobile Number: "+mob.getMobno());
		mob.stop();
	}
	
}
