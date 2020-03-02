package hero;

public class Hulk extends Hero{

	@Override
	public boolean canFly() {
		return false;
	}

	@Override
	public int getStrength() {
		return 9;
	}

	public boolean canRegenerate() {
		return true;
	}

	@Override
	public String realName() {
		return "Bruce";
	}
}
