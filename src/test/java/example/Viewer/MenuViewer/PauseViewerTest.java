package example.Viewer.MenuViewer;

import example.GUI.LanternaGUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

class PauseViewerTest {

    @InjectMocks
    PauseViewer pauseViewer;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testDrawElements() throws IOException, URISyntaxException, FontFormatException {
        pauseViewer.drawElements(new LanternaGUI(0, 0));
    }

    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        pauseViewer.draw(new LanternaGUI(0, 0));
    }
}
