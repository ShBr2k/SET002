package com.company.SeleniumTest01; //demo at 10.00 room 4131

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * DSMOMSCatalogTest provide testing of functionality application:
 *
 * Check elements on the page
 * Test login user
 * Test select of donors
 * Test add|remove donor from cart
 *
 * @author Roman Shamakhin
 * @version 0.21 26 Oct 2019
 */

public class DSMOMSCatalogTest {

    private static WebDriver webDriver;
    private static final String APP_URL = "https://ds.first-egg-bank.com/catalog-6291/#donors";
    private static long start_time;


    private static void setChromeDriverProperty() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/User/IdeaProjects/zJars/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:/Users/ShBr2k/IdeaProjects/zJars/chromedriver.exe");

    }


    @BeforeClass
    public static void prepareApplication() {

        setChromeDriverProperty();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        start_time = System.currentTimeMillis();

    }


    /* Check opened default page */
    @Test(priority = 1)
    public static void launchApplication() {

        webDriver.get(APP_URL);
        WebElement topSlider = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='slider-wrapper-panel']")));
        Assert.assertTrue(topSlider.isDisplayed());

    }


    /* Checking elements at default page */
    @Test(priority = 2)
    public static void defaultPage() {

        // Check amount of LogoImage
        int logoImageCount = webDriver.findElements(By.xpath("//img[contains (@src,'company-logo')]")).size();
        Assert.assertEquals(logoImageCount, 2);

        // Check amount of SloganImage
        int sloganImageCount = webDriver.findElements(By.xpath("//img[contains (@src,'slogan')]")).size();
        Assert.assertEquals(sloganImageCount, 1);

        // Check name of the catalog
        WebElement catalogName = webDriver.findElement(By.xpath("//div[contains(text(),'GALLERY OF MOM')]"));
        Assert.assertTrue(catalogName.isDisplayed());

        // Check default image of donor
        WebElement defaultDonorImage = webDriver.findElement(By.xpath("//img[contains(@src,'preview')]"));
        Assert.assertTrue(defaultDonorImage.isDisplayed());

        // Check Email address
        WebElement bottomValueEmail = webDriver.findElement(By.xpath("//div[contains(text(),'Email')]/following-sibling::div"));
        Assert.assertEquals(bottomValueEmail.getText(), "info@first-egg-bank.com");

        // Check name of Skype account
        WebElement bottomValueSkype = webDriver.findElement(By.xpath("//div[contains(text(),'Skype')]/following-sibling::div"));
        Assert.assertEquals(bottomValueSkype.getText(), "first-egg-bank");

        // Check login button
        WebElement loginButton = webDriver.findElement(By.xpath("//div[contains(text(),'Log in')]"));
        Assert.assertTrue(loginButton.isDisplayed());

        loginButton.click();

    }


    /* Checking elements on login form */
    @Test(priority = 3)
    public static void loginForm() {

        // Check loginForm with caption "Login Form"
        WebElement loginFormCaption = webDriver.findElement(By.xpath("//div[@class='feb-abstract-dialog']//div[@class='Caption']"));
        Assert.assertEquals(loginFormCaption.getText(), "Login Form");

        // Check 'User Name' Input
        WebElement userNameInput = webDriver.findElement(By.xpath("//input[@name='username']"));
        Assert.assertTrue(userNameInput.isDisplayed());

        // Check 'Password' Input
        WebElement passwordInput = webDriver.findElement(By.xpath("//input[@name='password']"));
        Assert.assertTrue(passwordInput.isDisplayed());

        // Check 'Log In' Button
        WebElement loginButton = webDriver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        Assert.assertTrue(loginButton.isDisplayed());

        // Check 'Cancel' Button
        WebElement cancelButton = webDriver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
        Assert.assertTrue(cancelButton.isDisplayed());

        // Run 'doLogin' method with temporary credentials
        doLogin("ShBr2k", "#ILoveYouMom#");

    }


    /* Checking for successful login and main page of catalog is showing */
    @Test(priority = 4)
    public static void catalogPage() {

        // Check 'logout' Button
        WebElement logOutButton = new WebDriverWait(webDriver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Logout')]")));
        Assert.assertTrue(logOutButton.isDisplayed());

        // Check amount (10) of images of donor
        WebElement tenDonorImage = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='container-fluid']/div/div[10]//img[contains(@src,'preview')]")));
        Assert.assertTrue(tenDonorImage.isDisplayed());

        //Just Demo. Scroll down page.
        for (int i = 0; i < 100; i++) {
            ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,20)");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    /* Select VL0893 donor and add it to the cart */
    @Test(priority = 5)
    public static void selectDonor01() {
        selectDonor("VL0893");

    }


    /* Select MZ0693 donor and add it to the cart */
    @Test(priority = 6)
    public static void selectDonor02() {
        selectDonor("MZ0693");

    }


    /* Add|Remove donor from to cart */
    @Test(priority = 7)
    public static void orderDonor() {

        // Go to cart
        WebElement gotoCartButton = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='header-panel']//div[contains(text(),'Cart')]")));
        gotoCartButton.click();

        // Check opened cart
        WebElement confirmSelectionButton = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Confirm selection')]")));
        Assert.assertTrue(confirmSelectionButton.isDisplayed());

        // Check amount of donors in cart
        int donorImagesCount = webDriver.findElements(By.xpath("//div[@class='container-fluid']//img[contains(@src,'preview')]")).size();
        Assert.assertEquals(donorImagesCount, 2);

        // Write some notes
        WebElement commentTextArea = webDriver.findElement(By.xpath("//textarea[contains(@class,'comment')]"));
        commentTextArea.clear();
        commentTextArea.sendKeys("Added to cart two donors: VL0893, MZ0693.\nBoth donors will be removed from cart.");

        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,-250)");

        //Just demo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Remove VL0893 donor from order
        WebElement removeButton;
        removeButton = webDriver.findElement(By.xpath("//div[contains(text(),'VL0893')]/../../div[contains(@class,'gwt-HTML')][contains(text(),'Remove')]"));
        removeButton.click();

        // Remove MZ0693 donor from order
        removeButton = webDriver.findElement(By.xpath("//div[contains(text(),'MZ0693')]/../../div[contains(@class,'gwt-HTML')][contains(text(),'Remove')]"));
        removeButton.click();

        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,-150)");

        // Just demo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return to the catalog
        webDriver.findElement(By.cssSelector("div[class*='lbl-back-to-catalog']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='Donor ID']")).clear();
        webDriver.findElement(By.xpath("//input[@placeholder='Donor ID']")).sendKeys(Keys.RETURN);

        // Just demo
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /* Close browser */
    @AfterClass(alwaysRun = true)
    public static void closeBrowser() {

        if (webDriver != null)
            webDriver.quit();
        System.out.println("\nPassed time, sec: " + (System.currentTimeMillis() - start_time) / 1000);

    }


    /* Do login of user*/
    private static void doLogin(String login, String password) {

        WebElement userNameInput = webDriver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordInput = webDriver.findElement(By.xpath("//input[@name='password']"));
        WebElement logInButton = webDriver.findElement(By.xpath("//button[contains(text(),'Log in')]"));

        userNameInput.clear();
        userNameInput.sendKeys(login);
        passwordInput.clear();
        passwordInput.sendKeys(password);
        logInButton.click();

    }


    /* Select a donor from the catalog and add it to the cart */
    private static void selectDonor(String donorID) {

        // Input donor ID
        WebElement donorIDInput = webDriver.findElement(By.xpath("//input[@placeholder='Donor ID']"));
        donorIDInput.clear();
        donorIDInput.sendKeys(donorID);

        // Check amount of showing donors
        int donorImagesCount = webDriver.findElements(By.xpath("//img[contains(@src,'preview')]")).size();
        Assert.assertEquals(donorImagesCount, 1);

        // Select a donor
        WebElement selectedDonorImage = webDriver.findElement(By.xpath("//img[contains(@src,'preview')]"));
        selectedDonorImage.click();

        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,250)");

        // Check opened donor profile page
        WebElement personalProfileLabel = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'gwt-HTML')][contains(text(),'Personal profile')]")));
        Assert.assertTrue(personalProfileLabel.isDisplayed());

        // Add donor to cart
        WebElement selectDonorButton = webDriver.findElement(By.xpath("//button[contains(text(),'Select a donor')]"));
        selectDonorButton.click();

        // Continue selection
        WebElement continueSelectionButton = new WebDriverWait(webDriver, 60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='feb-abstract-dialog']//button[contains(text(),'Continue selection')]")));
        continueSelectionButton.click();

    }

}