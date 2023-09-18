package example.State.MenuState;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.model.menu.PauseMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

class PauseStateTest {
    @Mock
    PauseState pauseState;

    private GUI gui;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        gui = mock(GUI.class);
    }

    @Test
    void testGetViewer() {
        Viewer<PauseMenu> result = pauseState.getViewer();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetController() {
        Controller<PauseMenu> result = pauseState.getController();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testStep() throws IOException, URISyntaxException, FontFormatException {
        pauseState.step(null, new LanternaGUI(0, 0), 0L);
    }
}