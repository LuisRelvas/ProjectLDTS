package example.model.game.elements;

import org.junit.jupiter.api.BeforeEach;

class CameraTest {

    private Camera cameraUnderTest;

    @BeforeEach
    void setUp() {
        cameraUnderTest = new Camera(0, 0);
    }
}
