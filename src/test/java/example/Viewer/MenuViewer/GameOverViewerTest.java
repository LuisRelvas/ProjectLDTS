package example.Viewer.MenuViewer;

import example.GUI.GUI;
import example.model.menu.GameOverMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class GameOverViewerTest {

    @Mock
    private GameOverMenu mockModel;

    private GameOverViewer gameOverViewerUnderTest;

    private AutoCloseable mockitoCloseable;

    private GUI gui;

    @BeforeEach
    void setUp() {
        gui = mock(GUI.class);
        mockitoCloseable = openMocks(this);
        gameOverViewerUnderTest = new GameOverViewer(mockModel);
    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testDrawElements() {


        when(mockModel.getNumberEntries()).thenReturn(0);
        when(mockModel.getEntry(0)).thenReturn("result");
        when(mockModel.isSelected(0)).thenReturn(false);


        gameOverViewerUnderTest.drawElements(gui);

    }
}
