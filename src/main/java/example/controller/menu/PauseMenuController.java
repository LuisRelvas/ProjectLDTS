package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.MenuState.MainMenuState;
import example.controller.Controller;
import example.model.menu.MainMenu;
import example.model.menu.PauseMenu;

import java.io.IOException;

public class PauseMenuController extends Controller<PauseMenu> {

    public PauseMenuController(PauseMenu model) {
        super(model);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedContinue()) game.setState(getModel().getGameState());
                if (getModel().isSelectedExit()) game.setState(new MainMenuState(new MainMenu()));
        }
    }
}
