package example.Viewer.Game;

import example.GUI.GUI;
import example.model.Position;
import example.model.game.map.Map;
import example.model.game.elements.Coin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.openMocks;

class CoinViewerTest {


    private Map MockMap;
    private CoinViewer coinViewer;

    private Position position;

    private AutoCloseable mockitocloseable;

    private GUI gui;

    ElementViewer element;

    @BeforeEach
    void setUp() throws IOException, URISyntaxException, FontFormatException {
        gui = mock(GUI.class);
        position = new Position(10,10);
        mockitocloseable= openMocks(this);
        coinViewer = new CoinViewer();



    }

    @Test
    void testDraw() throws IOException, URISyntaxException, FontFormatException {
        gui.drawCoin(position);
        coinViewer.draw(new Coin(10, 10), gui);
    }
}

