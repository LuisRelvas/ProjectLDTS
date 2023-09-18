package example.model.game.elements;

import example.model.Position;

public class Enemy extends Element {

    private boolean hitWall = false;

    public Enemy(int x, int y) {
        super(x, y);
    }

    public boolean isHitWall() {
        return hitWall;
    }

    public void setHitWall(boolean hitWall) {
        this.hitWall = hitWall;
    }
}