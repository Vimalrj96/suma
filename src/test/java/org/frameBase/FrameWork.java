package org.frameBase;

import java.awt.AWTException;
import java.util.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;



import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public  class FrameWork {

 public	static WebDriver driver;
 public static Actions q ;
 public static Robot r;
 public static Alert s;
 public static JavascriptExecutor j;
 public static Select w;
 
 public static void chromebrowser() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver(); 
}
	
public static void maxwin() {
	driver.manage().window().maximize();
}	
public static void getatitle() {
	String title = driver.getTitle();
	System.out.println(title);
}	
public static String getaurl() {
	String url = driver.getCurrentUrl();
	return url;
}	
public static void urlLaunch(String url) {
	driver.get(url);
}
public static void buttonclick(WebElement e) {
	e.click();
}
public static void getatext(WebElement e) {
	String text = e.getText();
System.out.println(text);
}		
public static void getaattribute(WebElement e,String name) {
	String attribute = e.getAttribute(name);
System.out.println(attribute);
}
public static void sendvalue(WebElement e,String S) {
	e.sendKeys(S);
}
public static void movetheelement(WebElement e) {
   q= new Actions(driver);
	q.moveToElement(e).perform();
}
public static void twoclick(WebElement e) {
	q= new Actions(driver);
	q.doubleClick(e).perform();
}
public static void upakey() {
	q= new Actions(driver);
    q.keyUp(Keys.SHIFT).perform();
}
public static void downakey() {
	q= new Actions(driver);
    q.keyDown(Keys.SHIFT).perform();
}
public static void contextaclick(WebElement e) {
	q= new Actions(driver);
    q.contextClick(e).perform();
}
public void dragdrop(WebElement e,WebElement f) {
	q= new Actions(driver);
	q.dragAndDrop(e, f).perform();
}
public static void Apressakey() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_A);
}
public static void Xpressakey() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);
	
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_X);
}
public static void Vpressakey() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	
	 r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
}
public static void TABpressakey() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	
	 r.keyRelease(KeyEvent.VK_TAB);
	}
public static void Cpressakey() throws AWTException {
	r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_C);
	
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_C);
	 }
public static void acceptalert() {
	s = driver.switchTo().alert();
	s.accept();
}
public static void dismissalert() {
	s = driver.switchTo().alert();
	s.dismiss();
}
public static void gettextalert() {
	s = driver.switchTo().alert();
	String d = s.getText();
	System.out.println(d);
}
public static void sendalert(String h) {
	s = driver.switchTo().alert();
	s.sendKeys(h);
}
public static void shotscreen(String file) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dec = new File("C:\\Users\\USER\\eclipse-workspace\\MavenNew\\Screenshot\\"+file+".png");
FileUtils.copyFile(src, dec);
}
public static void clickscriptjava(WebElement e) {
	j = (JavascriptExecutor)driver;
  j.executeScript("arguments[0].click()", e);
}
public static void sendscriptjava(WebElement e, String u) {
	j = (JavascriptExecutor)driver;
  j.executeScript("arguments[0].setAttribute('value','"+u+"')", e);
}
public static void scrollscriptjava(WebElement e) {
	j = (JavascriptExecutor)driver;
  j.executeScript("arguments[0].scrollIntoView", e);
}
public static void getattributescriptjava(WebElement e,String u) {
	j = (JavascriptExecutor)driver;
  Object p = j.executeScript("return arguments[0]getAttribute('"+u+"')",e);
  System.out.println(p);
  }
