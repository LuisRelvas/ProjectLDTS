package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.MenuState.MainMenuState;
import example.controller.Controller;
import example.model.menu.GameOverMenu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class GameOverMenuControllerTest {

    @Mock
    Game game = mock(Game.class);
    GUI gui = mock(GUI.class);
    GameOverMenu gameOverMenu = new GameOverMenu();
    Controller<GameOverMenu> controller = new GameOverMenuController(gameOverMenu);

    @Test
    void stepWhenUserSelectsContinueThenSetStateToMainMenuState() throws IOException {


        when(gui.getNextAction()).thenReturn(GUI.ACTION.SELECT);

        controller.step(game, gui.getNextAction(), 0);

        verify(game).setState(any(MainMenuState.class));
    }
}