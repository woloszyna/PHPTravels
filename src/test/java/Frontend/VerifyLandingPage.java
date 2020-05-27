package Frontend;

import Basis.BasicOperations;
import Basis.utils.TestListener;
import Pages.Frontend.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;


@Listeners({ TestListener.class })//Adds listener for  allure report (Add this to each test class)
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

        Assert.assertTrue(LandingPage.mainHeader.isDisplayed());
        Assert.assertTrue(LandingPage.topHeader.isDisplayed());
        Assert.assertTrue(LandingPage.currencyDropdown.isDisplayed());
        Assert.assertEquals(LandingPage.currencyFont,"13px");
        LandingPage.currencyDropdown.click();
        Assert.assertTrue(LandingPage.languageOptionUSD.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionGBP.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionSAR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionEUR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionPKR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionKWD.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionJPY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionINR.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionCNY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionTRY.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionRUB.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.languageDropdown.isDisplayed());
        Assert.assertTrue(LandingPage.flagImage.isDisplayed());
        Assert.assertEquals(LandingPage.flagFont,"13px");
        LandingPage.languageDropdown.click();
        Assert.assertTrue(LandingPage.languageOptionVietnamese.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionRussian.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionEnglish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionArabic.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionFarsi.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionTurkish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionFrench.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionSpanish.isDisplayed());
        Assert.assertTrue(LandingPage.languageOptionGerman.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.myAccDropdown.isDisplayed());
        Assert.assertTrue(LandingPage.myAccIcon.isDisplayed());
        Assert.assertEquals(LandingPage.myAccFont,"13px");
        LandingPage.myAccDropdown.click();
        Assert.assertTrue(LandingPage.loginBtn.isDisplayed());
        Assert.assertTrue(LandingPage.signUp.isDisplayed());

        BasicOperations.takeScreenshot();

        Assert.assertTrue(LandingPage.headerNavigation.isDisplayed());
        Assert.assertTrue(LandingPage.HomeOption.isDisplayed());
        Assert.assertEquals(LandingPage.HomeOptionFont,"13px");
        Assert.assertTrue(LandingPage.VisaOption.isDisplayed());
        Assert.assertEquals(LandingPage.VisaOptionFont,"13px");
        Assert.assertTrue(LandingPage.CompanyOption.isDisplayed());
        Assert.assertEquals(LandingPage.CompanyOptionFont,"14px");
        Assert.assertTrue(LandingPage.PhoneNumber.isDisplayed());
        Assert.assertEquals(LandingPage.PhoneNumberFont,"13px");
        Assert.assertEquals(LandingPage.PhoneNumberText,"phone Call Now : +1-234-56789");
    }

    @Test(description = "Search Modal verification", priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if search modal displays and if all elements on the top of it are present")
    public void VerifySearchModal() {

        LandingPage LandingPage = new LandingPage();

        Assert.assertTrue(LandingPage.holsModal.isDisplayed());
        Assert.assertTrue(LandingPage.hotels.isDisplayed());
        Assert.assertTrue(LandingPage.flights.isDisplayed());
        Assert.assertTrue(LandingPage.tours.isDisplayed());
        Assert.assertTrue(LandingPage.cars.isDisplayed());
        Assert.assertTrue(LandingPage.visa.isDisplayed());
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

        Assert.assertEquals(Expected,Actual);
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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

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
        Assert.assertEquals(Expected,Actual);

    }

    @Test(description = "Elements Verification for Hotels Element", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify attribute of class for the hotels element")
    public void elementsPresentForHotels(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.hotelsClicked();

        String expected = "text-center hotels active";
        String actual = LandingPage.hotels.getAttribute("Class");
        Assert.assertEquals(expected, actual);
    }

    @Test(description = "Elements Verification for Flights Element", priority = 1)
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Verify attribute of class for the flights element")
    public void elementsPresentForFlights(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.flightsClicked();

        String expected = "text-center flights  active";
        String actual = LandingPage.flights.getAttribute("Class");
        Assert.assertEquals(expected, actual);

    }

    @Test(description = "Elements Verification for Tours Element", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify attribute of class for the tours element")
    public void elementsPresentForTours(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.toursClicked();

        String expected = "text-center tours  active";
        String actual = LandingPage.tours.getAttribute("Class");
        Assert.assertEquals(expected,actual);

    }

    @Test(description = "Elements Verification for Cars Element", priority = 1)
    @Severity(SeverityLevel.MINOR)
    @Description("Verify attribute of class for the cars element")
    public void elementsPresentForCars(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.carsClicked();

        String expected = "text-center cars  active";
        String actual = LandingPage.cars.getAttribute("Class");
        Assert.assertEquals(expected,actual);




    }

    @Test(description = "Elements Verification for Visa Element", priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify attribute of class for the visa element")
    public void elementsPresentForVisa(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.visaClicked();

        String expected = "text-center visa  active";
        String actual = LandingPage.visa.getAttribute("Class");
        Assert.assertEquals(expected,actual);
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

        Assert.assertTrue(destinationSearch.isDisplayed());
        Assert.assertTrue(checkin.isDisplayed());
        Assert.assertTrue(checkout.isDisplayed());
        Assert.assertTrue(adult.isDisplayed());
        Assert.assertTrue(child.isDisplayed());
        Assert.assertTrue(searchBtn.isDisplayed());
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

        Assert.assertTrue(flightType.isDisplayed());
        Assert.assertTrue(oneWay.isDisplayed());
        Assert.assertTrue(oneWayRadioBtn.isSelected());
        Assert.assertTrue(roundTrip.isDisplayed());
        Assert.assertFalse(roundTripRadioBtn.isSelected());
        Assert.assertTrue(flightclass.isDisplayed());
        Assert.assertEquals(flightClassActualValue,flightClassExpectedValue);
        Assert.assertTrue(from.isDisplayed());
        Assert.assertEquals(fromExpected,fromActual);
        Assert.assertTrue(to.isDisplayed());
        Assert.assertEquals(toExpected,toActual);
        Assert.assertTrue(deptDate.isDisplayed());
        Assert.assertTrue(adult.isDisplayed());
        Assert.assertTrue(child.isDisplayed());
        Assert.assertTrue(infant.isDisplayed());
        Assert.assertTrue(searchBtn.isDisplayed());


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


        Assert.assertTrue(destination.isDisplayed());
        Assert.assertTrue(fromDate.isDisplayed());
        Assert.assertTrue(toDate.isDisplayed());
        Assert.assertTrue(searchBtn.isDisplayed());


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
        //WebElement departTime = driver.findElement(By.name("timeDepart"));
        WebElement departTime = driver.findElement(By.className("bx-time"));
        WebElement returnDate = driver.findElement(By.name("dropoffdate"));
        WebElement returnTime = driver.findElement(By.name("timeReturn"));
        WebElement searchBtn = LandingPage.searchBtn;

        Assert.assertTrue(pickupLoc.isDisplayed());
        Assert.assertTrue(dropoffLoc.isDisplayed());
        Assert.assertTrue(departDate.isDisplayed());
        Assert.assertTrue(departTime.isDisplayed());
        Assert.assertTrue(returnDate.isDisplayed());
        Assert.assertTrue(returnTime.isDisplayed());
        Assert.assertTrue(searchBtn.isDisplayed());
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
