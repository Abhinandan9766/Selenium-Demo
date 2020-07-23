package AItest;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IAtest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\Abhinandan\\E drive\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		Thread.sleep(2000);
		WebDriver driver = new FirefoxDriver();
		// driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		driver.get("https://www.spicejet.com/?gclid=EAIaIQobChMIvdL5lvD-4QIV2CMrCh3EQglZEAAYASAAEgKcHPD_BwE");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.findElement(By.xpath("//input[@id='register_form:profile:fileDisclaimer_input']")).click();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("MENU"))).build().perform();
		

		Thread.sleep(2000);
		driver.findElement(ByLinkText.linkText("Tariffs")).click();
		Thread.sleep(2000);
		// action.moveToElement(driver.findElement(By.linkText("CarriageOfLiveAnimals"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("")).getSize();
		// ADD EXTERNAL FILE
		// driver.findElement(By.xpath("//input[@id='register_form:profile:proofOfID:uploadFile_input']")).sendKeys("C:\\Users\\abhinandan.patil\\Desktop\\ABC.png");
		// driver.findElement(By.id("register_form:profile:j_idt117")).click();

		// driver.quit();
	}

}
