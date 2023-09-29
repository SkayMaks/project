import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import java.util.List;

import static io.restassured.RestAssured.given;

public class RestApi {
    private final static String URL = "https://petstore.swagger.io/v2";
    private final static String app = "application/json";
    UserData user = new UserData(432, "Testik20023", "Test", "Testovich","test@mail.ru", "123456!", "898889998800",7);

    @Test
    public void getUser(){
    given()
    .when()
            .contentType(ContentType.JSON)
            .get(URL + "/user/Maks")
    .then()
            .log().all()
            .statusCode(200)
            .body("id",Matchers.equalTo(121));

    }
    @Test
    public void postUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .accept(app)
                .body(user)
                .post(URL+"/user")
        .then()
                .log().all()
                .statusCode(200);
        Helper help = new Helper();
        help.delUsHelp(user.getUsername(),URL);
    }
    @Test
    public void putUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .accept(app)
                .body(user)
                .put(URL+"/user/Test2023")
        .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void deleteUser(){
        Helper help = new Helper();
        String username = help.adUsHelp(app,URL);
        given()
        .when()
                .contentType(ContentType.JSON)
                .delete(URL+"/user/"+username)
        .then()
                .log().all()
                .statusCode(200);
    }


}
