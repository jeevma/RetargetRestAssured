package products;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String getCreateProductPayloadFromString(String title, String price, String description, String img, String category ){
        String payload =  "{\n" +
                "    \"title\": \""+title+"\",\n" +
                "    \"price\": "+price+",\n" +
                "    \"description\": \""+description+"\",\n" +
                "    \"image\": \""+img+"\",\n" +
                "    \"category\": \""+category+"\"\n" +
                "}";
        return payload;
    }

    public static Map<String, Object> getCreateProductPayloadFromMap(String title, String price, String description, String img, String category ){
        Map<String, Object> payload = new HashMap<>();
        payload.put("title", title);
        payload.put("price", price);
        payload.put("description", description);
        payload.put("image", img);
        payload.put("category", category);
        return payload;
    }
}
