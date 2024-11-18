package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCyclePage extends PageBase {

	public CheckoutCyclePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//div[@class=\"mv1 b\"])[1] ")
	private WebElement selectFlight1Element;

	@FindBy(xpath = "//div[@class=\"fare-tile-content\"] ")
	private WebElement economyElement;
	@FindBy(xpath = "(//div[@class=\"fare-tile-content\"])[1]")
	private WebElement selectbluElement;

	@FindBy(xpath = "//span[contains(text(),'Next: Trip Summary')]")
	private WebElement nextTripSummary;

	@FindBy(xpath = "//span[contains(text(),'Next: Checkout')]")
	private WebElement nextCheckout;

	@FindBy(className = "baseline-offset")
	private WebElement nextTravelerDetails;

	@FindBy(xpath = "//span[contains(text(),'Continue as guest')]")
	private WebElement continueAsGuest;

	@FindBy(id = "jb-error-id-12")
	private WebElement title;

	@FindBy(id = "jjb-error-id-16")
	private WebElement firistName;
	@FindBy(id = "jjb-error-id-20")
	private WebElement middleName;
	@FindBy(id = "jjb-error-id-23")
	private WebElement lastName;
	@FindBy(id = "jjb-error-id-13")
	private WebElement email;
	
	@FindBy(xpath = "//button[@title=\"Gender\"]")
	private WebElement genderElement;
	@FindBy(xpath = "//jb-form-dropdown[@qa-id = \"month-dropdown\"]")
	private WebElement month;
	@FindBy(xpath = "//jb-form-dropdown[@qa-id = \"day-dropdown\"]")
	private WebElement day;
	@FindBy(xpath = "//jb-form-dropdown[@qa-id = \"year-dropdown\"]")
	private WebElement year;
	@FindBy(xpath = "jb-autocomplete-0-search")
	private WebElement adressElement;
	@FindBy(xpath = "//div[contains(text(),'US')]")
	private WebElement counteryKeyElement;
	@FindBy(xpath = "//input[@aria-labelledby=\"jb-input-label-id-0\"]")
	private WebElement phoneNumberElement;
	@FindBy(xpath = "//span[contains(text(),'Next: Seats & Extras')]")
	private WebElement nextExtraElement;
	@FindBy(xpath = "//span[contains(text(),'Gender is required')]")
	public WebElement genderRequirdElement;
	@FindBy(xpath = "//span[contains(text(),'Date of birth is required')]")
	public WebElement datebirthRequird;

	public void selectFlight() {
		clickButton(selectFlight1Element);

	}

	public void economy() {
		clickButton(economyElement);

	}

	public void blue() {
		clickButton(selectbluElement);

	}

	public void nextTrip() {
		clickButton(nextTripSummary);

	}

	public void nxtCheckout() {
		clickButton(nextCheckout);

	}

	public void nxtTravel() {
		clickButton(nextTravelerDetails);

	}

	public void continueguest() {
		clickButton(continueAsGuest);

	}

	public void titels(String titlestring) {
		setTextElementText(title, titlestring);

	}

	public void first(String FN) {
		setTextElementText(firistName, FN);

	}

	public void last(String LN) {
		setTextElementText(lastName, LN);

	}

	public void email(String emailString) {
		setTextElementText(email, emailString);

	}
	public void gender() {
		clickButton(genderElement);;

	}

	public void month() {
		clickButton(month);

	}

	public void day() {
		clickButton(day);

	}

	public void year() {
		clickButton(year);

	}

	public void adress(String adressString) {
		setTextElementText(adressElement, adressString);

	}

	public void counteryKey() {
		clickButton(counteryKeyElement);

	}

	public void phoneNumber(String phoneString) {
		setTextElementText(phoneNumberElement, phoneString);
	}
	public void nextbtn() {
		clickButton(nextExtraElement);
		
	}

}
