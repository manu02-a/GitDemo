package Scrolling_inWeb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,580)");
		
		// getting number of rows in table
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		
		// getting number of columns in table
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size());
		
		List<WebElement> row_2 = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		
		for(int i=0; i<row_2.size(); i++) {
			
			System.out.println(row_2.get(i).getText());
			
		}

	}

}
