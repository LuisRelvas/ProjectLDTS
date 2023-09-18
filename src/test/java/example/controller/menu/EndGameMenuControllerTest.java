package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.State.MenuState.MainMenuState;
import example.controller.Controller;
import example.model.menu.EndGameMenu;
import example.model.menu.MainMenu;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class EndGameMenuControllerTest {

    @Mock

    Game game = mock(Game.class);
    GUI gui = mock(GUI.class);
    EndGameMenu endGameMenu = mock(EndGameMenu.class);
    MainMenu mainMenu = mock(MainMenu.class);
    MainMenuState mainMenuState = mock(MainMenuState.class);



    Controller<EndGameMenu> controller = new EndGameMenuController(endGameMenu);

    @Test
    void stepWhenUpIsSelectedThenSetPreviousEntry() throws IOException {
        EndGameMenu menu = mock(EndGameMenu.class);
        EndGameMenuController controller = new EndGameMenuController(menu);
        Game game = mock(Game.class);

        controller.step(game, GUI.ACTION.UP, 0);

        verify(menu).previousEntry();
    }

    @Test
    void stepWhenDownIsSelectedThenSetNextEntry() throws IOException {
        EndGameMenu menu = mock(EndGameMenu.class);
        EndGameMenuController controller = new EndGameMenuController(menu);
        Game game = mock(Game.class);

        controller.step(game, GUI.ACTION.DOWN, 0);

        verify(menu).nextEntry();
    }

    @Test
    void stepWhenContinueIsSelectedThenSetStateToMainMenuState() throws IOException {
        when(endGameMenu.isSelectedContinue()).thenReturn(true);
        when(game.getState()).thenReturn(mainMenuState);
        controller.step(game, GUI.ACTION.SELECT, 0);

        verify(game, times(1)).setState(any());
    }
}