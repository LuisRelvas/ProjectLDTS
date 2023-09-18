package example.Viewer.Game;

import example.GUI.GUI;
import example.model.game.elements.mario.Mario;
import example.model.game.elements.mario.PowerDownState;
import example.model.game.elements.mario.PowerUpState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MarioViewerTest {

    private GUI gui;

    @BeforeEach
    void setUp() {
        gui = mock(GUI.class);
    }

    @Test
    void drawWhenStateIsPowerDownStateThenDrawHero() {
        Mario mario = new Mario(0, 0);
        mario.setState(PowerDownState.getInstance());
        MarioViewer marioViewer = new MarioViewer();
        marioViewer.draw(mario, gui);
        verify(gui, times(1)).drawHero(mario.getScreenPosition());
    }

    @Test
    void drawWhenStateIsNotPowerDownStateThenDrawHeroPowered() {
        Mario mario = new Mario(0, 0);
        mario.setState(PowerUpState.getInstance());
        MarioViewer marioViewer = new MarioViewer();
        marioViewer.draw(mario, gui);
        verify(gui, times(1)).drawHeroPowered(mario.getScreenPosition());
    }
}
