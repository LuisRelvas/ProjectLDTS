package example.model.menu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SelectLevelMenuTest {

    @Test
    void isSelected2WhenUserSelects1ThenReturnFalse() {
        SelectLevelMenu menu = new SelectLevelMenu();
        menu.nextEntry();
        assertFalse(menu.isSelected2());
    }

    @Test
    void isSelected2WhenUserSelects2ThenReturnTrue() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        assertTrue(selectLevelMenu.isSelected2());
    }

    @Test
    void isSelected2WhenUserSelects3ThenReturnFalse() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        assertFalse(selectLevelMenu.isSelected2());
    }

    @Test
    void isSelected1WhenUserSelects1ThenReturnTrue() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        assertTrue(selectLevelMenu.isSelected1());
    }

    @Test
    void isSelected1WhenUserSelects2ThenReturnFalse() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        boolean result = selectLevelMenu.isSelected1();
        assertFalse(result);
    }

    @Test
    void isSelected1WhenUserSelects3ThenReturnFalse() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();

        boolean result = selectLevelMenu.isSelected1();

        assertFalse(result);
    }

    @Test
    void isSelected1WhenUserSelects4ThenReturnFalse() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        assertFalse(selectLevelMenu.isSelected1());
    }

    @Test
    void isSelected3WhenUserSelects1ThenReturnFalse() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        assertFalse(selectLevelMenu.isSelected3());
    }

    @Test
    void isSelected3WhenUserSelects3ThenReturnTrue() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        assertTrue(selectLevelMenu.isSelected3());
    }

    @Test
    void isSelectedExitWhenSelectedIndexIs3ThenReturnTrue() {
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();
        selectLevelMenu.nextEntry();

        boolean result = selectLevelMenu.isSelectedExit();

        assertTrue(result);
    }

    @Test
    void isSelectedExitWhenSelectedIndexIsNot3ThenReturnFalse() {
        Menu menu = mock(Menu.class);
        when(menu.isSelected(3)).thenReturn(false);
        SelectLevelMenu selectLevelMenu = new SelectLevelMenu();

        boolean result = selectLevelMenu.isSelectedExit();

        assertFalse(result);
    }
}