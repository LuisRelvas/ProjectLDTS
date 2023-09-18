package example.State.MenuState;

import example.State.State;
import example.Viewer.MenuViewer.SelectMenuViewer;
import example.Viewer.Viewer;
import example.controller.Controller;
import example.controller.menu.SelectLevelMenuController;
import example.model.menu.SelectLevelMenu;

public class SelectLevelMenuState extends State<SelectLevelMenu> {
    public SelectLevelMenuState(SelectLevelMenu model) {
        super(model);
    }

    @Override
    protected Viewer<SelectLevelMenu> getViewer() {
        return new SelectMenuViewer(getModel());
    }

    @Override
    protected Controller<SelectLevelMenu> getController() {
        return new SelectLevelMenuController(getModel());
    }
}
