package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Places {
	WebDriver driver;
	
	
	@FindBy (xpath = "//div[@ data-testid = 'menuItemButton-room_type']/button")
	private WebElement TypesOfPlace;
	
	@FindBy (xpath = "//input[@name = 'Entire place']")
	private WebElement EntirePlace;
	
	@FindBy (xpath = "//input[@name = 'Private room']")
	private WebElement PrivateRoom;
	
	@FindBy (xpath = "//input[@name = 'Hotel room']")
	private WebElement HotelRoom;
	
	@FindBy (xpath = "//input[@name = 'Shared room']")
	private WebElement SharedRoom;
	
	@FindBy (xpath = "//button[@data-testid= 'filter-panel-save-button']")
	private WebElement SaveBtn;
	
	public Places(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void typesOfPlace() {
		TypesOfPlace.click();		
	}
	
	public void entirePlace() {
		EntirePlace.click();	
	}
	
	public void privateRoom() {
		PrivateRoom.click();		
	}
	
	public void hotelRoom() {
		HotelRoom.click();		
	}
	
	public void sharedRoom() {
		SharedRoom.click();
	}
	
	public void saveBtn() {
		SaveBtn.click();
	}

}
