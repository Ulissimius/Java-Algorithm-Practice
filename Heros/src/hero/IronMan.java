package hero;

public class IronMan extends Hero {

	@Override
	public boolean canFly() {
		return true;
	}

	@Override
	public int getStrength() {
		return 6;
	}
	
	@Override
	public String realName() {
		return "Tony";
	}

}
