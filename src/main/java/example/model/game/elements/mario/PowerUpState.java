package example.model.game.elements.mario;

public class PowerUpState implements MarioState {

    public boolean isPoweredUp = true;

    private static PowerUpState instance = new PowerUpState();

    private PowerUpState() { }

    public static PowerUpState getInstance() {
        return instance;
    }
    @Override
    public void gotMushroom(Mario mario) {
    }

    @Override
    public void gotEnemy(Mario mario) {
        mario.setState(PowerDownState.getInstance());
        mario.setExtraLife(false);
    }
}
