package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//div[@data-testid='main-cookies-banner-container']/section/div[2]/div[2]/button")
	private WebElement PopUp;
	
	@FindBy (xpath = "//input[@name='query']")
	private WebElement From;
	//(//div[@role='option'])[3]/div[2]
	@FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[4]/div[2]/div[1]")
	private WebElement CitySelect;
	
	@FindBy (xpath = "(//div[@role='button'])[3]/div/div[2]")
	private WebElement AddGuest;
	
	@FindBy (xpath = "//button[@data-testid='stepper-adults-increase-button']")
	private WebElement AddAdult;
	
	@FindBy (xpath = "(//button[@type='button'])[4]")
	private WebElement Submitbtn;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void popUpHandle() {
		PopUp.click();
	}
	
	public void from() throws Exception {
		From.click();
		Thread.sleep(3000);
		From.sendKeys("goa");
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(CitySelect).click().build().perform();
		
	}
	
	public void addGuest() throws InterruptedException {
		Thread.sleep(3000);
		AddGuest.click();
//		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		for(int i=1; i<=5; i++) {
			act.moveToElement(this.AddAdult).click().build().perform();			
		}		
	}
	
	public void submitBtn() throws Exception {
//		Thread.sleep(3000);
//		Actions act = new Actions(driver);
//		act.moveToElement(Submitbtn).click().build().perform();
		Submitbtn.submit();
		//Submitbtn.click();
		
		
	}
	
	
	

}
