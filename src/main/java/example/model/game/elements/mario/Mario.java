package example.model.game.elements.mario;

import example.model.Position;
import example.model.game.elements.Element;

public class Mario extends Element {

    public MarioState state;

    private Position lastPosition;
    private int coins;
    private final int screenX = 20;
    private final int screenY = 10;

    private boolean extraLife = false;

    private boolean isDead = false;

    private final Position screenPosition = new Position(screenX,screenY);

    public Mario(int x, int y) {
        super(x, y);
        this.coins = 0;
        state = PowerDownState.getInstance();
    }

    public void gotMushroom() {
        state.gotMushroom(this);
    }

    public void gotEnemy(){
        state.gotEnemy(this);
    }


    public void encreaseCoins() {
        this.coins++;
    }

    public void encreaseNCoins(int n) {
        this.coins += n;
    }


    public int getCoins() {
        return coins;
    }

    public Position getScreenPosition() {
        return screenPosition;
    }

    public void setState(MarioState state) {
        this.state = state;
    }
    public MarioState getState() {return this.state;}

    public boolean isExtraLife() {
        return extraLife;
    }

    public void setExtraLife(boolean extraLife) {
        this.extraLife = extraLife;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Position getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(Position lastPosition) {
        this.lastPosition = lastPosition;
    }
}