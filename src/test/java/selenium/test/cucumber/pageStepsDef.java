package selenium.test.cucumber;
import app.Application;
import io.cucumber.java.en.When;

public class pageStepsDef {

    @When("^we open page \"([^\"]*)\"$")
    public static void openUrl(String url) {
        Application.openUrl(url);
    }

    @When("^click on element with class name - \"([^\"]*)\"$")
    public static void clickOnElement(String name) {
        Application.findElement("class", name);
        Application.clickOnElement();
    }

    @When("^Element with xpath \"([^\"]*)\" is on the page$")
    public static void locateElement(String name) {
        Application.findElement("xpath", name);
    }

    @When("^Close browser$")
    public static void closeBrowser() {
        Application.closeBrowser();
    }
}
