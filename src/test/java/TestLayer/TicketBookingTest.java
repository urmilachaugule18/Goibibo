package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.TicketBookingPage;

public class TicketBookingTest extends BaseClass{

	@BeforeTest
	public void setUp() {
		initilization();
	}
	
	@Test
	public void validatebookingFun() {
		TicketBookingPage reg=new TicketBookingPage();
		reg.TicketBookingPageFun("Pune", "Mumbai","November 2023");;
	}
}
