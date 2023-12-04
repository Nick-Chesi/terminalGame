package terminalGame.Gui;

public class GuiMainMenu {
    private String text;

    public GuiMainMenu(String text) {
        this.text = text;
    }

    public void render() {
        // Render the text
        // You'll need to set up text rendering here using STB or a similar library
        System.out.println(text); // Placeholder for actual rendering code
    }
}
