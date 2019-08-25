import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^User is in FLIGHTS$")
    public void userIsInFLIGHTS() {
    }

    @When("^User chooses first location \\(New Lakefront\\)$")
    public void userChoosesFirstLocationNewLakefront() {
    }

    @And("^User chooses final destination \\(New Castle Intl Arpt\\)$")
    public void userChoosesFinalDestinationNewCastleIntlArpt() {
    }

    @And("^User chooses a proper date \\((\\d+)\\.(\\d+)\\.(\\d+)\\)$")
    public void userChoosesAProperDate(int arg0, int arg1, int arg2) {

    }

    @And("^User chooses number of tickets and for whom it is booked \\((\\d+), Adult\\)$")
    public void userChoosesNumberOfTicketsAndForWhomItIsBookedAdult(int arg0) {

    }

    @And("^User chooses whether it is one way or a round trip \\(one way\\)$")
    public void userChoosesWhetherItIsOneWayOrARoundTripOneWay() {


    }

    @And("^User clicks on Search button$")
    public void userClicksOnSearchButton() {

    }

    @Then("^No offer is visible$")
    public void noOfferIsVisible() {
    }

    @And("^Data not found shown$")
    public void dataNotFoundShown() {
    }

    @When("^User chooses first location \\(Lawica Arpt\\)$")
    public void userChoosesFirstLocationLawicaArpt() {

    }

    @And("^User chooses final destination \\(Jorge Newberry\\)$")
    public void userChoosesFinalDestinationJorgeNewberry() {

    }

    @Then("^(\\d+) offers are visible$")
    public void offersAreVisible(int arg0) {

    }

    @And("^There is a possibility of choosing most desired one$")
    public void thereIsAPossibilityOfChoosingMostDesiredOne() {
    }
}
