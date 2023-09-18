package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.MenuState.MainMenuState;
import example.controller.Controller;
import example.model.menu.EndGameMenu;
import example.model.menu.MainMenu;

import java.io.IOException;

public class EndGameMenuController extends Controller<EndGameMenu> {

    public EndGameMenuController(EndGameMenu model) {
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
                if (getModel().isSelectedContinue()) game.setState(new MainMenuState(new MainMenu()));
        }
    }
}
