package example.model.game.elements.brick;

import example.model.game.elements.Element;

public class NormalBrick extends Element implements Brick<Element>{

    public NormalBrick(int x, int y) {
        super(x, y);
    }

    @Override
    public Element onHit() {
        return null;
    }
}