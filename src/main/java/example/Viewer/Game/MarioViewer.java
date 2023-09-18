package example.Viewer.Game;


import example.Viewer.Game.ElementViewer;
import example.model.game.elements.mario.Mario;
import example.GUI.GUI;
import example.model.game.elements.mario.PowerDownState;

public class MarioViewer implements ElementViewer<Mario> {

    @Override
    public void draw(Mario mario, GUI gui) {
        if (mario.getState()== PowerDownState.getInstance()){
            gui.drawHero(mario.getScreenPosition());
        }
        else {
            gui.drawHeroPowered(mario.getScreenPosition());
        }
    }
}