public static String windowshan(int window) {
	Set<String> s = driver.getWindowHandles();
	List<String> l=new ArrayList();
l.addAll(s);
String childwin = l.get(window);
return childwin;
}
public static void aindexSelect (WebElement s,int p) {
	w = new Select(s);
	w.selectByIndex(p);
}
public static void avalueSelect (WebElement s,String p) {
	w = new Select(s);
	w.selectByValue(p);
}
public static void avisibleSelect (WebElement s,String p) {
	w = new Select(s);
	w.selectByVisibleText(p);
}
public static void aoptionsSelect (WebElement s) {
	w = new Select(s);
	List<WebElement> options = w.getOptions();
	System.out.println(options);
}
public static void allSelect (WebElement s) {
	w = new Select(s);
	List<WebElement> allSelectedOptions = w.getAllSelectedOptions();
	System.out.println(allSelectedOptions);
}
public static void afirstSelect (WebElement s) {
	w = new Select(s);
	WebElement firstSelectedOption = w.getFirstSelectedOption();
	System.out.println(firstSelectedOption);
}
public static void adeSelect (WebElement s,int p) {
	w = new Select(s);
	w.deselectByIndex(p);
}
public static void adeSelectall (WebElement s) {
	w = new Select(s);
	w.deselectAll();
}
public static void avaluedeSelect (WebElement s,String p) {
	w = new Select(s);
	w.deselectByValue(p);
}
public static void adeSelectvisible (WebElement s,String p) {
	w = new Select(s);
	w.deselectByVisibleText(p);
}
public static void aismultipile (WebElement s,String p) {
	w = new Select(s);
	boolean multiple = w.isMultiple();
	System.out.println(multiple);
}
public static void displayis(WebElement d) {
	boolean displayed = d.isDisplayed();
System.out.println(displayed);
}
public static void enableis(WebElement d) {
	boolean enabled = d.isEnabled();
System.out.println(enabled);
}
public static void selectis(WebElement d) {
   boolean selected = d.isSelected();
System.out.println(selected);
}
public static void await() {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
}
public static void table(int tt,int rr,int dd) {
	List<WebElement> at = driver.findElements(By.tagName("table"));
	WebElement t = at.get(tt);
	
	List<WebElement> ar = driver.findElements(By.tagName("tr"));
	WebElement r = ar.get(rr);
	
	List<WebElement> ad = driver.findElements(By.tagName("td"));
	WebElement d = ad.get(dd);
	System.out.println(d.getText());

}
public static String readdata(String lo,String sheet,int r,int c) throws IOException {
	File f = new File(lo);
	FileInputStream fi = new FileInputStream(f);
    Workbook bo = new XSSFWorkbook(fi);
	Sheet s = bo.getSheet(sheet);
	String d=" ";
	// s.getPhysicalNumberOfRows();
	Row row = s.getRow(r);
	//row.getPhysicalNumberOfCells();
	Cell cell = row.getCell(c);
	int ct = cell.getCellType();
	
	if (ct==1) {
			d = cell.getStringCellValue();	
	}
	else if(DateUtil.isCellDateFormatted(cell)) {
	Date date = cell.getDateCellValue();
	SimpleDateFormat si = new SimpleDateFormat();
	  d = si.format(date);
	}	
	else {
		double h = cell.getNumericCellValue();
	   long l = (long)h;
	    d = String.valueOf(l);
	}
	return d;
     }

public static void writedata(String l, String sh,int a,int b,String v ) throws IOException {
	File c = new File(l);
	Workbook bo = new XSSFWorkbook();
	Sheet s = bo.createSheet(sh);
	Row cr = s.createRow(a);
	Cell cc = cr.createCell(b);
	cc.setCellValue(v);
	FileOutputStream fi = new FileOutputStream(c);
	bo.write(fi);
}
public static void readandwritedata(String k,String s,int r,int c,String p) throws IOException {
   File f = new File(k);
   FileInputStream fin = new FileInputStream(f);
   Workbook bo = new XSSFWorkbook(fin);
   Sheet sheet = bo.getSheet(s);
   Row row = sheet.getRow(r);
   Cell cell = row.getCell(c);
   
  cell.setCellValue(p);
   FileOutputStream fo = new FileOutputStream(f);
   bo.write(fo);
    
}
public static void toaddadata(String k,String s,int r ,int c,String p) throws IOException {
	File f = new File(k);
    FileInputStream fi = new FileInputStream(f);
    Workbook boo = new XSSFWorkbook(fi);
    Sheet sheet = boo.getSheet(s);
    Row row = sheet.createRow(r);
    Cell cell = row.createCell(c);
    cell.setCellValue(p);
    FileOutputStream fo = new FileOutputStream(f);
    boo.write(fo);

}

public static void jvmreport(String jvmpath,String projectname,String jsonpath) {
	File f = new File(jvmpath);
    Configuration c = new Configuration(f, "projectname");
    List l = new ArrayList();
    l.add(jsonpath);
    ReportBuilder r = new ReportBuilder(l, c);
    Reportable g = r.generateReports();
}
private void adate() {
	Date d = new Date();
	System.out.println(d);
}



}








	
	
	
	
	
	
	


