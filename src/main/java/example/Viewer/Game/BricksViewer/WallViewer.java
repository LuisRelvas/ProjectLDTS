package example.Viewer.Game.BricksViewer;


import example.Viewer.Game.ElementViewer;
import example.model.game.elements.brick.NormalBrick;
import example.GUI.GUI;

public class WallViewer implements ElementViewer<NormalBrick> {
    @Override
    public void draw(NormalBrick normalBrick, GUI gui) {
        gui.drawWall(normalBrick.getScreenPosition());
    }
}