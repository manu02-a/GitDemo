package Miscellaneous_topics_in_web_browser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert a = new SoftAssert();
		
		//storing all links in list
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		//looping through list
		for(WebElement link:links) {
			
			String url = link.getAttribute("href");
			//connecting to that url by java method
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			//conn.setRequestMethod("Head");
			conn.connect();
			int responseCode = conn.getResponseCode();
			System.out.println(responseCode);
			//if(responseCode>400) {
				//System.out.println("The bloken link is "+link.getText());
				//Assert.assertTrue(false);
		//}
			
			a.assertTrue(responseCode>400, "The bloken link is "+link.getText());
			
			
		}
		a.assertAll();	
		
		/*//finding the broken link in page
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		//connecting to that url by java method
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		//conn.setRequestMethod("Head");
		conn.connect();
		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);*/
		
		

	}

}
