package Calender_UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Handling_calender_UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// input values
		String date = "1";
		String month = "9";
		String year = "2030";
		
		String[] given = {month,date,year};
		
		// clicking on calendar
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
		// clicking on year
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		// repeat
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		// selecting year
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		// selecting month
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(month)-1).click();
		// selecting date
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		// adding dates in list
		List<WebElement> actual = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		// looping
		for(int i=0; i<actual.size(); i++) {
			
			System.out.println(actual.get(i).getAttribute("value"));
			//Assert.assertEquals(actual.get(i).getAttribute("value"), given[i]);
			Assert.assertEquals(actual.get(i).getAttribute("value"), given[i]);
			
		}
		
		driver.close();
		


	}

}
