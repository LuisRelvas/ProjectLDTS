package example.State.MenuState;

import example.State.State;
import example.Viewer.MenuViewer.EndGameViewer;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.controller.menu.EndGameMenuController;
import example.model.menu.EndGameMenu;

public class EndGameState extends State<EndGameMenu> {

    public EndGameState(EndGameMenu endGameMenu) {
        super(endGameMenu);
    }

    @Override
    protected Viewer<EndGameMenu> getViewer() {
        return new EndGameViewer(getModel());
    }

    @Override
    protected Controller<EndGameMenu> getController() {
        return new EndGameMenuController(getModel());
    }
}
