package Frontend;

import Basis.BasicOperations;
import Pages.Frontend.LandingPage;
import Pages.Frontend.SearchResultsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VerifyResultsPage extends BasicOperations {

    BasicOperations  BasicOperations = new BasicOperations();

    @BeforeMethod
    public void OpenChromeFrontend() {

        BasicOperations.OpenChromeFrontend();
        LandingPage LandingPage = new LandingPage();
        LandingPage.searchForDestination();

    }

    @Test(description = "Top Banner verification", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if all elements are displayed in the top bar, and if they are in expected format")
    public void VerifyTopBanner() {

        SearchResultsPage SearchResultsPage = new SearchResultsPage();

        assertTrue(SearchResultsPage.mainHeader.isDisplayed());
        assertTrue(SearchResultsPage.topHeader.isDisplayed());
        assertTrue(SearchResultsPage.currencyDropdown.isDisplayed());
        assertEquals(SearchResultsPage.currencyFont,"13px");
        SearchResultsPage.currencyDropdown.click();
        assertTrue(SearchResultsPage.currencyOptionUSD.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionGBP.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionSAR.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionEUR.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionPKR.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionKWD.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionJPY.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionINR.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionCNY.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionTRY.isDisplayed());
        assertTrue(SearchResultsPage.currencyOptionRUB.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(SearchResultsPage.languageDropdown.isDisplayed());
        assertTrue(SearchResultsPage.flagImage.isDisplayed());
        assertEquals(SearchResultsPage.flagFont,"13px");
        SearchResultsPage.languageDropdown.click();
        assertTrue(SearchResultsPage.languageOptionVietnamese.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionRussian.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionEnglish.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionArabic.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionFarsi.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionTurkish.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionFrench.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionSpanish.isDisplayed());
        assertTrue(SearchResultsPage.languageOptionGerman.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(SearchResultsPage.myAccDropdown.isDisplayed());
        assertTrue(SearchResultsPage.myAccIcon.isDisplayed());
        assertEquals(SearchResultsPage.myAccFont,"13px");
        SearchResultsPage.myAccDropdown.click();
        assertTrue(SearchResultsPage.loginBtn.isDisplayed());
        assertTrue(SearchResultsPage.signUpBtn.isDisplayed());

        BasicOperations.takeScreenshot();

        assertTrue(SearchResultsPage.headerNavigation.isDisplayed());
        assertTrue(SearchResultsPage.HomeOption.isDisplayed());
        assertEquals(SearchResultsPage.HomeOptionFont,"13px");
        assertTrue(SearchResultsPage.VisaOption.isDisplayed());
        assertEquals(SearchResultsPage.VisaOptionFont,"13px");
        assertTrue(SearchResultsPage.CompanyOption.isDisplayed());
        assertEquals(SearchResultsPage.CompanyOptionFont,"14px");
        assertTrue(SearchResultsPage.PhoneNumber.isDisplayed());
        assertEquals(SearchResultsPage.PhoneNumberFont,"13px");
        assertEquals(SearchResultsPage.PhoneNumberText,"phone Call Now : +1-234-56789");
    }

    @Test(description = "Search Results Verification", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if all elements are displayed in the results page")
    public void resultsPageVerification() {

        SearchResultsPage SearchResultsPage = new SearchResultsPage();
        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertTrue(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());


    }

    @Test(description = "Filter Search modal Verification", priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify if all elements are displayed within the Filter Search modal")
    public void resultsPageFilterSearchVerification() {

        SearchResultsPage SearchResultsPage = new SearchResultsPage();

        WebElement filterSearchModal = SearchResultsPage.filterSearchModal;
        WebElement sideBarHeader = SearchResultsPage.sideBarHeader;
        String sideBarTitle = SearchResultsPage.sideBarTitle;
        String siderBarTitleExp = "Filter Search";
        WebElement starGrade = SearchResultsPage.starGrade;
        WebElement oneStar = SearchResultsPage.oneStar;
        WebElement twoStars = SearchResultsPage.twoStars;
        WebElement threeStars = SearchResultsPage.threeStars;
        WebElement fourStars = SearchResultsPage.fourStars;
        WebElement fiveStars =SearchResultsPage.fiveStars;
        WebElement priceRange = SearchResultsPage.priceRange;
        WebElement priceOrder = SearchResultsPage.priceOrder;
        WebElement highToLowRBtn = SearchResultsPage.highToLowRBtn;
        WebElement lowToHighRBtn = SearchResultsPage.lowToHighRBtn;
        WebElement filerSearchBtn = SearchResultsPage.filerSearchBtn;

        assertTrue(filterSearchModal.isDisplayed());
        assertTrue(sideBarHeader.isDisplayed());
        assertEquals(sideBarTitle,siderBarTitleExp);
        assertTrue(starGrade.isDisplayed());
        assertTrue(oneStar.isDisplayed());
        assertTrue(twoStars.isDisplayed());
        assertTrue(threeStars.isDisplayed());
        assertTrue(fourStars.isDisplayed());
        assertTrue(fiveStars.isDisplayed());
        assertTrue(priceRange.isDisplayed());
        assertTrue(priceOrder.isDisplayed());
        assertTrue(highToLowRBtn.isDisplayed());
        assertTrue(lowToHighRBtn.isDisplayed());
        assertTrue(filerSearchBtn.isDisplayed());
    }

    @Test(description = "Can operate with One Star", priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if clicking on One Star in the Filter Search Modal will retrieve something")
    public void oneStarRetrievesSomething() {

        SearchResultsPage SearchResultsPage = new  SearchResultsPage();
        SearchResultsPage.searchForOneStar();

        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertFalse(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());

    }

    @Test(description = "Can operate with One Star", priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if clicking on Two Stars in the Filter Search Modal will retrieve something")
    public void twoStarsRetrievesSomething() {

        SearchResultsPage SearchResultsPage = new  SearchResultsPage();
        SearchResultsPage.searchForTwoStars();

        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertTrue(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());

    }

    @Test(description = "Can operate with One Star", priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if clicking on Three Stars in the Filter Search Modal will retrieve something")
    public void threeStarsRetrievesSomething() {

        SearchResultsPage SearchResultsPage = new  SearchResultsPage();
        SearchResultsPage.searchForThreeStars();

        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertTrue(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());

    }

    @Test(description = "Can operate with One Star", priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if clicking on Four Stars in the Filter Search Modal will retrieve something")
    public void fourStarsRetrievesSomething() {

        SearchResultsPage SearchResultsPage = new  SearchResultsPage();
        SearchResultsPage.searchForFourStars();

        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertTrue(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());

    }

    @Test(description = "Can operate with Five Stars", priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify if clicking on Five Stars in the Filter Search Modal will retrieve something")
    public void fiveStarsRetrievesSomething() {

        SearchResultsPage SearchResultsPage = new  SearchResultsPage();
        SearchResultsPage.searchForFiveStars();

        WebElement results = SearchResultsPage.results;
        WebElement viewMoreBtn = SearchResultsPage.viewMoreBtn;

        assertTrue(results.isDisplayed());
        assertTrue(viewMoreBtn.isDisplayed());

    }


    @AfterMethod
    public void Close() {

        BasicOperations.takeScreenshot();
        BasicOperations.Close();
    }

    @AfterSuite
    public void allureReport() {

        BasicOperations.runAllure();

    }

}
