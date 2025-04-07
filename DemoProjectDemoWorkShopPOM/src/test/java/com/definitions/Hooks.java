package com.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.utilities.HelperClass;

public class Hooks {

    private static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) {
        HelperClass.setUpDriver();
        logger.info("Scenario started: " + scenario.getName());
    }

    @After
//    public void tearDown(Scenario scenario) {
//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "Failure Screenshot");
//            logger.error("Scenario failed: " + scenario.getName());
//        } else {
//            logger.info("Scenario passed: " + scenario.getName());
//        }
//
//        HelperClass.tearDown();
//    }
    
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            File screenshotFile = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.FILE);

            try {
                File destinationFile = new File("screenshots/" + scenario.getName().replaceAll(" ", "_") + ".png");
                FileUtils.copyFile(screenshotFile, destinationFile);
            } catch (IOException e) {
                logger.error("Failed to save screenshot: " + e.getMessage());
            }

            byte[] screenshotBytes = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", "Failure Screenshot");
            logger.error("Scenario failed: " + scenario.getName());
        } else {
            logger.info("Scenario passed: " + scenario.getName());
        }

        HelperClass.tearDown();
    }

}
