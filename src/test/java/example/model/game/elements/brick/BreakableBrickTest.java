package example.model.game.elements.brick;

import example.GUI.GUI;
import example.model.Position;
import example.model.game.elements.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class BreakableBrickTest {
    @Mock
    Position position;

    Position screenPosition;

    BreakableBrick breakableBrick;


    @BeforeEach
    void setUp() {
        breakableBrick = new BreakableBrick(10,10);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testOnHit() {
        Element result = breakableBrick.onHit();
        Assertions.assertEquals(null, result);
    }
}
