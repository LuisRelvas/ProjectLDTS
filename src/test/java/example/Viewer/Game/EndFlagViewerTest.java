package example.Viewer.Game;

import example.GUI.GUI;
import example.GUI.LanternaGUI;
import example.Viewer.MenuViewer.EndGameViewer;
import example.model.Position;
import example.model.game.elements.EndFlag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.openMocks;

class EndFlagViewerTest {

    EndFlagViewer endFlagViewer = new EndFlagViewer();
    private GUI gui;

    private Position position;

    private AutoCloseable mockitocloseable;
    @BeforeEach
    void setup(){
        gui = mock(GUI.class);
        position = new Position(10,10);
        mockitocloseable= openMocks(this);
    }


    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        endFlagViewer.draw(new EndFlag(10, 10), gui);
    }
}

