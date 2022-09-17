# My Store
**AutomationPractice**

Java quickstart project for test automation Web Application (MyStore Enterprise Java eCommerce) Website.

**URL** 
"http://automationpractice.com/index.php".

### Motivation:

Creating Automation Scripts and Extent Reports To Test The Happy scenario , Test automation helps you reduce the feedback cycle and bring faster validation for phases in the development of your product. Test automation is especially useful because it helps you detect problems or bugs early on during the development phase, which increases the team's efficiency .


### Features:

    • Smart Element Locators.
      
    • Conditional waiting.
      
    • Easy Assertions.
      
    • Reusable steps.
    
    • This project Automation Testing will help Tester to test his application using automation to reduce the manual time.
   
    • The Scenario Test The Fast of App and Measure the Response of application.
    
    
 ### Tools / Technology Used:
    Maven
    TestNG
    Selenium Webdriver
    Technology Used : Java, TestNG, Selenium, Maven.
    Tools : Intellij IDEA Community Edition.
    Design Pattern Used: Page Object Model. 
    
   ### Installation:

    1- Install intellij IDEA Community Edition.
    2- Install JDK and Check the Version .
    3- Install Maven.
    4- Install The Chrome Driver .
    
    
### How to use:

1- In Folder (Src) → tab Folder (Java) → Tab Folder (webPages) → pageLocators for three pages (SignUpPage , SignInPage , SelectedItemPage) are contains all locators , Functions that used in MainClass.


2- In Folder (Src) → tab Folder (Java) → Tab Folder (Tests) 
 - (SuperClass. Java )class contains the scripts that works onetime (SetUp , TearDown) and annotations (@beforeClass,@AfterClass) that runs one Time before tests.
 - (ReadExcelFile.java) contains the Method that read from excel Sheet .
 - (MainClass.java) extends from Class (superClass.java) and contains all Tests Cases that have his priority ,Can run the test case and check the output.
 
3- The Folder Reports in Project that contains The report that created after run the test cases to show number of testcase are Passed or Failed or Skipped .

4- The Excel File (testdataemails.xlsx) that contains the Testdata that required for sign up scenario .


### Tests:

After Download The File on your PC :
1- Open your The Automation tool.
2- Click on ”File” → Tab/ Click on “Open” →  Choose
The File Path (That you saved the Project).
3- From Structure of Project , Click on Folder (Test)→
Click on Folder (Java)→ Click on Folder (tests)→
Insert  in the Main Class.
3- In Test Case is taged with annotations (@test) , Right Click → Click on (Run ‘testScenario()’).
4- Check the Output .
    

    



