package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage extends PageBase {

	public BookingPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[contains(text(),'Roundtrip')]")
	private WebElement listElement ;
	@FindBy(xpath = "//span[contains(text(),'Multi-city')]")
	private WebElement multiElement ;
	
	@FindBy(className = "call")
	private WebElement accepetcookiesElement ;
	
	@FindBy(xpath = "//input[@id='jb-autocomplete-3-search']")
	private WebElement fromflight1Element;
	
	@FindBy(xpath = "//input[@id='jb-autocomplete-4-search']")
	private WebElement toflight1Element;
	
	@FindBy(xpath = "//input[@id='jb-date-picker-input-id-2']")
	private WebElement depart1;

	@FindBy(xpath = "//span[contains(text(),'21')]")
	private WebElement date1;
	
	
	@FindBy(xpath = "//input[@id='jb-autocomplete-5-search']")
	private WebElement fromflight2Element;
	
	@FindBy(xpath = "//input[@id='jb-autocomplete-6-search']")
	private WebElement toflight2Element;
	
	@FindBy(xpath = "//input[@id='jb-date-picker-input-id-3']")
	private WebElement depart2;
	
	@FindBy(xpath = "//span[contains(text(),'30')]")
	private WebElement date2;
	
	@FindBy(xpath = "//span[contains(text(),'Search flights')]")
	private WebElement searchElement;
	
	@FindBy(xpath = "//span[contains(text(),'Continue to flight results')]")
	private WebElement continueflightElement;
	
	
	
	
	
	public void clicklist() {
		clickButton(listElement);
		
	}
	public void multi() {
		clickButton(multiElement);
		
	}
	
	public void accepting () {
		clickButton(accepetcookiesElement);
	}
	
	public void fromflight1 () {
		
		setTextElementText(fromflight1Element, "Cairo, Egypt (CAI)");
	}
	
public void toflight1 () {
		
		setTextElementText(toflight1Element, "New York City area (NYC)");
	}
public void date1() {
	clickButton(depart1);
	clickButton(date1);
	
}
public void fromflight2 () {
	
	setTextElementText(fromflight2Element, "New York City area (NYC)");
}

public void toflight2 () {
	
	setTextElementText(toflight2Element, "Paris - Charles de Gaulle, France (CDG)");
}
public void date2() {
clickButton(depart2);
clickButton(date2);

}
public void searchflight() {
	clickButton(searchElement);
	
	
}
public void clickcontinue() {
	clickButton(continueflightElement);
	
	
}

	
	

}


