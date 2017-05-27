package jtk.steps.customersupport;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jtk.site.pages.SupportPage;
import jtk.users.User;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.matchers.JUnitMatchers;

/**
 * Created by jubin on 5/27/2017.
 */
public class CustomerSupportSteps {
    private User siteUser;

    @Given("^User \"([^\\\"]*)\" with membership \"([^\\\"]*)\" gets support page$")
    public void user_gets_support_page(String user,boolean isPremium) {
        siteUser = new  User(user);
        siteUser.setCurrentPage(new SupportPage());
        siteUser.setPremium(isPremium);
    }

    @When("^User enter Support for \"([^\\\"]*)\"$")
    public void i_enter_support_for_item(String item) {
        ((SupportPage)siteUser.getCurrentPage()).setSupportItem(item);
        System.out.println("siteUser = " + siteUser);
    }

    @Then("^User should be able to raise a ticket if user is premium member$")
    public void can_user_raise_ticket() {
        String ticketNumber = ((SupportPage)siteUser.getCurrentPage()).raiseTicket(siteUser);
        if (siteUser.isPremium())
            Assert.assertThat("User should be able to raise ticket",ticketNumber, CoreMatchers.notNullValue());
        else Assert.assertThat("Ticket should be null", ticketNumber,CoreMatchers.nullValue());
        System.out.println("\nTicket = " + String.valueOf(ticketNumber)+"\n");

    }

}