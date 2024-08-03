import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Addingitemtokart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.chrome.driver", "C:\\Users\\manus\\Downloads\\Exe_files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		// declaring array of products to be added to kart
		String[] arrayProducts = {"Cucumber","Beetroot","Tomato"};
		// calling the getproduct method
		getproducts(driver,arrayProducts);
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Applying explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		// applying Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}
	public static void getproducts(WebDriver driver, String[] arrayProducts ) {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// storing all the products in an array list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List productList = Arrays.asList(arrayProducts);
		
		// intializing the increament
		int j=0;

		// looping through the array list to fins the product
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String productName = name[0].trim();
			// converting array to arrayList
			

			if (productList.contains(productName)) {
				
				j++;
				// increasing the number of same item
				if(productName.equalsIgnoreCase("Cucumber")) {
					for(int k=1; k<=3; k++) {
						driver.findElements(By.cssSelector(".increment")).get(i).click();
					}
				}
				//driver.findElements(By.cssSelector(".increment")).get(i).click();
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				
				if(j==arrayProducts.length) {
					break;
				}

			}

		}
	}

}
