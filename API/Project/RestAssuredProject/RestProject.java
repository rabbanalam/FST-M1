package RestAssuredProject;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class RestProject {

    String base_URI = "https://api.github.com";
    RequestSpecification requestSpec;
    String SSHkey;
    int KeyID;
    ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp() {

        requestSpec = new RequestSpecBuilder().setContentType(ContentType.JSON).
                addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com")
                .build();
    }
    @Test(priority = 1)
    public void postRequest(){
        String reqBody = "{\"title\": \"TestAPIKey\",\n" +
                "    \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIPzxNcVgnY5FU5sAeQTufsQ+e+ZTnJHoGHRI1A9YbA9s gmx\\\\0012j2744@IBM-PF1SSD9E\"}";
        Response response = given().spec(requestSpec).body(reqBody).when().post("/user/keys");
        System.out.println(response.asPrettyString());
        KeyID = response.then().extract().path("id");
        response.then().statusCode(201);
    }
    @Test(priority = 2)
    public void getRequest(){
        Response response = given().spec(requestSpec).pathParam("KeyID", KeyID)
                .when().get("/user/keys/{KeyID}");
        System.out.println(response.getBody().asPrettyString());
        response.then().statusCode(200);
    }
    @Test(priority = 3)
    public void deleteRequest(){
        Response response = given().spec(requestSpec).pathParam("KeyID", KeyID).when().delete("/user/keys/{KeyID}");
        System.out.println(response.getBody().asPrettyString());
        response.then().statusCode(204);
    }

}
