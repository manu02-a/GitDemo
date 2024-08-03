package Scrolling_inWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_solution_using_driverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,580)");
		
		//limiting scope of driver
		WebElement table = driver.findElement(By.id("product"));
		
		// number of rows
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		// number of column
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> rows2 = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	
		
		for(int i=0; i<rows2.size(); i++) {
			
			System.out.println(rows2.get(i).getText());
			
		}
		
	}

}
