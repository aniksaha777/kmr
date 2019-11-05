Feature: AFM online Join
Description: The purpose of these test is to test AFM online join form with different sets of data

@AFM
Scenario: Login to Local
Given The User is on the AFM Online join Page
|https://10.2.5.99/afmlocal802/public/online-join|
When User Enters the Member Details
|SSN|JoiningReason|OtherReason|LastName|FirstName|Initial|DirName|Gender|DOB|
|123652782|HEALTHCARE,WORKCOND,REQUIRE,PENSION,PAC,OTHER|Test Reason'ab|TestLastName'ab|FirstName'abc|M|DirName'Testbc|Female|10101970|
And Clicks on Continue
And User Enters the Contact Details
|Address1|Address2|Zip|
|Address1|Address2|99501|
And Clicks on Continue
And User Enters Instrument Details
|CBA|
|N|
And Clicks on Continue
And User Accepts Terms and Conditions with Signature
|sign1|sign2|
|TestSignature|TestSignature|
And Clicks on Continue
And User Verifies the Payment Page
|Quarters|tempo802Fed|tempo_ny|musicianfund|anniewalkerfund|
|1|20|35|50|0|
And Clicks on Continue
And Checks out to Pay through Paypal
And Logs into paypal
|Paypalid|PaypalPassword|
|mousum_1345005826_per@gmail.com|345005801|
And Completes payment through Paypal
Then The user should be Registered Successfully

