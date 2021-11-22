package StepDefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefs {
	
	WebDriver driver = BaseClass.driver;
;	
	 @Given("^User has lunched website$")
	    public void user_has_lunched_website() throws Throwable {
		 
		 	driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	        
	    }

	    @When("^User Enter correct username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enter_correct_username_something_and_password_something(String UsernameVal, String PasswordVal) throws Throwable {
	    	WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
			Username.sendKeys(UsernameVal);
			
			WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
			Password.sendKeys(PasswordVal);
	    }

	    @Then("^User should be navigated to the product page \"([^\"]*)\"$")
	    public void user_should_be_navigated_to_the_product_page_something(String product) throws Throwable {
	    	WebElement HomePage = driver.findElement(By.xpath("//*[@class=\"title\"]"));
	    	String Actualmsg = HomePage.getText();
	    	Assert.assertEquals(product, Actualmsg);
	    }

	    @Then("^User should be getting the \"([^\"]*)\"$")
	    public void user_should_be_getting_the_something(String error) throws Throwable {
	     
	    	WebElement Error = driver.findElement(By.xpath("//*[@data-test='error']"));
			
			String Actualmsg = Error.getText();
			
			Assert.assertEquals(error, Actualmsg);
	    }

	    @And("^User clicks on login Button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	WebElement LoginButton = driver.findElement(By.xpath("//input[@name='login-button']"));
			LoginButton.click();
	        
	    }


}