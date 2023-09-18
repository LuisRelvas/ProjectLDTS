package example.model.game.elements.brick;

import example.model.game.elements.Element;
import example.model.game.elements.PowerUp;

public class PowerUpBrick extends Element implements Brick<PowerUp> {

    private boolean isHit = false;
    public PowerUpBrick(int x, int y) {
        super(x, y);
    }

    @Override
    public PowerUp onHit() {
        if(!isHit) {
            PowerUp powerUp = new PowerUp(this.getPosition().getX(), this.getPosition().getY() - 1);
            powerUp.setScreenPosition(powerUp.getPosition());
            isHit = true;
            return powerUp;
        }
        return null;
    }
    public boolean isBrickHit(){return isHit;}
}
