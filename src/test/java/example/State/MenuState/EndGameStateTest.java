package example.State.MenuState;

import example.Viewer.MenuViewer.EndGameViewer;
import example.model.menu.EndGameMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class EndGameStateTest {

    @Test
    void getViewerShouldReturnAnEndGameViewer() {
        EndGameMenu endGameMenu = mock(EndGameMenu.class);
        EndGameState endGameState = new EndGameState(endGameMenu);
        assertTrue(endGameState.getViewer() instanceof EndGameViewer);
    }
}