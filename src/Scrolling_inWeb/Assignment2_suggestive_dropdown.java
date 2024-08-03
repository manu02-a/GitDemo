package Scrolling_inWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_suggestive_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// entering value in suggestive drop-down
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		
		//list of options
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		
		//String city = "India";
		//looping through the list
		for(int i=0; i<options.size(); i++) {
			
			if(options.get(i).getText().equalsIgnoreCase("United Kingdom (UK)")) {
				
				options.get(i).click();
				break;
			}
			
		}
		

	}

}
