package example.State.MenuState;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.Game;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.model.menu.GameOverMenu;
import example.model.menu.SelectLevelMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;

class GameOverStateTest {

    @Mock
    private GameOverMenu mockmodel;

    private GameOverState gameOverState;
    private GUI gui;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        gameOverState = new GameOverState(mockmodel);
        gui = mock(GUI.class);
    }

    @Test
    void testStep() throws IOException, URISyntaxException, FontFormatException, NullPointerException{
        gameOverState.step(new Game(), new LanternaGUI(0, 0), 1);
    }
}
