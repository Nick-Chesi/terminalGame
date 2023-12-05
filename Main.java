package terminalGame;

import terminalGame.Utils.TextRenderer;

public class Main implements Runnable {
	public Thread game;
	
	private double gameVersion = 0.0;
	private static String gameName = "Epoch";
	
	private static Main m = new Main();
	public TextRenderer textRender = new TextRenderer();
	public Settings settings = new Settings();
	
	public static Window window;

	public static void main(String[] args) {
		m.debugPrint("Launching Game");
		new Main().start();
    }
	
	public void start() {
		game = new Thread(this, gameName);
		game.start();
	}
	
	public static void init() {
		window = new Window(1200, 800, gameName);
		window.setBackgroundColor(1.0f, 0, 0);
		window.create();
	}
	
	public void run() {
		init();
		
		while (!window.shouldClose()) {
			update();
			render();
		} 
	}
	
	private void update() {
		window.update();
	}
	
	private void render() {
		window.swapBuffers();
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
