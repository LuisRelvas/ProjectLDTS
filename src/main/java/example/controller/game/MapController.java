package example.controller.game;

import java.io.IOException;

import example.State.MenuState.EndGameState;
import example.State.MenuState.GameOverState;
import example.State.MenuState.MainMenuState;
import example.State.MenuState.PauseState;
import example.model.menu.EndGameMenu;
import example.model.menu.GameOverMenu;
import example.model.menu.MainMenu;
import example.GUI.GUI;
import example.Game;
import example.model.game.map.Map;
import example.model.menu.PauseMenu;


public class MapController extends GameController {
    private final MarioController marioController;
    private final EnemyController enemyController;
    private final CameraController cameraController;


    public MapController(Map map) {
        super(map);

        this.marioController = new MarioController(map);
        this.enemyController = new EnemyController(map);
        this.cameraController= new CameraController(map);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if(action == GUI.ACTION.PAUSE){ game.setState(new PauseState(new PauseMenu(game.getState())));System.out.println("hit");}
        if (getModel().deadFall() || getModel().getHero().isDead()) {game.setState(new GameOverState(new GameOverMenu()));
        }
        if (getModel().isEndFlag(getModel().getHero().getPosition())) {game.setState(new EndGameState(new EndGameMenu()));}
        if (action == GUI.ACTION.QUIT)
            game.setState(new MainMenuState(new MainMenu()));
        else {
            marioController.step(game, action, time);
            cameraController.step(game, action, time);
            enemyController.step(game, action ,time);
        }
    }
}
