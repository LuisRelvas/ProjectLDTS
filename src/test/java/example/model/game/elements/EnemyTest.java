package example.model.game.elements;

import org.junit.jupiter.api.BeforeEach;

class EnemyTest {

    private Enemy enemyUnderTest;

    @BeforeEach
    void setUp() {
        enemyUnderTest = new Enemy(0, 0);
    }
}
