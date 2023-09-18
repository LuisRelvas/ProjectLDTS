package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.Viewer.Game.ElementViewer;
import example.model.game.elements.brick.BreakableBrick;

public class BreakableBrickViewer implements ElementViewer<BreakableBrick> {
    @Override
    public void draw(BreakableBrick breakableBrick, GUI gui) {
        gui.drawWall(breakableBrick.getScreenPosition());
    }
}
