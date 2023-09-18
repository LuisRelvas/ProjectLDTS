package example.Viewer.Game;

import example.GUI.GUI;
import example.model.Position;
import example.model.game.elements.Enemy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class EnemyViewerTest {

    private EnemyViewer enemyViewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        enemyViewer = new EnemyViewer();
        gui = mock(GUI.class);
    }

    @Test
    void drawShouldDrawMonsterInScreenPositionOfEnemy() {
        Enemy enemy = new Enemy(1, 1);
        enemy.setScreenPosition(new Position(2, 2));
        enemyViewer.draw(enemy, gui);
        verify(gui).drawMonster(enemy.getScreenPosition());
    }
}
