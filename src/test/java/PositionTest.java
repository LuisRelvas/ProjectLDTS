import example.model.Position;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.beans.BeanProperty;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

public class PositionTest {
    private Position position;

    @Property
    void getLeft(@ForAll int x, @ForAll int y) {
        assertEquals(x-1,new Position(x,y).getLeft().getX());
        assertEquals(y, new Position(x,y).getLeft().getY());
    }
    @Property
    void getRight(@ForAll int x, @ForAll int y) {
        assertEquals(x + 1, new Position(x, y).getRight().getX());
        assertEquals(y, new Position(x, y).getRight().getY());
    }

    @Property
    void getUp(@ForAll int x, @ForAll int y) {
        assertEquals(x, new Position(x, y).getUp().getX());
        assertEquals(y - 1, new Position(x, y).getUp().getY());
    }

    @Property
    void getDown(@ForAll int x, @ForAll int y) {
        assertEquals(x, new Position(x, y).getDown().getX());
        assertEquals(y + 1, new Position(x, y).getDown().getY());
    }

    @Property
    void getJump(@ForAll int x, @ForAll int y) {
        assertEquals(x, new Position(x,y).jump().getX());
        assertEquals(y-4,new Position(x,y).jump().getY());
    }


}




