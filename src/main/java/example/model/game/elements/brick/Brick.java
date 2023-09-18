package example.model.game.elements.brick;

import example.model.game.elements.Element;

public interface Brick<T extends Element>{

    T onHit();
}
