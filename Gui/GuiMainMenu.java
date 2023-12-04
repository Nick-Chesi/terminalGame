package terminalGame.Gui;

import terminalGame.Main;

public class GuiMainMenu {
	
	private Main main = new Main();

    public GuiMainMenu() {
    	
    }

    public void render() {
        // Render the text
        // You'll need to set up text rendering here using STB or a similar library
        //System.out.println("RENDER"); 
    	main.textRender.drawString(0, 0, "HAHSAHASHDFHSDHh");
    }
}
