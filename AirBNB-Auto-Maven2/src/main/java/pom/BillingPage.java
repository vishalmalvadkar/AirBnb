package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage {
	WebDriver driver;
	@FindBy (xpath = "//div[text() = 'Continue with email']")
	private WebElement ByEmail;
	
	@FindBy (xpath = "//input[@data-testid='email-login-email']")
	private WebElement EnterEmail;
	
	@FindBy (xpath= "//button[@data-testid='signup-login-submit-btn']")
	private WebElement SignUpEmail;
	
	@FindBy (xpath = "//input[@data-testid='email-signup-user[first_name]']")
	private WebElement FirstName;
	
	@FindBy (xpath = "//input[@data-testid='email-signup-user[last_name]']")
	private WebElement LastName;
	
	@FindBy (xpath = "//input[@id='email-signup-date']")
	private WebElement DoB;
	
	@FindBy (xpath = "//input[@id='email-signup-password']")
	private WebElement Password;
	
	@FindBy (xpath = "//div[@data-section-id='PRICE_DETAIL']/div/div/div/div[1]/div/div[1]/button")
	private WebElement PrizeDetails;
	
	@FindBy (xpath = "//div[@role='dialog']/div/button")
	private WebElement PrizeDetailsClose;
	
	@FindBy (xpath = "//div[@data-section-id='PRICE_DETAIL']/div/div/div/div[2]/div/div[1]/button")
	private WebElement WeeklyDiscount;
	
	@FindBy (xpath = "//div[@role='dialog']/div/button")
	private WebElement WeeklyDiscountClose;
	
	@FindBy (xpath = "//div[@data-section-id='PRICE_DETAIL']/div/div/div/div[4]/div/div[1]/button")
	private WebElement OccupancyTaxes;
	
	@FindBy (xpath = "//div[@role='dialog']/div/button")
	private WebElement OccupancyTaxesClosed;
	
	@FindBy (xpath = "//div[@data-section-id='PRICE_DETAIL']/div/div/div/div[3]/div/div[1]/button")
	private WebElement ServicesFee;
	
	@FindBy (xpath = "//div[@role='dialog']/div/button")
	private WebElement ServicesFeeClosed;
	
	@FindBy (xpath = "//div[@data-section-id='PRICE_DETAIL']/div/div/div/div[5]/div/div[1]/button")
	private WebElement TotalInr;
	
	@FindBy (xpath = "//div[@role='dialog']/div/button")
	private WebElement TotalInrClosed;
	
	
	
	public BillingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void byEmail() {
		ByEmail.click();
	}
	
	public void enterEmail() {
		EnterEmail.sendKeys("mvishal7588@gmail.com");		
	}
	
	public void signUpEmail() {
		SignUpEmail.click();		
	}
	
	public void signUpForm(){
		FirstName.sendKeys("Vishal");
		LastName.sendKeys("Malvadkar");
		DoB.sendKeys("11/20/1994");
		Password.sendKeys("abc@123");
	}
	
	public void BillModule() throws InterruptedException {
		PrizeDetails.click();
		Thread.sleep(2000);
		PrizeDetailsClose.click();
		Thread.sleep(2000);
		WeeklyDiscount.click();
		Thread.sleep(2000);
		WeeklyDiscountClose.click();
		Thread.sleep(2000);
		OccupancyTaxes.click();
		Thread.sleep(2000);
		OccupancyTaxesClosed.click();
		Thread.sleep(2000);
		ServicesFee.click();
		Thread.sleep(2000);
		ServicesFeeClosed.click();
		Thread.sleep(2000);
		TotalInr.click();
		Thread.sleep(2000);
		TotalInrClosed.click();
		Thread.sleep(2000);
		
		
	}
}
