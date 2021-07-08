package ccom.cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"ccom.cucu"},
tags = "@test1 or @test3",

plugin = {"pretty","html:target/JSONReports"})
public class TestRunner {

}
