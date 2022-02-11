package pom;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildPage {
	WebDriver driver;
	
	@FindBy (xpath = "//div[@data-testid='inline-availability-calendar']")
	private WebElement ScrollToDate;
	
	@FindBy (xpath = "//div[@data-testid = 'change-dates-checkIn']")
	private WebElement DateCheckIn;
	
	@FindBy (xpath = "//input[@id = 'checkIn-book_it']")
	private WebElement DateIn;
	
	@FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement SelectDateIn;
	
	@FindBy (xpath = "//input[@id= 'checkOut-book_it']")
	private WebElement datecheckout;
	
	@FindBy (xpath = "(//div[@data-testid='calendar-day-06/15/2022'])[2]")
	private WebElement SelectDateOut;
	
	@FindBy (xpath = "(//button[@data-testid= 'homes-pdp-cta-btn'])[2]")
	private WebElement Reserve;
	
	@FindBy (xpath = "//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/*[1]")
	private WebElement CalForword;
	
	public ChildPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;		
	}
	
	public void focus() {
		ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		String Child = al.get(1);
		System.out.println(driver.switchTo().window(Child).getTitle());
		
		driver.switchTo().window(Child);
		
	}
	
	public void scrollDate() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ScrollToDate);
		
	}
	
	public void dateCheckIn() throws Exception {
		DateCheckIn.click();
		
		for(int i = 1;i<=3;i++) {
			CalForword.click();
			Thread.sleep(3000);
		}
		Thread.sleep(5000);
		DateIn.sendKeys("06/01/2022");
		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.moveToElement(SelectDateIn).click().build().perform();
		SelectDateIn.click();		
	}
	
	public void dateCheckOut() throws Exception {
		datecheckout.click();
		datecheckout.sendKeys("06/15/2022");
		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.moveToElement(SelectDateOut).click().build().perform();
		SelectDateOut.click();	
		Reserve.click();
	}
	
	
	
	
}
