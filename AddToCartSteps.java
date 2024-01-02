package ecommerse.cucumber.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
	private WebDriver driver;
	
	
@Given("User is on the Add to Cart Page")
public void user_is_on_the_add_to_cart_page() {
    System.setProperty("webdriver.chrome.driver", "/home/phapalsnehagmai/Downloads/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:80/ecomm/add-to-cart");    
}

@When("User click on the Add to Cart button")
public void user_click_on_the_add_to_cart_button() {
    driver.findElement(By.id("add-to-cart-button")).click();
}

@And("User click on the Checkout button")
public void user_click_on_the_checkout_button() {
   driver.findElement(By.id("checkout-button")).click();
}

@And("User add billing details")
public void user_add_billing_details() {
  
}

@And("User click on the Place Order button")
public void user_click_on_the_place_order_button() {
    driver.findElement(By.id("place-order-button")).click();
}

@Then("Order should be placed successfully")
public void order_should_be_placed_successfully() {
    
	
	
	driver.quit();
}

}
