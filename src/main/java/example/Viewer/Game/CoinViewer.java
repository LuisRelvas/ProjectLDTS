package example.Viewer.Game;

import example.GUI.GUI;
import example.model.game.elements.Coin;
import example.model.game.elements.Element;

public class CoinViewer implements ElementViewer<Coin> {
    @Override
    public void draw(Coin coin, GUI gui) {
        gui.drawCoin(coin.getScreenPosition());
    }
}
