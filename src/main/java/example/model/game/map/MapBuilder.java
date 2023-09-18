package example.model.game.map;

import example.model.game.elements.*;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;

import java.util.List;

public abstract class MapBuilder {
    public Map createArena() {
        Map map = new Map(getWidth(), getHeight());

        map.setHero(createHero());
        map.setEnemies(createEnemies());
        map.setWalls(createWalls());
        map.setBreakableBricks(createBreakableBricks());
        map.setPowerUpBricks(createPowerUpBricks());
        map.setCoinBricks(createCoinBricks());
        map.setCoins(createCoins());
        map.setCamera(createCamera());
        map.setEndFlag(createEndFLag());
        map.setPowerUps(createPowerUps());

        return map;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<NormalBrick> createWalls();

    protected abstract List<BreakableBrick> createBreakableBricks();

    protected abstract List<PowerUpBrick> createPowerUpBricks();

    protected abstract List<CoinBrick> createCoinBricks();

    protected abstract List<Enemy> createEnemies();

    protected abstract List<Coin> createCoins();

    protected abstract List<PowerUp> createPowerUps();

    protected abstract Mario createHero();

    protected abstract EndFlag createEndFLag();

    protected abstract Camera createCamera();



}
