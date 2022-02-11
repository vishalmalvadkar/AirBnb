package org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ChildPage;
import pom.HomePage;
import pom.HotelSel;
import pom.Places;
import pom.SubHeadBtn;

public class Test2 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.get("https://www.airbnb.co.in/");
		driver.manage().window().maximize();
		
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.popUpHandle();
		hp.from();
		hp.addGuest();
		//hp.addGuest();
		hp.submitBtn();
		
		Places pl = new Places(driver);
		Thread.sleep(3000);
		pl.typesOfPlace();
		pl.entirePlace();
		pl.privateRoom();
		pl.hotelRoom();
		pl.sharedRoom();
		pl.saveBtn();
		
		SubHeadBtn bt = new SubHeadBtn(driver);
		Thread.sleep(3000);
		bt.freeCancel();
		bt.beachFront();
		
		HotelSel hs = new HotelSel(driver);
		Thread.sleep(3000);
		hs.scrollToHotel();
		Thread.sleep(3000);
		hs.selectHotel();
		
		ChildPage cp = new ChildPage(driver);
		Thread.sleep(3000);
		cp.focus();
		Thread.sleep(3000);
		cp.scrollDate();
		Thread.sleep(3000);
		cp.dateCheckIn();
		Thread.sleep(3000);
		cp.dateCheckOut();
		
		
	}

}
