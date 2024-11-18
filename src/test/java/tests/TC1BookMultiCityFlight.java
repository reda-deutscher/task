package tests;

import org.testng.annotations.Test;

import pages.BookingPage;

public class TC1BookMultiCityFlight extends TestBase {
	BookingPage bookobject;
	
	
	
	
	
	@Test(priority = 1)
	public void ChooseMultiFlight () {

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
	
	@Test(priority = 3)
	public void search() {
		bookobject = new BookingPage(driver);
		bookobject.searchflight();

	}
	@Test(priority = 4)
	public void continueFlight() {
		bookobject = new BookingPage(driver);
		bookobject.clickcontinue();

	}
	
	

}
