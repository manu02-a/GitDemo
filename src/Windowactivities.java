import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
