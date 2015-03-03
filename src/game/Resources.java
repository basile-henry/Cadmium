package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.SpriteSheet;

import java.util.HashMap;
import java.util.Map;

public class Resources {

    private static Map<String, Image> images;
    private static Map<String, SpriteSheet> sprites;
    private static Map<String, Sound> sounds;

    public Resources() {

        images = new HashMap<String, Image>();
        sprites = new HashMap<String, SpriteSheet>();
        sounds = new HashMap<String, Sound>();

        try {
            sprites.put("tiles_spritesheet", loadSprite("res/images/platformer/tiles_spritesheet.png", 70,70, 2));
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    private Image loadImage(String path) throws SlickException {
        return new Image(path, false, Image.FILTER_NEAREST);
    }

    private SpriteSheet loadSprite(String path, int tileWidth, int tileHeight, int spacing) throws SlickException {
        return new SpriteSheet(loadImage(path), tileWidth, tileHeight, spacing);
    }

    public static Image getImage(String getter) {
        return images.get(getter);
    }

    public static Image getSpriteImage(String getter, int x, int y) {
        return sprites.get(getter).getSubImage(x, y);
    }

    public static Image getSprite(String getter, int x, int y) {
        return sprites.get(getter);
    }

    public static Sound getSound(String getter) {
        return sounds.get(getter);
    }

}
