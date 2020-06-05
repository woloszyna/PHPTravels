package Basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import javax.imageio.ImageIO;

public class BasicOperations {

    public static WebDriver driver;
    String version = "83";

    public void OpenChromeFrontend() {

        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriverv"+version);
        //System.setProperty("webdriver.chrome.driver", "WebDrivers/Winchromedriverv"+version+".exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
    }

    public void OpenFirefoxFrontend() {
        System.setProperty("webdriver.firefox.driver", "WebDrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/");
        driver.manage().window().maximize();
    }

    public void OpenChromeBackend() {
        System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriverv"+version);
        //System.setProperty("webdriver.chrome.driver", "WebDrivers/Winchromedriverv"+version+".exe");
        driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();
    }

    public void OpenFirefoxBackend() {
        System.setProperty("webdriver.firefox.driver", "WebDrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.phptravels.net/admin");
        driver.manage().window().maximize();
    }

    public void WaitABit()  {

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

    }

    public void takeScreenshot() {
        {
            try {
                Thread.sleep(120);
                Robot r = new Robot();

                Date date = new Date();
                long timestamp = date.getTime();

                // It saves screenshot to desired path
                String path = "ScreenShots/screenshot" + timestamp + ".jpg";

                // Used to get ScreenSize and capture image
                Rectangle capture =
                        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image, "jpg", new File(path));
            } catch (AWTException | IOException | InterruptedException ex) {
                System.out.println(ex);
            }

        }
        System.out.println("Screenshot saved");
    }

    public void runAllure() {

        try {
            Runtime.getRuntime().exec("allure generate --clean /Users/albert.woloszyn/Projects/HighCode/Intellij/PHPTravels/allure-results/");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Close() {

        driver.close();
    }
}
