package example.model.game.elements.mario;

public class PowerDownState implements MarioState {

    private static PowerDownState instance = new PowerDownState();

    private PowerDownState() { }

    public static PowerDownState getInstance() {
        return instance;
    }


    @Override
    public void gotMushroom(Mario mario) {
        mario.setState(PowerUpState.getInstance());
        mario.setExtraLife(true);
    }

    @Override
    public void gotEnemy(Mario mario) {
        mario.setDead(true);
    }
}
