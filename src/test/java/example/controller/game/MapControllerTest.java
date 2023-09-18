package example.controller.game;

import example.GUI.LanternaGUI;
import example.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

class MapControllerTest {


    MarioController marioController;

    EnemyController enemyController;

    CameraController cameraController;

    MapController mapController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }}
