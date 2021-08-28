package homework;

//Tv runnerclass

public class Tvrunner {

	public static void main (String[] args) {
		RemoteTv rt=new RemoteTv();
		
		rt.ON();
		rt.IncVolume();
		rt.DecVolume();
		rt.ChannelNext();
		rt.ChannelBack();
		rt.OFF();
	}
}
