package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.MenuState.MainMenuState;
import example.State.MenuState.SelectLevelMenuState;
import example.controller.Controller;
import example.model.menu.GameOverMenu;
import example.model.menu.MainMenu;
import example.model.menu.SelectLevelMenu;

import java.io.IOException;

public class GameOverMenuController extends Controller<GameOverMenu> {

    public GameOverMenuController(GameOverMenu model) {
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
