package terminalGame.Utils;

import java.awt.Font;

import org.newdawn.slick.TrueTypeFont;

public class TextRenderer {
	
	private Font awtFont = new Font("Time New Roman", Font.PLAIN, 24);
	private TrueTypeFont font = new TrueTypeFont(awtFont, true);
	
	public TextRenderer() {
	}
	
	public void drawString(int x, int y, String text) {
		font.drawString(x, y, text);
	}
	
}