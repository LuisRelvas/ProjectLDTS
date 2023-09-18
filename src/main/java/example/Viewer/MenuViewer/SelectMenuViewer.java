package example.Viewer.MenuViewer;

import example.GUI.GUI;
import example.Viewer.Viewer;
import example.model.Position;
import example.model.menu.SelectLevelMenu;

public class SelectMenuViewer extends Viewer<SelectLevelMenu> {

    public SelectMenuViewer(SelectLevelMenu selectLevelMenu) {
        super(selectLevelMenu);
    }

    @Override
    protected void drawElements(GUI gui) {
        gui.drawText(new Position(13, 7), "Select Level", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(15, 10 + i*2),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
    }
}
