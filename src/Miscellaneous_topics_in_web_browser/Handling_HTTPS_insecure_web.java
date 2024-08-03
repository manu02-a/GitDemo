package Miscellaneous_topics_in_web_browser;

import java.io.File;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_HTTPS_insecure_web {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//handling insecure browsers:
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//proxy:
		Proxy prox = new Proxy();
		prox.setHttpProxy("ipaddress.998");
		options.setCapability("Proxy",prox);
		
		// adding extension:
		options.addExtensions(new File("/path/to/extension.crx"));
		
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");

	}

}
