import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option: options) {
			
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

	}

}
