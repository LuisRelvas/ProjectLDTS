package example.Viewer.Game;

import example.GUI.GUI;
import example.model.game.elements.PowerUp;

public class PowerUpViewer implements ElementViewer<PowerUp>{
    @Override
    public void draw(PowerUp powerUp, GUI gui) {
        gui.drawPowerUp(powerUp.getScreenPosition());
    }
}
