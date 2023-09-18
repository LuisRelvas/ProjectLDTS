package example.model.game.map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class MapBuilderTest {
    MapBuilder mapBuilder = new LoaderMapBuilder(4);

    MapBuilderTest() throws IOException {
    }

    @Test
    void testCreateArena() {
        Map result = mapBuilder.createArena();
        Assertions.assertEquals(new Map(0, 0), result);
    }
}
