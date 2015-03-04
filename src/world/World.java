package world;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.newdawn.slick.Image;

import java.io.FileReader;
import java.util.Objects;

public class World {

    public static Image[][] solids;
    public static int WIDTH;
    public static int HEIGHT;

    public static void load(String path) throws Exception {

        JSONParser parser = new JSONParser();
        Object object = parser.parse(new FileReader(path));
        JSONObject jsonObject = (JSONObject) object;

        JSONArray layers = (JSONArray) jsonObject.get("layers");

        for (int i = 0; i < layers.size(); i++) {

            JSONObject layer = (JSONObject) layers.get(i);
            String name = (String) layer.get("name");

            if (name.equals("solid")) {

            }
        }
    }
}
