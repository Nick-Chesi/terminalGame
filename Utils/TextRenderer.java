package terminalGame.Utils;

import java.awt.Font;
import static org.lwjgl.opengl.GL11.*;

import org.newdawn.slick.TrueTypeFont;

public class TextRenderer {
	
	private Font awtFont = new Font("Time New Roman", Font.PLAIN, 24);
	private TrueTypeFont font;
	
	public TextRenderer() {
		awtFont = new Font("Time New Roman", Font.PLAIN, 24);
		//font = new TrueTypeFont(awtFont, false);
	}
	
	public void drawString(int x, int y, String text) {
		font = new TrueTypeFont(awtFont, false);
		glEnable(GL_BLEND);
		font.drawString(x, y, text);
		glDisable(GL_BLEND);
	}
	
}