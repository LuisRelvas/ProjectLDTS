package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.GameState;
import example.State.MenuState.MainMenuState;
import example.controller.Controller;
import example.model.game.map.LoaderMapBuilder;
import example.model.menu.MainMenu;
import example.model.menu.SelectLevelMenu;

import java.io.IOException;

public class SelectLevelMenuController extends Controller<SelectLevelMenu> {

    public SelectLevelMenuController(SelectLevelMenu selectLevelMenu) {
        super(selectLevelMenu);
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
                if (getModel().isSelectedExit()) game.setState(new MainMenuState(new MainMenu()));
                if (getModel().isSelected1()) game.setState(new GameState(new LoaderMapBuilder(1).createArena()));
                if (getModel().isSelected2()) game.setState(new GameState(new LoaderMapBuilder(2).createArena()));
                if (getModel().isSelected3()) game.setState(new GameState(new LoaderMapBuilder(3).createArena()));

        }
    }
}
