package ua.WebDriver;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class DataProviderTestsTwo {

    @Test
    public void testEmojiAPI() {
        RestAssured.baseURI = "https://api.github.com";

        given()
                .when()
                .get("/emojis")
                .then()
                .assertThat()
                .body(containsString("articulated_lorry"))
                .statusCode(200);
    }
}
