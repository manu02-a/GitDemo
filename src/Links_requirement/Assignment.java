package Links_requirement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver","C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// selecting the check box
		driver.findElement(By.id("checkBoxOption2")).click();
		// printing the name of the check box
		String optionName = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(optionName);
		
		// selecting from static drop-down
		WebElement options = driver.findElement(By.id("dropdown-class-example"));
		
		//Declaring select 
		Select option = new Select(options);
		
		option.selectByVisibleText(optionName);
		System.out.println(option.getFirstSelectedOption().getText());
		
		// typing the name to switch alert
		driver.findElement(By.id("name")).sendKeys(optionName);
		
		// clicking on alert button
		driver.findElement(By.id("alertbtn")).click();
		
		//grabbing the text in alert
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		//checking the option_name present in the alert text
		if(alertText.contains(optionName)) {
			System.out.println("Alert message success");
		}
		else {
			System.out.println("Alert message failed");
		}
		
		driver.switchTo().alert().accept();

	}

}
