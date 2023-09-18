package example.controller.game;

import example.GUI.GUI;
import example.Game;
import example.model.Position;
import example.model.game.map.Map;


public class MarioController extends GameController {

    boolean isFalling;
    boolean isJumping;

    long lastFall;

    long lastJump;

    int jumpSize = 0;

    public MarioController(Map map) {
        super(map);
        lastFall = 0;
        lastJump = 0;
        isFalling = true;
        isJumping = false;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP && canHeroJump()) moveHeroJump(time);
        if (action == GUI.ACTION.RIGHT) moveHeroRight();
        if (action == GUI.ACTION.DOWN) moveHeroDown();
        if (action == GUI.ACTION.LEFT) moveHeroLeft();
        if (isJumping) {
            moveHeroJump(time);
        }
        if (isFalling) {
            gravity(time);
        }
        EnemyCollision();
    }

    private void EnemyCollision() {
        if(getModel().isMonster(getModel().getHero().getPosition()))getModel().getHero().gotEnemy();
    }

    public void gravity(long time) {
        if (!isJumping) {
            if (time - lastFall > 100) {
                moveHero(getModel().getHero().getPosition().getDown());
                lastFall = time;
            }
        }
    }

    public void moveHeroLeft() {
        moveHero(getModel().getHero().getPosition().getLeft());
    }

    public void moveHeroRight() {
        moveHero(getModel().getHero().getPosition().getRight());
    }

    public void moveHeroJump(long time) {
        isJumping = true;
        if (time - lastJump > 100) {
            moveHero(getModel().getHero().getPosition().getUp());
            lastJump = time;
            jumpSize++;
        }
        if (jumpSize >= 4) {
            isJumping = false;
            jumpSize = 0;
        }
    }

    public void moveHeroDown() {
        moveHero(getModel().getHero().getPosition().getDown());
    }

    //IMPLEMENT SINGLE RESPONSIBILITY PRINCIPLE
    private void moveHero(Position position) {
        setLastPosition();
        if (getModel().isEmpty(position)) {
            getModel().getHero().setPosition(position);

        } else {
            isFalling = true;
        }
        if (getModel().isCoin(position)) {
            getModel().getHero().encreaseCoins();
        }
        if (!getModel().isEmpty(new Position(getModel().getHero().getPosition().getX(), getModel().getHero().getPosition().getY() - 1))) { //IF walls underneath exists , then is jumping is set off
            isJumping = false;
        }
        if (getModel().isMonsterHit(position)) {
            jumpReset();
        }
        if (getModel().isPowerUp(position)) {
            getModel().getHero().gotMushroom();
        }
        if(getModel().isBreakableBrick(position) || getModel().isPowerBrick(position) || getModel().isCoinBrick(position)){
            isJumping=false;
            jumpSize = 0;
            isFalling = true;
        }
    }

    private void jumpReset() {
        isJumping = true;
        jumpSize = 0;
    }

    private boolean canHeroJump() {
        return !getModel().isEmpty(new Position(getModel().getHero().getPosition().getX(), getModel().getHero().getPosition().getY() + 1));
    }

    private void setLastPosition(){
        getModel().getHero().setLastPosition(getModel().getHero().getPosition());
    }
}