package example.model.game.elements.brick;

import example.model.Position;
import example.model.game.elements.Coin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class CoinBrickTest {
    @Mock
    Position position;

    Position screenPosition;

    CoinBrick coinBrick;

    @BeforeEach
    void setUp() {
        screenPosition = new Position(10,10);
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testOnHit() {
        when(position.getX()).thenReturn(0);
        when(position.getY()).thenReturn(0);
        when(screenPosition.getX()).thenReturn(0);
        when(screenPosition.getY()).thenReturn(0);

        Coin result = coinBrick.onHit();
        Assertions.assertEquals(new Coin(0, 0), result);
    }
}

