package example.GUI;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.Terminal;
import example.model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LanternaGUITest {
    private LanternaGUI gui;
    private Screen screen;
    private TextGraphics textGraphics;

    @BeforeEach
    void setUp() throws IOException, FontFormatException, URISyntaxException {
        screen = mock(Screen.class);
        textGraphics = mock(TextGraphics.class);

        when(screen.newTextGraphics()).thenReturn(textGraphics);

        gui = new LanternaGUI(screen);
    }

    @Test
    void drawCharacterShouldDrawTheCharacterWithTheCorrectColor() {
        Position position = new Position(1, 1);
        char c = 'H';
        String color = "#0064ff";

        gui.drawCharacter(position.getX(), position.getY(), c, color);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString(color));
        verify(textGraphics).putString(position.getX(), position.getY() + 1, "" + c);
    }


    @Test
    void drawTextShouldDrawTheTextInTheGivenColor() {
        Position position = new Position(1, 1);
        String text = "Hello";
        String color = "#FF0000";

        gui.drawText(position, text, color);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString(color));
        verify(textGraphics).putString(position.getX(), position.getY(), text);
    }

    @Test
    void drawMonsterShouldDrawAMonsterAtTheGivenPosition() {
        Position position = new Position(1, 2);

        gui.drawMonster(position);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString("#CC0000"));
        verify(textGraphics).putString(1, 3, "@");
    }

    @Test
    void drawPowerUpShouldDrawAPowerUpInTheGivenPosition() {
        Position position = new Position(1, 2);

        gui.drawPowerUp(position);

        verify(textGraphics).putString(1, 3, "_");
    }

    @Test
    void closeShouldCloseTheScreen() throws IOException {
        try {
            gui.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        verify(screen).close();
    }

    @Test
    void drawPowerBrickShouldDrawAPowerBrickInTheGivenPosition() {
        Position position = new Position(1, 1);

        gui.drawPowerBrick(position);

        verify(textGraphics).putString(position.getX(), position.getY() + 1, "x");
    }

    @Test
    void drawEndFlagShouldDrawAVerticalLineInTheGivenPosition() {
        Position position = new Position(1, 1);

        gui.drawEndFlag(position);

        verify(textGraphics).putString(1, 2, "|");
    }

    @Test
    void refreshWhenScreenIsNotClosedThenDoNotThrowException() {
        try {
            gui.refresh();
        } catch (IOException e) {
            fail("Should not throw an exception");
        }
    }

    @Test
    void refreshWhenScreenIsClosedThenThrowException() throws IOException {
        doThrow(IOException.class).when(screen).refresh();
        assertThrows(IOException.class, () -> gui.refresh());
    }

    @Test
    void clearShouldClearTheScreen() {
        gui.clear();
        verify(screen, times(1)).clear();
    }

    @Test
    void drawWallShouldDrawAWallInTheGivenPosition() {
        Position position = new Position(1, 2);

        gui.drawWall(position);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString("#6E260E"));
        verify(textGraphics).putString(1, 3, "x");
    }

    @Test
    void drawCoinShouldDrawACoinInTheGivenPosition() {
        Position position = new Position(1, 2);

        gui.drawCoin(position);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString("#FFBF00"));
        verify(textGraphics).putString(1, 3, "O");
    }





    @Test
    void drawHeroPoweredWhenHeroIsPoweredThenDrawWhiteH() {
        Position position = new Position(1, 1);

        gui.drawHeroPowered(position);

        verify(textGraphics).setForegroundColor(TextColor.Factory.fromString("#ffffff"));
        verify(textGraphics).putString(position.getX(), position.getY() + 1, "H");
    }


    @Test
    void drawHeroShouldDrawAHeroInTheGivenPosition() {
        Position position = new Position(1, 2);

        gui.drawHero(position);

        verify(textGraphics).putString(1, 3, "H");
    }
}