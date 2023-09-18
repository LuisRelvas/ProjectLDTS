package example.Viewer.MenuViewer;

import example.GUI.GUI;
import example.Viewer.Viewer;
import example.model.Position;
import example.model.menu.EndGameMenu;

public class EndGameViewer extends Viewer<EndGameMenu> {

    public EndGameViewer(EndGameMenu model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(13, 7), "Level completed", "#FFFFFF");


        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(15, 10 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
    }
}
