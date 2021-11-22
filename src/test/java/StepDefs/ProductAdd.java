package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductAdd {
	
	WebDriver driver = BaseClass.driver;
	
		@And("^User should be clicks on \"([^\"]*)\"$")
	    public void user_should_be_clicks_on_something(String Product_Name) throws Throwable {
	        
	    WebElement add_product = driver.findElement(By.xpath("//div[text()='"+ Product_Name +"']/following::button"));
	    add_product.click();
		}

	    @Then("^Product should be added to cart$")
	    public void product_should_be_added_to_cart() throws Throwable {
	    	WebElement To_check = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
	    	
			Assert.assertEquals("1", To_check.getText());
	        
	    }
	    @Then("^validate that product product is added in cart\"([^\"]*)\"$")
	    public void validate_that_product_product_is_added_in_cart(String Product_Id) throws Throwable 
	  {
		 	WebElement cart_verify = driver.findElement(By.xpath("//*[@class='shopping_cart_badge']"));
		 	Assert.assertEquals(Product_Id, cart_verify.getText());
			
	    }

	  

	    

}