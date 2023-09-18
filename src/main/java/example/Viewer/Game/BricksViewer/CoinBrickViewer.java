package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.Viewer.Game.ElementViewer;
import example.model.game.elements.brick.CoinBrick;

public class CoinBrickViewer implements ElementViewer<CoinBrick> {
    @Override
    public void draw(CoinBrick coinBrick, GUI gui) {
        gui.drawWall(coinBrick.getScreenPosition());
    }
}
