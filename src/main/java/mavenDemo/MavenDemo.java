package mavenDemo;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenDemo {
	public String getTitleDemo() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		
		String actualTitle = driver.getTitle();

//		if (expectedTitle.equals(actualTitle)) {
//			System.out.println("You are on the correct page");
//			driver.findElement(By.id("Email")).sendKeys("anupa2@gmail.com");
//			driver.findElement(By.name("Password")).sendKeys("123456");
//			driver.findElement(By.xpath("//input[@value='Log in']")).click();
//			driver.findElement(By.linkText("Log out")).click();
//			driver.close();
//		} else {
//			System.out.println("You are on the incorrect page");
//			driver.close();
//		}
		return actualTitle;
	}
}
