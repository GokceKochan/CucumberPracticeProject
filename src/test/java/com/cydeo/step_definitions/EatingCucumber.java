package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Then("user should se the dash")
    public void user_should_se_the_dash() {
        System.out.println("Try1 ");
    }

    @Given("gice {int}")
    public void gice(Integer int1) {
        // Write code here that turns the phrase above into concrete actionsthrow new io.cucumber.java.PendingException();
    }
    @Given("and {int}")
    public void and(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("then {int}")
    public void then(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    }


}
