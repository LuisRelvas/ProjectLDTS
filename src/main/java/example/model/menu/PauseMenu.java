package example.model.menu;

import example.State.GameState;
import example.State.State;

import java.util.Arrays;

public class PauseMenu extends Menu{

    private State gameState;
    public PauseMenu(State gameState) {
        super(Arrays.asList("Continue","Exit"));
        this.gameState = gameState;
    }

    public boolean isSelectedContinue() {
        return isSelected(0);
    }
    public boolean isSelectedExit() {
        return isSelected(1);
    }

    public State getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
