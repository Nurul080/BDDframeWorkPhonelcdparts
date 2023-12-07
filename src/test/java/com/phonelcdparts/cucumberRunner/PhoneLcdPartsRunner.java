package com.phonelcdparts.cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin={"pretty","html:target/phonelcdpartReport.html"},		
features="src/test/resources/features",
glue="com.phonelcdparts.stepDefinations",

tags="@sprint2",
snippets=SnippetType.CAMELCASE
		
		)


public class PhoneLcdPartsRunner {

}
