package app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Application {
    private static WebDriver driver;
    private static WebElement element;
    public Application() {
        driver = new ChromeDriver();
    }

    public static void startDriver(){
        driver = new ChromeDriver();
    }
    public static void openUrl(String url) {
        startDriver();
        driver.get(url);
    }

    public static void findElement(String type, String content) {
        switch (type) {
            case "class":
                element = driver.findElement(By.className(content));
                break;
            case "xpath":
                element = driver.findElement(By.xpath(content));
                break;
            default:
                System.out.println("wrong locator type");
                break;
        }

    }

    public static void clickOnElement() {
        element.click();
    }

    public static void closeBrowser() {
        driver.quit();
        driver = null;
    }
}
