package example.model.menu;

import java.util.Arrays;
import java.util.List;

public class SelectLevelMenu extends Menu{

    public SelectLevelMenu() {
        super(Arrays.asList("Level 1", "Level 2", "Level 3", "Back"));
    }

    public boolean isSelectedExit() {
        return isSelected(3);
    }
    public boolean isSelected1() {
        return isSelected(0);
    }
    public boolean isSelected2() {
        return isSelected(1);
    }
    public boolean isSelected3() {
        return isSelected(2);
    }
}
