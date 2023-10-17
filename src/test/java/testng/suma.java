package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.rmi.activation.ActivationInstantiator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.frameBase.FrameWork;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.pojo.cartpojo;
import org.pojo.newcart;
import org.pojo.pojologin;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class suma extends FrameWork {
	
     @Parameters("bro")
	@Test(priority=-67)
	private void aa1( String bro) {
		if (bro.startsWith("chro")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (bro.startsWith("fire")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		urlLaunch("https://www.tourradar.com/");
	}
	@Test
	private void bb2() {
		
		pojologin l = new pojologin();
		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		a.moveToElement(l.getAcct());
		js.executeScript("arguments[0].click()",l.getLog());
		sendvalue(l.getMail(), "vimalraj720@gmail.com");
		sendvalue(l.getPas(), "vimalrj6");
		buttonclick(l.getLogbutton());
}
	@Test(enabled=false)
	private void cc3() throws InterruptedException {
	cartpojo c = new cartpojo();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	try {
		Robot r = new Robot();
	} catch (AWTException e) {
		
		e.printStackTrace();
	}
	await();
	//WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement a = driver.findElement(By.id("ao-clp-clean-search__where-input"));
	a.sendKeys("canada");
    //js.executeScript("arguments[0].setAttribute('value','usa')",a);
	//sendvalue(c.getWhere(), "usa");
	//r.keyPress(KeyEvent.VK_ENTER);
	//r.keyRelease(KeyEvent.VK_ENTER);

	js.executeScript("arguments[0].click()",c.getWhen());
	js.executeScript("arguments[0].click()",c.getYear());
	js.executeScript("arguments[0].click()",c.getMonth());
	Thread.sleep(9000);
	js.executeScript("arguments[0].click()",c.getAd());
	Thread.sleep(9000);
	js.executeScript("arguments[0].click()",c.getPri());
	Thread.sleep(9000);
	js.executeScript("arguments[0].click()",c.getSearch());
	
}
	@Test
	private void dd4() {
		await();
		newcart a = new newcart();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions l = new Actions(driver);
		//js.executeScript("arguments[0].click()",a.getTour());
		buttonclick(a.getTour());
		js.executeScript("arguments[0].click()",a.getPhili());
		js.executeScript("arguments[0].click()",a.getCheck());
		js.executeScript("arguments[0].click()",a.getDate());
		js.executeScript("arguments[0].click()",a.getConf());
		Set<String> b = driver.getWindowHandles();
		List<String> c =new ArrayList<String>();
		c.addAll(b);
		String d = c.get(1);
		driver.switchTo().window(d);
		System.out.println("ok");
		l.click(a.getAdded());
		//js.executeScript("arguments[0].click()",a.getAdded());
		buttonclick(a.getAdded());
		//js.executeScript("arguments[0].click()",a.getTwo());
		aindexSelect(a.getTwo(),1);
		js.executeScript("arguments[0].setAttribute('value','vimal')",a.getName());
		js.executeScript("arguments[0].setAttribute('value','raj')",a.getLastna());
		js.executeScript("arguments[0].setAttribute('value','987456321')",a.getPhn());
        aindexSelect(a.getDat(), 5);
        aindexSelect(a.getMo(), 1);
        aindexSelect(a.getYr(), 23);
        aindexSelect(a.getCoun(), 1);

	
	}
	
	
	
}
