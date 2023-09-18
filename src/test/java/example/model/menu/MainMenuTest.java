package example.model.menu;

import example.State.MenuState.MainMenuState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;

class MainMenuTest {

    private MainMenu main;

    @BeforeEach
    void setUp() {
        main = new MainMenu();
        MainMenuState mainMock = mock(MainMenuState.class);
        MenuElement menuElement =mock(MenuElement.class);
    }
    @Test
    public void selectNext() {
        Assertions.assertEquals("Start",main.getEntry(0));
        Assertions.assertEquals("Exit",main.getEntry(1));
    }


}
