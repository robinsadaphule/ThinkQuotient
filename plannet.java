//constructor program
package Morning;

public class plannet {
	
	private String name;
	private int dist_from_sun;
	
	public plannet(String pname)
	{
		this.name=pname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDist_from_sun() {
		return dist_from_sun;
	}
	public void setDist_from_sun(int dist_from_sun) {
		this.dist_from_sun = dist_from_sun;
	}
	
	

}
