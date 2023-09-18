package example.model.game.elements.brick;

import example.model.Position;
import example.model.game.elements.PowerUp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class PowerUpBrickTest {
    @Mock
    Position position;
    Position screenPosition;
    PowerUpBrick powerUpBrick;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testOnHit() {
        screenPosition = new Position(0,0);
        when(position.getX()).thenReturn(0);
        when(position.getY()).thenReturn(0);
        when(screenPosition.getX()).thenReturn(0);
        when(screenPosition.getY()).thenReturn(0);

        PowerUp result = powerUpBrick.onHit();
        Assertions.assertEquals(new PowerUp(0, 0), result);
    }
}

