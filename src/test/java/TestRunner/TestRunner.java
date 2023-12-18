package TestRunner;

import Config.BrowserSetup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Features",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
    static {
        System.setProperty("cucumber.object-factory", "cucumber.runtime.java.picocontainer.PicoFactory");
    }
    private static BrowserSetup browserSetup;
    @BeforeClass
    public static void setup() {
        browserSetup = new BrowserSetup();
    }
    @AfterClass
    public static void tearDown() {
        if (browserSetup != null) {
            browserSetup.quitDriver();
        }
    }
}
