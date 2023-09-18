package example.Viewer.MenuViewer;


import example.Viewer.Viewer;
import example.model.menu.MainMenu;
import example.GUI.GUI;
import example.model.Position;

public class MenuViewer extends Viewer<MainMenu> {
    public MenuViewer(MainMenu mainMenu) {
        super(mainMenu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(13, 7), "Main Menu", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(15, 10 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
    }
}