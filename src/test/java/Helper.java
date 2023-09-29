import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Helper {

    @Test
    public void delUsHelp(String user, String URL){
        given()
        .when()
                .contentType(ContentType.JSON)
                .delete(URL+"/user/"+user)
        .then()
                .log().all()
                .statusCode(200);
    }
    public String adUsHelp(String app, String URL){
        UserData user = new UserData(400, "testdel", "Test", "Testovich","test@mail.ru", "123456!", "898889998800",7);
        given()
                .when()
        .contentType(ContentType.JSON)
                .accept(app)
                .body(user)
                .post(URL+"/user")
        .then();
        return (user.getUsername());
    }
}
