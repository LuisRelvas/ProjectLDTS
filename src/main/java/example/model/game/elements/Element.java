package example.model.game.elements;

import example.model.Position;

public abstract class Element {
    private Position position;
    private Position screenPosition;
    public Element(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public Position getScreenPosition() {
        return screenPosition;
    }

    public void setScreenPosition(Position screenPosition) {
        this.screenPosition = screenPosition;
    }
}

