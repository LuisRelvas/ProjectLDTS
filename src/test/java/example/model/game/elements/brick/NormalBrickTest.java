package example.model.game.elements.brick;

import example.model.Position;
import example.model.game.elements.Element;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class NormalBrickTest {
    @Mock
    Position position;

    Position screenPosition;
    NormalBrick normalBrick;

    @BeforeEach
    void setUp() {
        normalBrick = new NormalBrick(10,10);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testOnHit() {
        Element result = normalBrick.onHit();
        Assertions.assertEquals(null, result);
    }
}

