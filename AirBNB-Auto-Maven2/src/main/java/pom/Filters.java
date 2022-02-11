package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filters {
	WebDriver driver;
	
	
	@FindBy (xpath = "//div[@id='filter-menu-chip-group']/div[2]/div/div[4]/button")
	private WebElement Filter;
	
	@FindBy (xpath = "//button[@data-testid='filterItem-rooms_and_beds-stepper-min_beds-0-increase-button']")
	private WebElement IncreaseBed;
	
	@FindBy (xpath = "//button[@data-testid='filterItem-rooms_and_beds-stepper-min_bedrooms-0-increase-button']")
	private WebElement IncreaseRoom;
	
	@FindBy (xpath = "//button[@data-testid='filterItem-rooms_and_beds-stepper-min_bathrooms-0-increase-button']")
	private WebElement IncreaseBath;
	
	@FindBy (xpath = "//a[text()='Show 300+ stays']")
	private WebElement ShowBtn;
	
//	@FindBy (xpath = "(//div[@role='group'])[7]/div[2]/div[1]")
//	private WebElement ScrollToHotel;
//	
//	@FindBy (xpath = "(//div[@role='group'])[8]/a")
//	private WebElement HotelClick;
	
	
	
	public Filters(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;		
	}
	
	public void filterBtn() {
		Filter.click();		
	}
	
	public void increaseBed() {
		Actions act = new Actions(driver);
		act.moveToElement(IncreaseBed).click().build().perform();		
	}
	
	public void increaseRoom() {
		Actions act = new Actions(driver);
		for(int i = 1;i<=2;i++) {
			act.moveToElement(IncreaseRoom).click().build().perform();			
		}			
	}
	
	public void increaseBath() {
		Actions act = new Actions(driver);
		act.moveToElement(IncreaseBath).click().build().perform();		
	}
	
	public void showBtn() {
		Actions act = new Actions(driver);
		act.moveToElement(ShowBtn).click().build().perform();		
	}
	
	
	

	
//	public void scrollDown() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", ScrollToHotel);
//	}
//	
//	public void scrollHotel() {
//		HotelClick.click();
//		
//	}
	
}
