package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.BookingPage;
import pages.CheckoutCyclePage;

public class TC3CheckoutByInValidData extends TestBase {
	BookingPage bookobject;
	CheckoutCyclePage checkobject;

	@Test(priority = 1)
	public void ChooseMultiFlight() {

		bookobject = new BookingPage(driver);
		bookobject.accepting();
		bookobject.clicklist();
		bookobject.multi();

	}

	@Test(priority = 2)
	public void FiristFlight() {
		bookobject = new BookingPage(driver);
		bookobject.fromflight1();
		bookobject.toflight1();
		bookobject.date1();
	}

	@Test(priority = 3)
	public void SocendFlight() {
		bookobject = new BookingPage(driver);
		bookobject.fromflight2();
		bookobject.toflight2();
		bookobject.date2();
	}

	@Test(priority = 4)
	public void search() {
		bookobject = new BookingPage(driver);
		bookobject.searchflight();

	}

	@Test(priority = 5)
	public void continueFlight() {
		bookobject = new BookingPage(driver);
		bookobject.clickcontinue();

	}

	@Test(priority = 6)
	public void bookFlight() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.selectFlight();

	}

	@Test(priority = 7)
	public void economy() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.economy();

	}

	@Test(priority = 8)
	public void blue() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.blue();

	}

	@Test(priority = 9)
	public void nextTrip() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.nextTrip();

	}

	@Test(priority = 10)
	public void nxtCheckout() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.nxtCheckout();

	}

	@Test(priority = 11)
	public void nxtTravel() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.nxtTravel();

	}

	@Test(priority = 12)
	public void continueguest() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.continueguest();

	}
	
	@Test(priority = 13)
	public void titele() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.titels("cairo");

		
	}
	public void firistname() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.first("Reda");

		
	}public void lastnane() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.last("Ahmed");

		
	}
	public void email() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.email("redaahmed@gmail.com");

		
	}
	
	public void adress() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.adress("Cairo");

		
	}
	public void counterykey() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.counteryKey();

		
	}
	public void phone() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.phoneNumber("564694329876");

		
	}
	public void next() {
		checkobject = new CheckoutCyclePage(driver);
		checkobject.nextbtn();

		
	}
	
	public void assertgenderrequierdfeild() {
		checkobject = new CheckoutCyclePage(driver);
		assertEquals(checkobject.genderRequirdElement.getText(),"Gender is required" );
		
	}
	public void assertdaterequierdfeild() {
		checkobject = new CheckoutCyclePage(driver);
		assertEquals(checkobject.datebirthRequird.getText(),"Date of birth is required" );
		
	}
	
	

}
