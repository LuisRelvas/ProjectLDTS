package example.controller.game;

import example.model.game.map.Map;
import example.model.game.elements.Enemy;
import example.GUI.GUI;
import example.Game;
import example.model.Position;

import java.io.IOException;

public class EnemyController extends GameController {
    private long lastMovement;

    public EnemyController(Map map) {
        super(map);

        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - this.lastMovement > 100) {
            for (Enemy enemy : getModel().getEnemies()) {
                if (getModel().isEmpty(new Position(enemy.getPosition().getX() - 1, enemy.getPosition().getY())) && !enemy.isHitWall()) {
                    enemy.setPosition(enemy.getPosition().getLeft());
                    if (getModel().isEmpty(new Position(enemy.getPosition().getX(), enemy.getPosition().getY() + 1))) {
                        enemy.setPosition(enemy.getPosition().getDown());
                    }
                }
                else{enemy.setHitWall(true);}
                if (getModel().isEmpty(new Position(enemy.getPosition().getX() + 1, enemy.getPosition().getY())) && enemy.isHitWall()) {
                    enemy.setPosition(enemy.getPosition().getRight());
                    if (getModel().isEmpty(new Position(enemy.getPosition().getX(), enemy.getPosition().getY() + 1))) {
                        enemy.setPosition(enemy.getPosition().getDown());
                    }
                }
                else {enemy.setHitWall(false);}
                this.lastMovement = time;
            }
            }
        }
    }


