package example.Viewer.Game;

import example.GUI.GUI;
import example.model.game.elements.EndFlag;

public class EndFlagViewer implements  ElementViewer<EndFlag>{
    @Override
    public void draw(EndFlag endFlag, GUI gui) {
        gui.drawEndFlag(endFlag.getScreenPosition());
    }
}
