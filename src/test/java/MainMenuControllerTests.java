import example.GUI.GUI;
import example.Game;
import example.controller.menu.MenuController;
import example.model.menu.MainMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class MainMenuControllerTests {
    private MenuController controller;
    private MainMenu mainMenu;
    private Game game;

    public MainMenuControllerTests() throws IOException {
    }


    @BeforeEach
    void setUp() {
        mainMenu = mock(MainMenu.class);
        controller = new MenuController(mainMenu);
        game = Mockito.mock(Game.class);

    }
    @Test
    public void ProcessKeyTest() throws IOException, InterruptedException{
        controller.step(game, GUI.ACTION.UP,1000);
        controller.step(game,GUI.ACTION.SELECT,1000);


    }
}
