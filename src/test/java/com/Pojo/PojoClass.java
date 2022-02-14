package com.Pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClass;

public class PojoClass extends BaseClass {

public  PojoClass() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"login_form\"]/table/tbody/tr[1]/td")
private WebElement AdactinPage;

@FindBy(id="username")
private WebElement UserName;
@FindBy(id="password")
private WebElement PassWord;
@FindBy(id="login")
private WebElement BtnLogin;
@FindBy(xpath="//td[@class='login_title']")
private WebElement SerchHotel;
@FindBy(id="location")
private WebElement Location;
@FindBy(id="hotels")
private WebElement Hotel;
@FindBy(id="room_type")
private WebElement RoomType;
@FindBy(id="room_nos")
private WebElement NoOfRooms;
@FindBy(id="datepick_in")
private WebElement CheckInDate;
@FindBy(id="datepick_out")
private WebElement CheckOutDate;
@FindBy(id="adult_room")
private WebElement APerRoom;
@FindBy(id="child_room")
private WebElement CPerRoom;
@FindBy(id="Submit")
private WebElement Serch;
public void sleep() {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@FindBy(xpath="//*[@id=\"select_form\"]/table/tbody/tr[1]/td")
private WebElement SelectHotel;
@FindBy(id="radiobutton_0")
private WebElement RadioBtn;
@FindBy(id="continue")
private WebElement Continue;
@FindBy(xpath="//*[@id=\"book_hotel_form\"]/table/tbody/tr[2]/td")
private WebElement BookAHotel;
@FindBy(id="first_name")
private WebElement FirstNa;
@FindBy(name="last_name")
private WebElement LastNa;
@FindBy(id="address")
private WebElement BillingAdd;
@FindBy(id="cc_num")
private WebElement CreditCardNo;
@FindBy(id="cc_type")
private WebElement CardType;
@FindBy(id="cc_exp_month")
private WebElement ExpMonth;
@FindBy(id="cc_exp_year")
private WebElement ExpYear;
@FindBy(id="cc_cvv")
private WebElement Cvv;
@FindBy(id="book_now")
private WebElement BookNow;
@FindBy(id="order_no")
private WebElement OrderNo;
public WebElement getBookNow() {
	return BookNow;
}
public WebElement getOrderNo() {
	return OrderNo;
}
public WebElement getBookAHotel() {
	return BookAHotel;
}
public WebElement getFirstNa() {
	return FirstNa;
}
public WebElement getLastNa() {
	return LastNa;
}
public WebElement getBillingAdd() {
	return BillingAdd;
}
public WebElement getCreditCardNo() {
	return CreditCardNo;
}
public WebElement getCardType() {
	return CardType;
}
public WebElement getExpMonth() {
	return ExpMonth;
}
public WebElement getExpYear() {
	return ExpYear;
}
public WebElement getCvv() {
	return Cvv;
}
public WebElement getSelectHotel() {
	return SelectHotel;
}
public WebElement getRadioBtn() {
	return RadioBtn;
}
public WebElement getContinue() {
	return Continue;
}
public WebElement getUserName() {
	return UserName;
}
public WebElement getPassWord() {
	return PassWord;
}
public WebElement getBtnLogin() {
	return BtnLogin;
}
public WebElement getSerchHotel() {
	return SerchHotel;
}
public WebElement getLocation() {
	return Location;
}
public WebElement getHotel() {
	return Hotel;
}
public WebElement getRoomType() {
	return RoomType;
}
public WebElement getNoOfRooms() {
	return NoOfRooms;
}
public WebElement getCheckInDate() {
	return CheckInDate;
}
public WebElement getCheckOutDate() {
	return CheckOutDate;
}
public WebElement getAPerRoom() {
	return APerRoom;
}
public WebElement getCPerRoom() {
	return CPerRoom;
}
public WebElement getSerch() {
	return Serch;
}
public WebElement getAdactinPage() {
	return AdactinPage;
}



}
