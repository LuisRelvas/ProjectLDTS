package example.State.MenuState;

import example.State.State;
import example.Viewer.Game.GameViewer;
import example.Viewer.MenuViewer.PauseViewer;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.controller.menu.PauseMenuController;
import example.model.menu.PauseMenu;


public class PauseState extends State<PauseMenu> {

    public PauseState(PauseMenu pauseMenu) {
        super(pauseMenu);
    }

    @Override
    protected Viewer<PauseMenu> getViewer() {
        return new PauseViewer(getModel());
    }

    @Override
    protected Controller<PauseMenu> getController() {
        return new PauseMenuController(getModel());
    }
}
