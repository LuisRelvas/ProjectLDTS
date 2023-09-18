package example.model.menu;

import java.util.Arrays;
import java.util.List;

public class EndGameMenu extends Menu{
    public EndGameMenu() {
        super(Arrays.asList("Continue"));
    }

    public boolean isSelectedContinue() {
        return isSelected(0);
    }

}
