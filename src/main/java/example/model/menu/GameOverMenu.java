package example.model.menu;

import java.util.Arrays;
import java.util.List;

public class GameOverMenu extends Menu{

    public GameOverMenu() {
        super(Arrays.asList("Retry"));
    }
    public boolean isSelectedContinue() {
        return isSelected(0);
    }

}
