package Latest_selenium_locators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Invoking_multiple_browser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//opening new window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String childId = it.next();
		
		//driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String name1 = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(name1);
		
		driver.switchTo().window(ParentId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(name1);
		
		// taking partial screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		Files.copy(file,new File("C:\\Users\\manus\\Downloads\\Selenium_screenshot\\name_a_jgp"));
		
		//getting height and width of the webelement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		//driver.quit();

	}

}
