import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		// radio button
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		
		// static dropdown
		WebElement options = driver.findElement(By.cssSelector("select[class='form-control']"));
		//driver.findElement(By.xpath("//select[@class='form-control']")).click();
		Select option = new Select(options);
		option.selectByVisibleText("Consultant");
		System.out.println(option.getFirstSelectedOption().getText());
		// check box
		driver.findElement(By.id("terms")).click();
		// sign in
		driver.findElement(By.id("signInBtn")).click();
	
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		// list of products
		List<WebElement> items = driver.findElements(By.cssSelector(".btn.btn-info"));
		// looping through list
		for(int i=0; i<items.size(); i++ ) {
			items.get(i).click();
		}
		//checkout
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		

	}

}
