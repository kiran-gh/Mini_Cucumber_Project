package utility;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;




@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions","hooks"},
//        tags = "@accountsPage",
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        publish = true,
        monochrome = true
)
public class TestRunner  {

/*    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Loop to run the tests 5 times
            System.out.println("Running test iteration: " + (i + 1));
            Result result = JUnitCore.runClasses(TestRunner.class); // Your Cucumber test runner class
            if (!result.wasSuccessful()) {
                System.out.println("Test failed in iteration: " + (i + 1));
            }
        }
    }


   The above commented code is used for running the test cases multiple times. It is for observation purpose only not
the actual code.*/
}