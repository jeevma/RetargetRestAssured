package products;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTests {

    @Test
    public void addProduct(){
       Response response =  RestAssured.given().log().all()
                .baseUri("https://fakestoreapi.com/products")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"title\": \"test product\",\n" +
                        "    \"price\": 13.5,\n" +
                        "    \"description\": \"lorem ipsum set\",\n" +
                        "    \"image\": \"https: //i.pravatar.cc\",\n" +
                        "    \"category\": \"electronic\"\n" +
                        "}")
                .post()
                        .then().log().all().extract().response();

        Assert.assertEquals(response.statusCode(), 200);

    }
}
