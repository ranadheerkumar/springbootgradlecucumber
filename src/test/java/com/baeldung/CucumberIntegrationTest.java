package com.baeldung;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/test",
        plugin = {"pretty", "html:build/Destination.html"}
)
public class CucumberIntegrationTest extends SpringIntegrationTest {
}