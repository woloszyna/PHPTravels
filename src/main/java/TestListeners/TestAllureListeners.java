package TestListeners;

import Basis.BasicOperations;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestAllureListeners extends BasicOperations implements ITestListener {

    @Attachment(value = "Web Page Screenshot", type = "image/png")
    public byte[] takeScreenshotAllure(WebDriver driver) {
        // Take a screenshot as byte array and return
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Stacktrace", type = "text/plain")
    public static String saveLogsAllure(String message) {
        return message;
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

        takeScreenshotAllure(driver);

    }


    @Override
    public void onTestFailure(ITestResult iTestResult) {

        takeScreenshotAllure(driver);
        saveLogsAllure(iTestResult.getMethod().getConstructorOrMethod().getName());
    }



    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
