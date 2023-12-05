package terminalGame.Utils;

import java.awt.Font;

public class TextRenderer {
	
	private Font awtFont = new Font("Time New Roman", Font.PLAIN, 24);
	//private TrueTypeFont font = new TrueTypeFont(awtFont, true);
	
	public TextRenderer() {
		// add to make different fonts possible
	}
	
	public void drawString(int x, int y, String text) {
		//font.drawString(x, y, text);
	}
	
}