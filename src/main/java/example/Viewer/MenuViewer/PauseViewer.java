package example.Viewer.MenuViewer;

import example.GUI.GUI;
import example.Viewer.Game.GameViewer;
import example.Viewer.Viewer;
import example.model.Position;
import example.model.menu.PauseMenu;

public class PauseViewer extends Viewer<PauseMenu> {


    public PauseViewer(PauseMenu model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(13, 7), "Pause", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(15, 10 + i * 2),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");

    }
}
