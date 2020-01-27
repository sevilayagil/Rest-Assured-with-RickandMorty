package steps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;

import javax.xml.ws.Response;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetMethods {
   public static void GetMethodCharacter(String ch){
       given().contentType(ContentType.JSON).
       when()
               .get(String.format("https://rickandmortyapi.com/api/character/%s",ch)).

       then()
               .body("name",is("Morty Smith")).statusCode(200);
    }
    public static void CharacterQueryParam(){
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
    public static void Episode(){
        List<String> names = RestAssured.when().get(String.format("https://rickandmortyapi.com/api/episode/"))
                .then().extract().jsonPath()
                .getList("results.name");
                 Assert.assertTrue(names.contains("Get Schwifty"));
                 System.out.println(names.size());
                 System.out.println(names);
        List<String> episodes = RestAssured.when().get(String.format("https://rickandmortyapi.com/api/episode/"))
                .then().extract().jsonPath()
                .getList("results.episode");
                 Assert.assertTrue(episodes.contains("S02E05"));
                 System.out.println(episodes.size());
                 System.out.println(episodes);
    }
    public static void Location(){
        when()
                .get(String.format("https://rickandmortyapi.com/api/location/3"))
                .then()
                .body("type", Matchers.not("Space")).statusCode(200);
    }
}
