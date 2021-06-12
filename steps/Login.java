package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public ChromeDriver driver;
	
	@Given("Open the Chrome browser")
	public void openBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Given("Load the Application url as {string}")
	public void loadUrl(String url) {
		driver.get(url);
	}
	@Given("Enter the user name as {string}")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter the Password as {string}")
	public void entePassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click on Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home page should be displayed")
	
	public void verifyLogonPage() {
		System.out.println("This is Home page");
		//System.out.println("This is not Home page");
		
		driver.close();
	}
	@But("Home page is not displayed")
	public void verifyLogonPage1() {
		System.out.println("This is not Home page");
		driver.close();
	}
}
