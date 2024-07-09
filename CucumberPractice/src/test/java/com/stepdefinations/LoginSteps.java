package com.stepdefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	   WebDriverManager.chromedriver().setup();
	   System.out.println("step 1 user is on orange hrm website");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() { 
	  System.out.println("step 2 user is entering username and password"); 
	  driver.findElement(By.name("username")).sendKeys("Admin");

	  driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("step 3 login");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("user lands on dashboard")
	public void user_lands_on_dashboard() {
		System.out.println("step 4 dashboard");
		driver.close();
	}
	
	
}
