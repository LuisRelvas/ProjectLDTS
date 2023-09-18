package example.controller.menu;

import example.GUI.GUI;
import example.Game;
import example.model.menu.SelectLevelMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class SelectLevelMenuControllerTest {

    @Mock
    private SelectLevelMenu mockSelectLevelMenu;

    private SelectLevelMenuController selectLevelMenuControllerUnderTest;

    private AutoCloseable mockitoCloseable;

    @BeforeEach
    void setUp() {
        mockitoCloseable = openMocks(this);
        selectLevelMenuControllerUnderTest = new SelectLevelMenuController(mockSelectLevelMenu);
    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testStep() throws Exception {

        final Game game = new Game();
        when(mockSelectLevelMenu.isSelectedExit()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected1()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected2()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected3()).thenReturn(false);

        selectLevelMenuControllerUnderTest.step(game, GUI.ACTION.UP, 0L);


        verify(mockSelectLevelMenu).previousEntry();
        verify(mockSelectLevelMenu).nextEntry();
    }

    @Test
    void testStep_ThrowsIOException() throws Exception {

        final Game game = new Game();
        when(mockSelectLevelMenu.isSelectedExit()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected1()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected2()).thenReturn(false);
        when(mockSelectLevelMenu.isSelected3()).thenReturn(false);

        assertThrows(IOException.class, () -> selectLevelMenuControllerUnderTest.step(game, GUI.ACTION.UP, 0L));
        verify(mockSelectLevelMenu).previousEntry();
        verify(mockSelectLevelMenu).nextEntry();
    }
}
