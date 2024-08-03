package Miscellaneous_topics_in_web_browser;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class mic_topic_2_maximise_cookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();
		// To delete all cookies
		driver.manage().deleteAllCookies();
		// to delete specific cookies
		//driver.manage().deleteCookieNamed("dsfc");
			// click on any thing
			// verify the login url
		driver.get("https://www.google.com/");
		
		// To take screenshot
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\manus\\Downloads\\Selenium_screenshot\\google_screnshot.jpg"));
		
		

	}

}
