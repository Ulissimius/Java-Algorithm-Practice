package hero;

public class DocOck extends Villain {

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public int getStrength() {
		return 5;
	}
	
	@Override
	public String realName() {
		return "Otto";
	}

}
