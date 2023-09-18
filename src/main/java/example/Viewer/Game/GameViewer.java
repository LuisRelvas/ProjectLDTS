package example.Viewer.Game;

import example.Viewer.Game.BricksViewer.BreakableBrickViewer;
import example.Viewer.Game.BricksViewer.CoinBrickViewer;
import example.Viewer.Game.BricksViewer.PowerUpBrickViewer;
import example.Viewer.Game.BricksViewer.WallViewer;
import example.Viewer.Viewer;
import example.model.game.elements.Element;
import example.GUI.GUI;
import example.model.Position;
import example.model.game.map.Map;

import java.util.List;

public class GameViewer extends Viewer<Map> {
    public GameViewer(Map map) {
        super(map);
    }

    @Override
    public void drawElements(GUI gui) {

        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElement(gui, getModel().getHero(), new MarioViewer());
        drawElements(gui, getModel().getCoins(), new CoinViewer());
        drawElements(gui, getModel().getEnemies(), new EnemyViewer());
        drawElement(gui, getModel().getEndFlag(), new EndFlagViewer());
        drawElements(gui, getModel().getPowerUps(), new PowerUpViewer());
        drawElements(gui, getModel().getBreakableBricks(), new BreakableBrickViewer());
        drawElements(gui, getModel().getCoinBricks(), new CoinBrickViewer());
        drawElements(gui, getModel().getPowerUpBricks(), new PowerUpBrickViewer());

        gui.drawText(new Position(0, 0), "Coins: " + getModel().getHero().getCoins(), "#FFD700");
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}