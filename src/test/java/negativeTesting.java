import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class negativeTesting {
    private final static String URL = "https://petstore.swagger.io/v2";
    private final static String app = "application/json";
    UserData user = new UserData(122, "Test2023", "Test", "Testovich","test@mail.ru", "123456!", "898889998800",7);

    @Test
    public void getUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .get(URL + "/user/Maks43")
        .then()
                .log().all()
                .statusCode(404);
    }
    @Test
    public void postUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .accept(app)
                .body(user)
                .post(URL+"/user/ewq")
        .then()
                .log().all()
                .statusCode(405);
    }
    @Test
    public void putUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .accept(app)
                .body(user)
                .put(URL+"/user/Test2023/1")
        .then()
                .log().all()
                .statusCode(404);
    }
    @Test
    public void deleteUser(){
        given()
        .when()
                .contentType(ContentType.JSON)
                .delete(URL+1)
        .then()
                .log().all()
                .statusCode(404);
    }
}
