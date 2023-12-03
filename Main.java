package terminalGame;

public class Main {
	
	private double gameVersion = 0.0;
	private String gameName = "Epoch";

	public static void main(String[] args) {
    	System.out.println("Launching Terminal Game");
        new Display().run();
    }
	
    public double getGameVersion() {
		return gameVersion;
	}

	public String getGameName() {
		return gameName;
	}

}
