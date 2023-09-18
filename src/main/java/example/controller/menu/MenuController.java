package example.controller.menu;

import example.State.MenuState.SelectLevelMenuState;
import example.model.menu.MainMenu;
import example.Game;
import example.controller.Controller;

import java.io.IOException;
import example.GUI.GUI;
import example.model.menu.SelectLevelMenu;


public class MenuController extends Controller<MainMenu> {
    public MenuController(MainMenu mainMenu) {
        super(mainMenu);
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
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedStart()) game.setState(new SelectLevelMenuState(new SelectLevelMenu()));
        }
    }
}
