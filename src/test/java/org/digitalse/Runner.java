package org.digitalse;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
		monochrome = true, 
		snippets = SnippetType.CAMELCASE
		)
public class Runner {

}
