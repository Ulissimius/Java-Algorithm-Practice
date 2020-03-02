package hero;

public abstract class Villain implements Powers {

	@Override
	public boolean goodGuy() {
		return false;
	}

	@Override
	public boolean likesToWatchTheWorldBurn() {
		return true;
	}

	@Override
	public String getTeamName() {
		return "Sinister Six";
	}

}
