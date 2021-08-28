package homework;


public class RemoteTv implements TVremote {

	@Override
	public void ON() {
		// TODO Auto-generated method stub
		System.out.println("Television Switch On");
		
	}

	@Override
	public void OFF() {
		// TODO Auto-generated method stub
		System.out.println("Television Switch Off");
	}

	@Override
	public void IncVolume() {
		// TODO Auto-generated method stub
		System.out.println("Television Volume Increase");
	}

	@Override
	public void DecVolume() {
		// TODO Auto-generated method stub
		System.out.println("Television Volume Decrease");
	}

	@Override
	public void ChannelNext() {
		// TODO Auto-generated method stub
		System.out.println("Move to next Channel");
	}

	@Override
	public void ChannelBack() {
		// TODO Auto-generated method stub
		System.out.println("Move to previous Channel");
	}

}
