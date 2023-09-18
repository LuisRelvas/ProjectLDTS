package example.Viewer.Game.BricksViewer;

import example.GUI.GUI;
import example.Viewer.Game.ElementViewer;
import example.model.game.elements.brick.PowerUpBrick;

public class PowerUpBrickViewer implements ElementViewer<PowerUpBrick> {
    @Override
    public void draw(PowerUpBrick powerUpBrick, GUI gui) {
        gui.drawPowerBrick(powerUpBrick.getScreenPosition());
    }
}
