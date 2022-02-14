Feature: Validation of Login Page in Adactin Web Page
Scenario Outline: Tc01_Validation of Login Page with Valid Username and Valid Password
Given User Launch Adactin Web Page
Then User Verifies Adactin Web Page Is Displayed
When User Enters Valid "<Username>" and Valid "<Password>"
And User Clicks Login Button
Then User Verify Serch Hotel Page is Displayed
When User Selects Valid "<Location>","<HotelName>","<HotelType>","<NoOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRooms>","<ChildrenPerRoom>"
And User Clicks Serch Button
Then User Verify Adactin Select Hotel Page Is Displayed
When User Clicks Radio Button and Continue Button
Then User Verify Adactin Book a Hotel Page Is Displayed
When User Enters Valid "<FirstName>","<LastName>","<BillingAddress>"
When User Entres Valid "<CreditCardNo>",Card Type,ExpMonth,ExpYear and "<CVV>"
And User Clicks Book Now Button
Then User Verify Order ID is Displayed

Examples:
|Username|Password|CheckInDate|CheckOutDate|FirstName|LastName|BillingAddress|CreditCardNo|CVV|
|Nolan425|Karthik425@|13/02/2022|15/02/2022|Nolan|John|Doorno-456,SouthRoad,Delhi|9876564789765345|456|
