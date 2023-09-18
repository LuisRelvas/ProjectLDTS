package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.GameState;
import example.State.MenuState.MainMenuState;
import example.model.game.map.Map;
import example.model.menu.PauseMenu;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PauseMenuControllerTest {

    @Test
    void stepWhenContinueIsSelectedThenSetStateToGameState() throws IOException, URISyntaxException, FontFormatException {
        Game game = new Game();
        PauseMenu pauseMenu = new PauseMenu(game.getState());
        PauseMenuController pauseMenuController = new PauseMenuController(pauseMenu);

        pauseMenuController.step(game, GUI.ACTION.SELECT, 0);

        assertEquals(game.getState(), pauseMenu.getGameState());
    }

    @Test
    void stepWhenExitIsSelectedThenSetStateToMainMenuState() throws IOException, URISyntaxException, FontFormatException {
        Game game = new Game();
        PauseMenu pauseMenu = new PauseMenu(new GameState(new Map(10,10)));
        PauseMenuController pauseMenuController = new PauseMenuController(pauseMenu);

        pauseMenuController.step(game, GUI.ACTION.DOWN, 0);
        pauseMenuController.step(game, GUI.ACTION.SELECT, 0);

        assertTrue(game.getState() instanceof MainMenuState);
    }
}