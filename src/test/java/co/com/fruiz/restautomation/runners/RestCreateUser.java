package co.com.fruiz.restautomation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/create_user.feature"},
       glue={"co.com.fruiz.restautomation.stepdefinitions", "co.com.fruiz.restautomation.utils"},
        snippets=SnippetType.CAMELCASE)
public class RestCreateUser {

}
