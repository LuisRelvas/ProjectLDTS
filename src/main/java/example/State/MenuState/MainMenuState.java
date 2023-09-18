package example.State.MenuState;

import example.State.State;
import example.Viewer.MenuViewer.MenuViewer;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.controller.menu.MenuController;
import example.model.menu.MainMenu;

public class MainMenuState extends State<MainMenu> {
    public MainMenuState(MainMenu model) {
        super(model);
    }

    @Override
    protected Viewer<MainMenu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<MainMenu> getController() {
        return new MenuController(getModel());
    }
}