import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*System.setProperty("WebDriver.chrome.driver","/Users\\manus\\Downloads\\Exe_files/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		// Firefox launch
		//System.setProperty("WebDriver.gecko.driver","/Users\\manus\\Downloads\\Exe_files/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// Microsoft edge launch
		System.setProperty("WebDriver.edge.driver","C:\\Users\\manus\\Downloads\\Exe_files\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
