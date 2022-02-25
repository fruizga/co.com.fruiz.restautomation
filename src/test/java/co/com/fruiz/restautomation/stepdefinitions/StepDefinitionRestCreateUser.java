package co.com.fruiz.restautomation.stepdefinitions;

import co.com.fruiz.restautomation.model.ModelCreateUserRest;
import co.com.fruiz.restautomation.tasks.CreateUserRest;
import co.com.fruiz.restautomation.questions.LastResponseStatusCode;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static co.com.fruiz.restautomation.utils.Constant.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionRestCreateUser {

    @When("^you create an user$")
    public void youCreateAnUser(List<ModelCreateUserRest> modelCreateUserRests) {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(modelCreateUserRests));
    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));

    }

}
