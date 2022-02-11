package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSel {
	WebDriver driver;
	@FindBy (xpath = "(//div[@role='group'])[7]/div[2]/div[1]")
	private WebElement Scorll;
	
	@FindBy (xpath = "(//div[@role='group'])[8]/a")
	private WebElement SelectHotel;
	
	public HotelSel(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void scrollToHotel() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Scorll);
	}
	
	public void selectHotel() {
		SelectHotel.click();
		
	}
	

}
