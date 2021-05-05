package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {

    @Given("I am in given block")
    public void i_am_in_given_block() {
        System.out.println("This is Given block");
    }

    @When("I am in When block")
    public void i_am_in_When_block() {
        System.out.println("This is When block");
    }

    @Then("I am in Then block")
    public void i_am_in_Then_block() {
        System.out.println("This is Then block");
    }
}
