package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;
import states.*;

import java.io.File;

public class Application extends StateBasedGame {

    public Application() {
        super("Cadmium");
    }

    public static void main(String[] args) {

        // Set natives folder
        System.setProperty("java.library.path", "libs");
        System.setProperty("org.lwjgl.librarypath", new File("libs/natives").getAbsolutePath());

        try {
            AppGameContainer game = new AppGameContainer(new Application());
            game.setDisplayMode(Window.WIDTH, Window.HEIGHT, false);
            game.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer gameContainer) throws SlickException {
        gameContainer.setTargetFrameRate(60);
        gameContainer.setVSync(true);
        gameContainer.setAlwaysRender(true);
        gameContainer.setMaximumLogicUpdateInterval(60);
        gameContainer.setShowFPS(false);

        new Resources();

        this.addState(new GameState());
        this.addState(new MenuState());
    }
}
