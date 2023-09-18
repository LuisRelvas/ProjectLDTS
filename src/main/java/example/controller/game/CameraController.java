package example.controller.game;

import example.GUI.GUI;
import example.Game;
import example.model.Position;
import example.model.game.map.Map;
import example.model.game.elements.Coin;
import example.model.game.elements.Enemy;
import example.model.game.elements.PowerUp;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;

import java.io.IOException;

public class CameraController  extends GameController{

    public CameraController(Map map) {
        super(map);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        for (Enemy enemy : getModel().getEnemies()) {
            enemy.setScreenPosition(new Position((enemy.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (enemy.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (NormalBrick normalBrick : getModel().getWalls()) {
            normalBrick.setScreenPosition(new Position((normalBrick.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (normalBrick.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (BreakableBrick breakableBrick : getModel().getBreakableBricks()) {
            breakableBrick.setScreenPosition(new Position((breakableBrick.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (breakableBrick.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (PowerUpBrick powerUpBrick : getModel().getPowerUpBricks()) {
            powerUpBrick.setScreenPosition(new Position((powerUpBrick.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (powerUpBrick.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (CoinBrick coinBrick : getModel().getCoinBricks()) {
            coinBrick.setScreenPosition(new Position((coinBrick.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (coinBrick.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (Coin coin : getModel().getCoins()) {
            coin.setScreenPosition(new Position((coin.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (coin.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        for (PowerUp powerUp : getModel().getPowerUps()) {
            powerUp.setScreenPosition(new Position((powerUp.getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (powerUp.getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
        }
        getModel().getEndFlag().setScreenPosition(new Position((getModel().getEndFlag().getPosition().getX() - getModel().getHero().getPosition().getX() + 20), (getModel().getEndFlag().getPosition().getY() - getModel().getHero().getPosition().getY() + 10)));
    }

}
