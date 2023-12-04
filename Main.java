package terminalGame;

import terminalGame.Utils.TextRenderer;

public class Main {
	
	private double gameVersion = 0.0;
	private String gameName = "Epoch";
	
	private static Main m = new Main();
	public TextRenderer textRender = new TextRenderer();
	public Settings settings = new Settings();

	public static void main(String[] args) {
		m.debugPrint("Launching Game");
        new Display().run();
    }
	
    public double getGameVersion() {
		return gameVersion;
	}

	public String getGameName() {
		return gameName;
	}
	
	public void debugPrint(String message) {
		System.out.println("[Epoch DEBUG]: " + message);
	}

}
