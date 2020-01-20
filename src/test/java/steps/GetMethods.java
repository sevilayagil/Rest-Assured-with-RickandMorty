package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetMethods {
   public static void SimpleGetMethod(String ch){
       given().contentType(ContentType.JSON).
       when()
               .get(String.format("https://rickandmortyapi.com/api/character/%s",ch)).

       then()
               .body("name",is("Morty Smith")).statusCode(200);
    }
    public static void PerformQueryParam(){
        given()
               .contentType(ContentType.JSON)
               .queryParam("name","rick")
                .queryParam("status","alive");
        when()
              .get("https://rickandmortyapi.com/api/character/").
        then()
                .statusCode(200)
                .body("results[0].gender",equalTo("Male"))
                .body("results[0].species",equalTo("Human"))
                .body("results[0].id",equalTo(1));

    }

}
