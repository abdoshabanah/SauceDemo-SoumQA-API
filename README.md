# First Part # SauceDemo 

This framework is created to automate some test cases for the SauceDemo website.
The project is created using selenium webdriver and java using Page Object Model design pattern. 
The Project have 3 main packages: Pages, data & Tests Packages.
- The first one Pages, contain some classes created for each page of the product like: Login Page, Home Page,...
   these classes created containing the elements of each page and thier corresponding functionalities that would be used.

- The Socend one Tests, contain the classes which include the test cases that would be checked using the data from an excel sheet and using also the functions and the element defined on the classes which created in the Pages Package

   - We have classes in Tests Package like: LoginTest, which validate the successful login and un successful login
     also there classes to check selecting a product till completing the checkout process.

- The Third one is Data which include the Excel file which contain the data to be used, and the other file is the excel reader which allows to read these data from the file.


**#Second Part #QA Soum API**
This part is created to test the given API.
The Project is a RestAssured project which create with 2 main Packages: main & files
- The first one is main which include class for running the tests, the file contains the test to automate some validation on the given API.
- The second one is the files package which contain the used files in the test it contain a payload class with contain the response that we are validating.
Also there is a Json file called Schema which include converted Json schema, this file is called in the test file to test the schema validation.
