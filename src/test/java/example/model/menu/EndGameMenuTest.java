package example.model.menu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EndGameMenuTest {

    @Test
    void isSelectedContinueWhenUserSelectsContinue() {
        EndGameMenu endGameMenu = new EndGameMenu();
        endGameMenu.nextEntry();
        assertTrue(endGameMenu.isSelectedContinue());
    }

    @Test
    void isSelectedContinueWhenUserDoesNotSelectContinue() {
        Menu menu = mock(Menu.class);
        when(menu.isSelected(0)).thenReturn(false);
        EndGameMenu endGameMenu = new EndGameMenu();
        assertFalse(endGameMenu.isSelected(1));
    }
}