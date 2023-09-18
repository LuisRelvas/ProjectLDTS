package example.model.game.elements.brick;

import com.googlecode.lanterna.terminal.swing.TerminalScrollController;
import example.model.game.elements.Element;

public class BreakableBrick extends Element implements Brick<Element> {

    public BreakableBrick(int x, int y) {
        super(x, y);
    }

    @Override
    public Element onHit() {
        return null;
    }
}
