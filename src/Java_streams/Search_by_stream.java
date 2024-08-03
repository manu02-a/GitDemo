package Java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Search_by_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("rice");
		//storing the searched products in list
		List<WebElement> searchedList = driver.findElements(By.xpath("//tr/td[1]"));
		//find the elements are present in searched list
		List<WebElement> neededList = searchedList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(searchedList.size(), neededList.size());

	}

}
