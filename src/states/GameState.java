package states;

import game.Resources;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
    @Override
    public int getID() {
        return States.GAME;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
                Resources.getSpriteImage("tiles_spritesheet", i, j).draw(70*i, 70*j);
        }
        graphics.drawString("This is my game state!", 50, 50);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {
        if (gameContainer.getInput().isKeyPressed(Input.KEY_ENTER)) stateBasedGame.enterState(States.MENU);
    }
}
