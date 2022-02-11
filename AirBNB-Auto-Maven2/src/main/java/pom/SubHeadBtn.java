package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubHeadBtn {
	
	WebDriver driver;	
	//div[@data-testid= 'menuItemButton-toggleItem-dynamic_amenities-Free cancellation-Free cancellation']/button
	@FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/div[1]/span[1]")
	private WebElement FreeCancel;
	
	//div[@data-testid= 'menuItemButton-toggleItem-dynamic_amenities-Beachfront-Beachfront']/button
	@FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]/div[1]/span[1]")
	private WebElement BeachFront;
	
	
	public SubHeadBtn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void freeCancel() {
		FreeCancel.click();
	}
	
	public void beachFront() {
		BeachFront.click();		
	}
}
