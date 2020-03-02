package hero;

public abstract class Hero implements Powers{

	@Override
	public boolean goodGuy() {
		return true;
	}

	@Override
	public boolean likesToWatchTheWorldBurn() {
		return false;
	}

	public abstract String displayString(); 
	
	@Override
	public String getTeamName() {
		return "Avengers";
	}

}
