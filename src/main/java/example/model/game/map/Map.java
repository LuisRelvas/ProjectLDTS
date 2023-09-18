package example.model.game.map;


import example.model.game.elements.*;
import example.model.Position;
import example.model.game.elements.brick.BreakableBrick;
import example.model.game.elements.brick.CoinBrick;
import example.model.game.elements.brick.NormalBrick;
import example.model.game.elements.brick.PowerUpBrick;
import example.model.game.elements.mario.Mario;

import java.util.List;

public class Map {
    private final int width;
    private final int height;
    private Mario mario;
    private EndFlag endFlag;
    private List<Enemy> Enemies;
    private List<NormalBrick> normalBricks;
    private List<BreakableBrick> breakableBricks;
    private List<PowerUpBrick> powerUpBricks;
    private List<CoinBrick> coinBricks;
    private List<Coin> coins;
    private List<PowerUp> powerUps;
    private Camera camera;



    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Mario getHero() {
        return mario;
    }

    public void setHero(Mario mario) {
        this.mario = mario;
    }



    public List<NormalBrick> getWalls() {
        return normalBricks;
    }

    public void setWalls(List<NormalBrick> normalBricks) {
        this.normalBricks = normalBricks;
    }

    public boolean isEmpty(Position position) {
        for (NormalBrick normalBrick : normalBricks)
            if (normalBrick.getPosition().equals(position))
                return false;
        for (CoinBrick coinBrick :coinBricks)
            if(coinBrick.getPosition().equals(position))
                if(!isHitBox(coinBrick.getPosition()))
                    return false;
        for(PowerUpBrick powerUpBrick :powerUpBricks)
            if(powerUpBrick.getPosition().equals(position))
                if(!isHitBox(powerUpBrick.getPosition()))
                    return false;
        for(BreakableBrick breakableBrick : breakableBricks)
            if(breakableBrick.getPosition().equals(position))
                if(!isHitBox(breakableBrick.getPosition()))
                    return false;
        return true;
    }

    public boolean isBreakableBrick(Position position){
        for (BreakableBrick breakableBrick : breakableBricks)
            if (breakableBrick.getPosition().equals(position)) {
                if(isHitBox(breakableBrick.getPosition())) {
                    EraseBrick(breakableBrick);
                    return true;
                }
            }
        return false;
    }

    public boolean isPowerBrick(Position position){
        for (PowerUpBrick powerUpBrick : powerUpBricks)
            if (powerUpBrick.getPosition().equals(position)) {
                if(isHitBox(powerUpBrick.getPosition())) {
                    PowerUp temp = powerUpBrick.onHit();
                    if (temp == null) {
                        return true;
                    }
                    powerUps.add(temp);
                    return true;
                }
            }
        return false;
    }
    public boolean isCoinBrick(Position position){
        for (CoinBrick coinBrick : coinBricks)
            if (coinBrick.getPosition().equals(position)) {
                if(isHitBox(coinBrick.getPosition())) {
                    Coin temp = coinBrick.onHit();
                    if (temp == null) {
                        return true;
                    }
                    coins.add(temp);
                    return true;
                }
            }
        return false;
    }

    public boolean isMonster(Position position) {
        for (Enemy enemy : Enemies)
            if (enemy.getPosition().equals(position)) {
                if (getHero().isExtraLife())EraseEnemy(enemy);
                return true;
            }
        return false;
    }

    public Boolean isCoin(Position position) {
        for (Coin coin : coins)
            if (coin.getPosition().equals(position)) {
                EraseCoin(coin);
                return true;
            }
        return false;
    }

    public boolean isMonsterHit(Position position) {
        for (Enemy enemy : Enemies)
            if (enemy.getPosition().equals(new Position(position.getX(), position.getY()+1))){
                EraseEnemy(enemy);
                return true;
            }
        return false;
    }

    public Boolean isPowerUp(Position position) {
        for (PowerUp powerUp : powerUps)
            if (powerUp.getPosition().equals(position)) {
                ErasePowerUp(powerUp);
                if(mario.isExtraLife())mario.encreaseNCoins(10);
                return true;
            }
        return false;
    }


    public boolean deadFall(){
        return getHero().getPosition().getY() > getHeight() +5;
    }

    public boolean isEndFlag(Position position) {
        return endFlag.getPosition().equals(position);
    }

    public void EraseCoin(Coin coin){
        coins.remove(coin);
    }

    public void EraseEnemy(Enemy enemy){
        Enemies.remove(enemy);
    }

    private void ErasePowerUp(PowerUp powerUp) {powerUps.remove(powerUp);}

    public Camera getCamera() {
        return camera;
    }

    private void EraseBrick(BreakableBrick breakableBrick){
        breakableBricks.remove(breakableBrick);
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public List<Enemy> getEnemies() {
        return Enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        Enemies = enemies;
    }

    public EndFlag getEndFlag() {
        return endFlag;
    }

    public void setEndFlag(EndFlag endFlag) {
        this.endFlag = endFlag;
    }

    public List<PowerUp> getPowerUps() {
        return powerUps;
    }

    public void setPowerUps(List<PowerUp> powerUps) {
        this.powerUps = powerUps;
    }

    public List<BreakableBrick> getBreakableBricks() {
        return breakableBricks;
    }

    public void setBreakableBricks(List<BreakableBrick> breakableBricks) {
        this.breakableBricks = breakableBricks;
    }

    public List<PowerUpBrick> getPowerUpBricks() {
        return powerUpBricks;
    }

    public void setPowerUpBricks(List<PowerUpBrick> powerUpBricks) {
        this.powerUpBricks = powerUpBricks;
    }

    public List<CoinBrick> getCoinBricks() {
        return coinBricks;
    }

    public void setCoinBricks(List<CoinBrick> coinBricks) {
        this.coinBricks = coinBricks;
    }

    public boolean isHitBox(Position position){
        return mario.getLastPosition().getY() > position.getY();
    }
}