package Newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https:demo.opencart.com/index.php?route=account/login");
driver.manage().window().maximize();

WebElement username;
username = driver.findElement(By.id("input-email"));
username.sendKeys("sibtainsyed94@gmail.com");

WebElement Password;
Password = driver.findElement(By.id("input-password"));
Password.sendKeys("12345678");
WebElement loginButton;
loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
loginButton.click();

//String actualpagetitle = driver.getTitle();
//String expectedTitle = "My Account";
//
//if (actualpagetitle.contentEquals(expectedTitle)){
//    System.out.println("Test Passed!");
//} else {
//    System.out.println("Test Failed");
//}

//driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP+LP3065");

WebElement Search;
Search = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
Search.sendKeys("HP LP3065");

WebElement Search2;
Search2 = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
Search2.click();

WebElement New;
New = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a"));
New.click();


WebElement AddCart;
AddCart = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
AddCart.click();
//driver.close();


//driver.quit();
	}
	
}
