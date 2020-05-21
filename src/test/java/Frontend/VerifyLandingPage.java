package Frontend;

import Basis.BasicOperations;
import Pages.Frontend.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifyLandingPage extends BasicOperations {

    BasicOperations  BasicOperations = new BasicOperations();


    @BeforeMethod
    public void OpenChromeFrontend() {

        BasicOperations.OpenChromeFrontend();

    }

    @Test(priority = 1)
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

    @Test(priority = 2)
    public void VerifySearchModal() {

        LandingPage LandingPage = new LandingPage();

        Assert.assertTrue(LandingPage.holsModal.isDisplayed());
        Assert.assertTrue(LandingPage.hotels.isDisplayed());
        Assert.assertTrue(LandingPage.flights.isDisplayed());
        Assert.assertTrue(LandingPage.tours.isDisplayed());
        Assert.assertTrue(LandingPage.cars.isDisplayed());
        Assert.assertTrue(LandingPage.visa.isDisplayed());

        Assert.assertTrue(LandingPage.destinationSearch.isDisplayed());
        Assert.assertTrue(LandingPage.checkin.isDisplayed());
        Assert.assertTrue(LandingPage.checkout.isDisplayed());
        Assert.assertTrue(LandingPage.adult.isDisplayed());
        Assert.assertTrue(LandingPage.child.isDisplayed());
        Assert.assertTrue(LandingPage.searchBtn.isDisplayed());

    }

    @Test(priority = 3)
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

    @Test(priority = 4)
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

    @Test(priority = 5)
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

    @Test(priority = 6)
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

    @Test(priority = 7)
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

    @Test(priority = 8)
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

    @Test(priority = 9)
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

    @Test(priority = 10)
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

    @Test(priority = 11)
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

    @Test(priority = 12)
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

    @Test(priority = 13)
    public void elementsPresentForHotels(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.hotelsClicked();

        String expected = "text-center hotels active";
        String actual = LandingPage.hotels.getAttribute("Class");
        Assert.assertEquals(expected, actual);
    }

    @Test(priority = 14)
    public void elementsPresentForFlights(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.flightsClicked();

        String expected = "text-center flights  active";
        String actual = LandingPage.flights.getAttribute("Class");
        Assert.assertEquals(expected, actual);

    }

    @Test(priority = 15)
    public void elementsPresentForTours(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.toursClicked();

        String expected = "text-center tours  active";
        String actual = LandingPage.tours.getAttribute("Class");
        Assert.assertEquals(expected,actual);

    }

    @Test(priority = 16)
    public void elementsPresentForCars(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.carsClicked();

        String expected = "text-center cars  active";
        String actual = LandingPage.cars.getAttribute("Class");
        Assert.assertEquals(expected,actual);




    }

    @Test(priority = 17)
    public void elementsPresentForVisa(){

        LandingPage LandingPage = new LandingPage();
        LandingPage.visaClicked();

        String expected = "text-center visa  active";
        String actual = LandingPage.visa.getAttribute("Class");
        Assert.assertEquals(expected,actual);
    }

    @AfterMethod
    public void Close() {

        BasicOperations.takeScreenshot();
        BasicOperations.Close();
    }



}
