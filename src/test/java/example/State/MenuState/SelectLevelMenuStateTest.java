package example.State.MenuState;

import example.Viewer.Viewer;
import example.controller.Controller;
import example.model.menu.SelectLevelMenu;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.openMocks;

class SelectLevelMenuStateTest {

    @Mock
    private SelectLevelMenu mockModel;

    private SelectLevelMenuState selectLevelMenuStateUnderTest;

    private AutoCloseable mockitoCloseable;

    @BeforeEach
    void setUp() {
        mockitoCloseable = openMocks(this);
        selectLevelMenuStateUnderTest = new SelectLevelMenuState(mockModel);
    }

    @AfterEach
    void tearDown() throws Exception {
        mockitoCloseable.close();
    }

    @Test
    void testGetViewer() {

        final Viewer<SelectLevelMenu> result = selectLevelMenuStateUnderTest.getViewer();
    }

    @Test
    void testGetController() {
        final Controller<SelectLevelMenu> result = selectLevelMenuStateUnderTest.getController();

    }
}
