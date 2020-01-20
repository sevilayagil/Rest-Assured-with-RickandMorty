package steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class GetMethods {
   public static void SimpleGetMethod(String ch){
       given().contentType(ContentType.JSON)
       .when()
               .get(String.format("https://rickandmortyapi.com/api/character/%s",ch))

        .then()
               .body("name",is("Morty Smith")).statusCode(200);
    }
}
