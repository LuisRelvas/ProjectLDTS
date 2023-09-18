package example.Viewer.Game;

import example.model.game.elements.Enemy;
import example.GUI.GUI;

public class EnemyViewer implements ElementViewer<Enemy> {
    @Override
    public void draw(Enemy enemy, GUI gui) {
        gui.drawMonster(enemy.getScreenPosition());
    }
}