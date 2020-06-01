package Frontend;

import Basis.BasicOperations;
import Pages.Frontend.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import static org.testng.Assert.*;


public class VerifyLandingPage extends BasicOperations {

    BasicOperations  BasicOperations = new BasicOperations();

    @BeforeMethod
    public void OpenChromeFrontend() {

        BasicOperations.OpenChromeFrontend();

    }

    @Test(description = "Top Banner verification", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if all elements are displayed in the top bar, and if they are in expected format")
    public void VerifyTopBanner() {

        LandingPage LandingPage = new LandingPage();

        assertTrue(LandingPage.mainHeader.isDisplayed());
        assertTrue(LandingPage.topHeader.isDisplayed());
        assertTrue(LandingPage.currencyDropdown.isDisplayed());
        assertEquals(LandingPage.currencyFont,"13px");
        LandingPage.currencyDropdown.click();
        assertTrue(LandingPage.languageOptionUSD.isDisplayed());
        assertTrue(LandingPage.languageOptionGBP.isDisplayed());
        assertTrue(LandingPage.languageOptionSAR.isDisplayed());
        assertTrue(LandingPage.languageOptionEUR.isDisplayed());
        assertTrue(LandingPage.languageOptionPKR.isDisplayed());
        assertTrue(LandingPage.languageOptionKWD.isDisplayed());
        assertTrue(LandingPage.languageOptionJPY.isDisplayed());
        assertTrue(LandingPage.languageOptionINR.isDisplayed());
        assertTrue(LandingPage.languageOptionCNY.isDisplayed());
        assertTrue(LandingPage.languageOptionTRY.isDisplayed());
        assertTrue(LandingPage.languageOptionRUB.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(LandingPage.languageDropdown.isDisplayed());
        assertTrue(LandingPage.flagImage.isDisplayed());
        assertEquals(LandingPage.flagFont,"13px");
        LandingPage.languageDropdown.click();
        assertTrue(LandingPage.languageOptionVietnamese.isDisplayed());
        assertTrue(LandingPage.languageOptionRussian.isDisplayed());
        assertTrue(LandingPage.languageOptionEnglish.isDisplayed());
        assertTrue(LandingPage.languageOptionArabic.isDisplayed());
        assertTrue(LandingPage.languageOptionFarsi.isDisplayed());
        assertTrue(LandingPage.languageOptionTurkish.isDisplayed());
        assertTrue(LandingPage.languageOptionFrench.isDisplayed());
        assertTrue(LandingPage.languageOptionSpanish.isDisplayed());
        assertTrue(LandingPage.languageOptionGerman.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(LandingPage.myAccDropdown.isDisplayed());
        assertTrue(LandingPage.myAccIcon.isDisplayed());
        assertEquals(LandingPage.myAccFont,"13px");
        LandingPage.myAccDropdown.click();
        assertTrue(LandingPage.loginBtn.isDisplayed());
        assertTrue(LandingPage.signUp.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(LandingPage.headerNavigation.isDisplayed());
        assertTrue(LandingPage.HomeOption.isDisplayed());
        assertEquals(LandingPage.HomeOptionFont,"13px");
        assertTrue(LandingPage.VisaOption.isDisplayed());
        assertEquals(LandingPage.VisaOptionFont,"13px");
        assertTrue(LandingPage.CompanyOption.isDisplayed());
        assertEquals(LandingPage.CompanyOptionFont,"14px");
        assertTrue(LandingPage.PhoneNumber.isDisplayed());
        assertEquals(LandingPage.PhoneNumberFont,"13px");
        assertEquals(LandingPage.PhoneNumberText,"phone Call Now : +1-234-56789");
    }

    @Test(description = "Search Modal verification", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if search modal displays and if all elements on the top of it are present")
    public void VerifySearchModal() {

        LandingPage LandingPage = new LandingPage();

        assertTrue(LandingPage.holsModal.isDisplayed());
        assertTrue(LandingPage.hotels.isDisplayed());
        assertTrue(LandingPage.flights.isDisplayed());
        assertTrue(LandingPage.tours.isDisplayed());
        assertTrue(LandingPage.cars.isDisplayed());
        assertTrue(LandingPage.visa.isDisplayed());
    }

    @Test(description = "Currency change to GBP", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if currency can be changed to GBP")
    public void canChangeCurrencyToGBP()  {

        LandingPage LandingPage = new LandingPage();
        LandingPage.canChangeCurrencyToGBP();

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        String Expected = "GBP";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();

        assertEquals(Expected,Actual);
    }

    @Test(description = "Currency change to SAR", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify if currency can be changed to SAR")
    public void canChangeCurrencyToSAR(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.canChangeCurrencyToSAR();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "ريال";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to EUR", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify if currency can be changed to EUR")
    public void canChangeCurrencyToEUR(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToEUR();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "EUR";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to PKR", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify if currency can be changed to PKR")
    public void canChangeCurrencyToPKR(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToPKR();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "RS";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to KWD", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify if currency can be changed to KWD")
    public void canChangeCurrencyToKWD(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToKWD();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "KWD";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to JPY", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify if currency can be changed to JPY")
    public void canChangeCurrencyToJPY(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToJPY();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "JPY";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to INR", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify if currency can be changed to INR")
    public void canChangeCurrencyToINR(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToINR();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "INR";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to CNY", priority = 1)
    @Description("Verify if currency can be changed to CNY")
    public void canChangeCurrencyToCNY(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToCNY();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "CNY";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to TRY", priority = 1)
    @Description("Verify if currency can be changed to TRY")
    public void canChangeCurrencyToTRY(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToTRY();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "TURKISH";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Currency change to RUB", priority = 1)
    @Description("Verify if currency can be changed to RUB")
    public void canChangeCurrencyToRUB(){

        LandingPage LandingPage = new LandingPage();

        LandingPage.canChangeCurrencyToRUB();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String Expected = "RUB";
        String Actual = driver.findElement(By.className("dropdown-currency")).getText();
        assertEquals(Expected,Actual);

    }

    @Test(description = "Elements Verification for Hotels Element", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify attribute of class for the hotels element")
    public void elementsPresentForHotels(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.hotelsClicked();

        String expected = "text-center hotels active";
        String actual = LandingPage.hotels.getAttribute("Class");
        assertEquals(expected, actual);
    }

    @Test(description = "Elements Verification for Flights Element", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify attribute of class for the flights element")
    public void elementsPresentForFlights(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.flightsClicked();

        String expected = "text-center flights  active";
        String actual = LandingPage.flights.getAttribute("Class");
        assertEquals(expected, actual);

    }

    @Test(description = "Elements Verification for Tours Element", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify attribute of class for the tours element")
    public void elementsPresentForTours(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.toursClicked();

        String expected = "text-center tours  active";
        String actual = LandingPage.tours.getAttribute("Class");
        assertEquals(expected,actual);

    }

    @Test(description = "Elements Verification for Cars Element", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify attribute of class for the cars element")
    public void elementsPresentForCars(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.carsClicked();

        String expected = "text-center cars  active";
        String actual = LandingPage.cars.getAttribute("Class");
        assertEquals(expected,actual);




    }

    @Test(description = "Elements Verification for Visa Element", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify attribute of class for the visa element")
    public void elementsPresentForVisa(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.visaClicked();

        String expected = "text-center visa  active";
        String actual = LandingPage.visa.getAttribute("Class");
        assertEquals(expected,actual);
    }

    @Test(description = "Element verification for Hotels modal", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify if correct elements are present when modal reloads to Hotels")
    public void elementsForHotels() {

        LandingPage LandingPage = new LandingPage();
        LandingPage.hotelsClicked();

        WebElement destinationSearch = driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[1]/div/div[2]"));
        WebElement checkin = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-hotel\"]/div[1]/div/div[2]"));
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-hotel\"]/div[2]/div/div[2]"));
        WebElement adult = driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[1]/div/div[2]"));
        WebElement child = driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div/div/div/div/div[2]/div/div[2]"));
        WebElement searchBtn = LandingPage.searchBtn;

        assertTrue(destinationSearch.isDisplayed());
        assertTrue(checkin.isDisplayed());
        assertTrue(checkout.isDisplayed());
        assertTrue(adult.isDisplayed());
        assertTrue(child.isDisplayed());
        assertTrue(searchBtn.isDisplayed());
    }

    @Test(description = "Element verification for Flights modal", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if correct elements are present when modal reloads to Flights")
    public void elementsForFlights() {

        LandingPage LandingPage = new LandingPage();
        LandingPage.flightsClicked();

        WebElement flightType = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]"));
        WebElement oneWay = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div/div[1]"));
        WebElement oneWayRadioBtn = driver.findElement(By.className("oneway"));
        WebElement roundTrip = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[1]/div[1]/div/div[2]/label"));
        WebElement roundTripRadioBtn = driver.findElement(By.id("flightSearchRadio-1"));
        WebElement flightclass = driver.findElement(By.className("flightclass"));
        WebElement from = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[1]/div/div[1]/div/div[2]"));
        WebElement to = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[1]/div/div[2]/div/div[2]"));
        WebElement deptDate = driver.findElement(By.name("departure_date"));
        WebElement adult = driver.findElement(By.name("fadults"));
        WebElement child = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[2]/div/div[2]"));
        WebElement infant = driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div[3]/div[3]/div/div/div[3]/div/div[2]"));
        WebElement searchBtn = LandingPage.searchBtn;

        String flightClassExpectedValue = "Economy";
        String flightClassActualValue = flightclass.getText();
        String fromExpected = "NYC";
        String fromActual = from.getText();
        String toExpected = "MIA";
        String toActual = to.getText();

        assertTrue(flightType.isDisplayed());
        assertTrue(oneWay.isDisplayed());
        assertTrue(oneWayRadioBtn.isSelected());
        assertTrue(roundTrip.isDisplayed());
        assertFalse(roundTripRadioBtn.isSelected());
        assertTrue(flightclass.isDisplayed());
        assertEquals(flightClassActualValue,flightClassExpectedValue);
        assertTrue(from.isDisplayed());
        assertEquals(fromExpected,fromActual);
        assertTrue(to.isDisplayed());
        assertEquals(toExpected,toActual);
        assertTrue(deptDate.isDisplayed());
        assertTrue(adult.isDisplayed());
        assertTrue(child.isDisplayed());
        assertTrue(infant.isDisplayed());
        assertTrue(searchBtn.isDisplayed());


        BasicOperations.takeScreenshot();
    }

    @Test(description = "Element verification for Tours modal", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if correct elements are present when modal reloads to Tours")
    public void elementsForTours() {

        LandingPage LandingPage = new LandingPage();
        LandingPage.toursClicked();

        WebElement destination = driver.findElement(By.xpath("//*[@id=\"tours\"]/div/div/form/div/div/div[1]/div/div[2]"));
        WebElement fromDate = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-hotel\"]/div/div[2]"));
        WebElement toDate = driver.findElement(By.xpath("//*[@id=\"airDatepickerRange-hotel\"]/div/div[2]"));
        WebElement searchBtn = LandingPage.searchBtn;


        assertTrue(destination.isDisplayed());
        assertTrue(fromDate.isDisplayed());
        assertTrue(toDate.isDisplayed());
        assertTrue(searchBtn.isDisplayed());


    }

    @Test(description = "Element verification for Cars modal", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if correct elements are present when modal reloads to Cars")
    public void elementsForCars() {

        LandingPage LandingPage = new LandingPage();
        LandingPage.carsClicked();

        WebElement pickupLoc = driver.findElement(By.xpath("//*[@id=\"cars\"]/div/div/form/div/div/div[1]/div/div"));
        WebElement dropoffLoc = driver.findElement(By.xpath("//*[@id=\"cars\"]/div/div/form/div/div/div[2]/div/div"));
        WebElement departDate = driver.findElement(By.name("pickupdate"));
        WebElement searchBtn = LandingPage.searchBtn;

        String pageSource = driver.getPageSource();
        String expectedDepTime = "Depart  Time";
        String expectedRetDate = "Return  Date";
        String expectedRetTime = "Return  Time";


        assertTrue(pickupLoc.isDisplayed());
        assertTrue(dropoffLoc.isDisplayed());
        assertTrue(departDate.isDisplayed());
        assertTrue(pageSource.contains(expectedDepTime));
        assertTrue(pageSource.contains(expectedRetDate));
        assertTrue(pageSource.contains(expectedRetTime));
        assertTrue(searchBtn.isDisplayed());
    }

    @Test(description = "Element verification for Visa modal", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if correct elements are present when modal reloads to Visa")
    public void elementsForVisa() {

        LandingPage LandingPage = new LandingPage();
        LandingPage.visaClicked();


    }

    @AfterMethod
    public void Close() {

        BasicOperations.takeScreenshot();
        BasicOperations.Close();
    }

    @AfterSuite
    public void runAllure() {

        BasicOperations.runAllure();

    }
}
