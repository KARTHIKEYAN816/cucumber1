package com.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	public static WebDriver driver;
	PojoClass lp=new PojoClass();
	BaseClass b=new BaseClass();
	
	
	@Given("User Launch Adactin Web Page")
	public void user_Launch_Adactin_Web_Page() {
		
	}
	@Then("User Verifies Adactin Web Page Is Displayed")
	public void user_Verifies_Adactin_Web_Page_Is_Displayed() {
		lp.sleep();
		boolean o = b.IsD(lp.getAdactinPage());
		System.out.println(o);
			
	}

	@When("User Enters Valid {string} and Valid {string}")
	public void user_Enters_Valid_and_Valid(String Username, String Password) {
		b.Type(lp.getUserName(), Username);
		b.Type(lp.getPassWord(), Password);
	    
	}

	@When("User Clicks Login Button")
	public void user_Clicks_Login_Button() {
		lp.getBtnLogin().click();
	   
	}

	@Then("User Verify Serch Hotel Page is Displayed")
	public void user_Verify_Serch_Hotel_Page_is_Displayed() {
		boolean s = b.IsD(lp.getSerchHotel());
		System.out.println(s);
	}

	@When("User Selects Valid {string},{string},{string},{string},{string},{string},{string},{string}")
	public void  user_Selects_Valid(String Location, String HotelName, String HotelType, String NoOfRooms, String CheckInDate, String CheckOutDate, String AdultsPerRooms, String ChildrenPerRoom) {
	  b.SelectByValue(lp.getLocation(), "Melbourne");
	  b.SelectByValue(lp.getHotel(), "Hotel Sunshine");
	  b.SelectByValue(lp.getRoomType(), "Double");
	  b.SelectByValue(lp.getNoOfRooms(), "3");
	  b.Clear(lp.getCheckInDate());
	  b.Type(lp.getCheckInDate(), CheckInDate);
	  b.Clear(lp.getCheckOutDate());
	  b.Type(lp.getCheckOutDate(), CheckOutDate);
	  b.SelectByValue(lp.getAPerRoom(), "2");
	  b.SelectByValue(lp.getCPerRoom(), "2");
	}

	@When("User Clicks Serch Button")
	public void user_Clicks_Serch_Button() {
	  lp.getSerch().click();
	   
	}

	@Then("User Verify Adactin Select Hotel Page Is Displayed")
	public void user_Verify_Adactin_Select_Hotel_Page_Is_Displayed() {
		boolean l = b.IsD(lp.getSelectHotel());
		System.out.println(l);
	}

	@When("User Clicks Radio Button and Continue Button")
	public void user_Clicks_Radio_Button_and_Continue_Button() {
		b.Btnclick(lp.getRadioBtn());
		b.Btnclick(lp.getContinue());
	    
	}
	
	@Then("User Verify Adactin Book a Hotel Page Is Displayed")
	public void user_Verify_Adactin_Book_a_Hotel_Page_Is_Displayed() {
		boolean bh = b.IsD(lp.getBookAHotel());
		System.out.println(bh);
		
	}

	@When("User Enters Valid {string},{string},{string}")
	public void user_Enters_Valid(String FirstName, String LastName, String BillingAddress) {
		b.Type(lp.getFirstNa(), FirstName);
        b.Type(lp.getLastNa(), LastName);
        b.Type(lp.getBillingAdd(), BillingAddress);
	}

	@When("User Entres Valid {string},Card Type,ExpMonth,ExpYear and {string}")
	public void user_Entres_Valid_Card_Type_ExpMonth_ExpYear_and(String CreditCardNo, String CVV) { 
	   b.Type(lp.getCreditCardNo(), CreditCardNo);
	   b.SelectByValue(lp.getCardType(), "VISA");
	   b.SelectByValue(lp.getExpMonth(), "5");
		b.SelectByValue(lp.getExpYear(), "2022");
		b.Type(lp.getCvv(), CVV);
	}
	@When("User Clicks Book Now Button")
	public void user_Clicks_Book_Now_Button() {
		b.Btnclick(lp.getBookNow()); 
	}
	
	@Then("User Verify Order ID is Displayed")
	public void user_Verify_Order_ID_is_Displayed() throws InterruptedException {
	   Thread.sleep(5000);
	   boolean od = b.IsD(lp.getOrderNo());
	   System.out.println(od);
		b.Print(lp.getOrderNo());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	

	
}
