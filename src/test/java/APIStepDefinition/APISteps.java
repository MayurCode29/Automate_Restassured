package APIStepDefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpResponse;
public class APISteps

{
	
	
	public String host="https://reqres.in";
	public String Endpoint="";
	public Response resp;
	
	@Given("endpoint having path {string}")
	public void endpoint_having_path(String path) {
	    Endpoint= host+path;
	}
	@When("user perform get operation")
	public void user_perform_get_operation() {
		  resp=RestAssured.get(Endpoint);
		
	}
	
	@When("user perform delete operation")
	public void user_perform_delete_operation() {
		  resp=RestAssured.delete(Endpoint);
		
	}
    @When("user perform post operation")
	public void user_perform_post_operation() {
		  String json="{\r\n"
		  		+ "    \"name\": \"morpheus\",\r\n"
		  		+ "    \"job\": \"leader\"\r\n"
		  		+ "}";
		  
		 resp= given().header("Content-type","application/json").body(json).when().post(Endpoint);
		  
		  
}
    
    @When("user perform put operation")
	public void user_perform_put_operation() {
		  String json="{\r\n"
		  		+ "    \"name\": \"Mayur\",\r\n"
		  		+ "    \"job\": \"CEO\"\r\n"
		  		+ "}";
		  
		 resp= given().header("Content-type","application/json").body(json).when().put(Endpoint);
		  
		  
}
    

    @When("user perform patch operation")
	public void user_perform_patch_operation() {
		  String json="{\r\n"
		  		+ "    \"name\": \"Mayur\",\r\n"
		  		+ "    \"job\": \"CEO\"\r\n"
		  		+ "}";
		  
		 resp= given().header("Content-type","application/json").body(json).when().patch(Endpoint);
		  
		  
}
   
    
    
    
	@Then("user can validate response status code")
	public void user_can_validate_response_status_code() {
		
		System.out.println(resp.getStatusCode());
	    
	}
	@Then("validate response data")
	public void validate_response_data() {
		System.out.println(resp.asPrettyString());
	    
	}


}
