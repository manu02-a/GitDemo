import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// clicking on name and entering the value
		driver.findElement(By.name("name")).sendKeys("Manu");
		// clicking on email end sending email
		driver.findElement(By.name("email")).sendKeys("Manu@gmail.com");
		// clicking on password
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Manu@123");
		// clicking on check box
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		
		// select drop down
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select option = new Select(dropdown);
		option.selectByIndex(0);
		System.out.println(option.getFirstSelectedOption());
		
		// clicking on radio buton
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		// date
		driver.findElement(By.name("bday")).sendKeys("01-10-2020");
		
		//submit
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		Thread.sleep(2000);
		
		// capturing message
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
	}

}
