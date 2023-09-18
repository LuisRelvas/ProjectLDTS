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

class SelectMenuViewerTest {

    SelectMenuViewer selectMenuViewer;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testDrawElements() throws IOException, URISyntaxException, FontFormatException {
        selectMenuViewer.drawElements(new LanternaGUI(10, 0));
    }

    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        selectMenuViewer.draw(new LanternaGUI(0, 0));
    }
}
