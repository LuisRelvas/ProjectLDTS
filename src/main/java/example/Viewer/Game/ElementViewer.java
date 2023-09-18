package example.Viewer.Game;

import example.model.game.elements.Element;
import example.GUI.GUI;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}