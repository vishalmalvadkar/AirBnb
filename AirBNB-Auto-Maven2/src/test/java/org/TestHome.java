package org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.BillingPage;
import pom.ChildPage;
import pom.Filters;
import pom.HomePage;
import pom.HotelSel;
import pom.Places;
import pom.SubHeadBtn;

public class TestHome {
	WebDriver driver;
	@BeforeClass
	@Parameters("browsers")
	public void beforeClass(String browser) {
		System.out.println("enter-in-before-class");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.airbnb.co.in/");
			driver.manage().window().maximize();
		}
		
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Files\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.airbnb.co.in/");
		}
		
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver.exe");
//		driver = new ChromeDriver();		
//		driver.get("https://www.airbnb.co.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod() {	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
	}
	
	@Test
	public void tC1() throws Exception {
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.popUpHandle();
		hp.from();
		hp.addGuest();
		hp.submitBtn();
		Thread.sleep(3000);
	}
	
	@Test
	public void tC2() throws InterruptedException {
		Filters ft = new Filters(driver);
//		Thread.sleep(3000);
		ft.filterBtn();
		Thread.sleep(3000);
		ft.increaseBed();
		Thread.sleep(3000);
		ft.increaseRoom();
		Thread.sleep(3000);
		ft.increaseBath();
		ft.showBtn();
		
		
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ data-testid = 'menuItemButton-room_type']/button")));
	}
	
	@Test
	public void tC3() throws Exception {
		Places pl = new Places(driver);
		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@ data-testid = 'menuItemButton-room_type']/button")));
		pl.typesOfPlace();
		pl.entirePlace();
		pl.privateRoom();
		pl.hotelRoom();
		pl.sharedRoom();
		pl.saveBtn();
		
		
	}
	
	@Test
	public void tC4() throws InterruptedException {
		SubHeadBtn sbh = new SubHeadBtn(driver);
		Thread.sleep(3000);
		sbh.beachFront();
		sbh.freeCancel();
	}
	
	@Test
	public void tC5() throws InterruptedException {
		HotelSel hs = new HotelSel(driver);
		Thread.sleep(3000);
		hs.scrollToHotel();
		Thread.sleep(3000);
		hs.selectHotel();
	}
	
	@Test
	public void tC6() throws Exception {
		ChildPage cp = new ChildPage(driver);
		Thread.sleep(5000);
		cp.focus();
		cp.scrollDate();
		cp.dateCheckIn();
		cp.dateCheckOut();
		
	}
	
	@Test
	public void tC7() throws InterruptedException {
		BillingPage p = new BillingPage(driver);
		Thread.sleep(3000);
		p.byEmail();
		p.enterEmail();		
		p.signUpEmail();
		Thread.sleep(3000);
		p.signUpForm();
		p.BillModule();
	}	

}
