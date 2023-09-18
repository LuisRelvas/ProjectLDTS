package example.model.game.elements.brick;

import example.model.game.elements.Coin;
import example.model.game.elements.Element;

public class CoinBrick extends Element implements Brick<Coin> {

    private boolean isHit = false;
    public CoinBrick(int x, int y) {
        super(x, y);
    }

    @Override
    public Coin onHit() {
        if(!isHit){
            Coin coin = new Coin(this.getPosition().getX(), this.getPosition().getY() - 1);
            coin.setScreenPosition(coin.getPosition());
            isHit = true;
            return coin;
        }
        return null;
    }

    public boolean isBrickHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
