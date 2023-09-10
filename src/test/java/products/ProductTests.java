package products;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RestUtils;

import java.util.HashMap;
import java.util.Map;

public class ProductTests {

    @Test
    public void addProduct() {

        String endPoint = "https://fakestoreapi.com/products";
        //String payload = Payloads.getCreateProductPayloadFromString("test product", "13.8", "This is a test product", "https: //i.pravatar.cc", "electronic");
        Map<String, Object> payload = Payloads.getCreateProductPayloadFromMap("test product", "13.8", "This is a test product", "https: //i.pravatar.cc", "electronic");
        Response response = RestUtils.performPost(endPoint, payload, new HashMap<>());
        Assert.assertEquals(response.statusCode(), 200);
    }
}