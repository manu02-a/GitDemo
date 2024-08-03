package Java_streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting_items_in_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the header of the column to get sorted rows
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//grab all the row webelement in a list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		//grab the text of each row and store in the original list
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort the original list and store in the new sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare the 2 list 
		Assert.assertTrue(sortedList.equals(originalList));
		
		
		//getting price of the particular product from table
		List<String> price;
		do
		{
			
			List<WebElement> elementList1 = driver.findElements(By.xpath("//tr/td[1]"));
			price = elementList1.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeg(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
		
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		

	
	}

	private static String getPriceVeg(WebElement s) {
		// TODO Auto-generated method stub
		String p = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return p ;
	}

}
