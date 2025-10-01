package coding_test.javatest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonCreator {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();

        jsonObject.addProperty("username", "guest");
        jsonObject.addProperty("isMember", true);
        jsonObject.addProperty("visitCount", 15);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonData = gson.toJson(jsonObject);
        System.out.println(jsonData);
    }
}
