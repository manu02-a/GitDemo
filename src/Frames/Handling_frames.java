package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		// to get total number of the frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		// by index of frame
		//driver.switchTo().frame(0);
		// by webdriver
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement sourse = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(sourse,target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();

	}

}
