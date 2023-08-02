package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.utilsClass.*;
import BaseLayer.BaseClass;

public class TicketBookingPage extends BaseClass{

@FindBy(xpath="//span[@class='sc-iCfMLu ixvMbU']")
private WebElement AdPop;

@FindBy(xpath="(//p[text()='Enter city or airport'])[1]")
private WebElement FromCity;

@FindBy(xpath="//input[@type='text']")
private WebElement From;

@FindBy(xpath="(//div[@class='sc-12foipm-44 etmZgr'])[1]")
private WebElement EnterFromCity;

@FindBy(xpath="(//input[@type='text'])")
private WebElement ToCity;

@FindBy(xpath="(//p[@class='sc-12foipm-46 eZeZGp'])[1]")
private WebElement EnterToCity;

@FindBy(xpath="(//div[@class='DayPicker-Caption'])[1]/div")
private WebElement MonthYearTag;

@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
private WebElement NextButton;

@FindBy(xpath="(//div[@class='DayPicker-Day'])[10]")
private WebElement date;

@FindBy(xpath="//span[text()='Done']")
private WebElement Done;

@FindBy(xpath="(//p[@class='sc-12foipm-60 hJdcyc'])[1]")
private WebElement Adult;

@FindBy(xpath="(//span[@class='sc-12foipm-63 ePVCFi'])[2]")
private WebElement SelectAdult;

@FindBy(xpath="//p[text()='Children']")
private WebElement children;

@FindBy(xpath="(//span[@class='sc-12foipm-63 ePVCFi'])[4]")
private WebElement Selectchildren;

@FindBy(xpath="//a[text()='Done']")
private WebElement Doneclick;

@FindBy(xpath="//span[text()='SEARCH FLIGHTS']")
private WebElement SearchFlight;

@FindBy(xpath="(//button[text()='VIEW FARES'])[1]")
private WebElement viewPrice;

@FindBy(xpath="//input[@value='Book']")
private WebElement Book;


public TicketBookingPage() {
	PageFactory.initElements(driver, this);
}

public void TicketBookingPageFun(String from,String To,String Year) {
	AdPop.click();
	FromCity.click();
	sendKeys(From,from);
	EnterFromCity.click();
	sendKeys(ToCity,To);
	EnterToCity.click();
	
	while(true) {
		String a=MonthYearTag.getText();
		System.out.println(a);
		if(a.contains(Year)) {
			break;
		}else {
			NextButton.click();
		}}
			date.click();
			Done.click();
	Adult.click();
	for(int i=1;i<=4;i++) {
		SelectAdult.click();
	}
	
	children.click();
	for(int j=0;j<=3;j++) {
		Selectchildren.click();	
	}
	Doneclick.click();
	SearchFlight.click();
	viewPrice.click();		
	Book.click();		
		}

}

