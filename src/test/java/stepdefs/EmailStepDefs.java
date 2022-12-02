package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class EmailStepDefs {
    private String email;
    private boolean expect;
    @Given("saya memasukkan email {string}")
    public void saya_memasukkan_email(String string) {
        this.email = string;
//        throw new io.cucumber.java.PendingException();
    }

    @When("saya test formatnya")
    public void saya_test_formatnya() {
        if (this.email != null) {
            this.expect = true;
        } else {
            this.expect = false;
        }
//        throw new io.cucumber.java.PendingException();
    }

    @Then("hasilnya harus {string}")
    public void hasilnya_harus(String string) {
        if (this.expect) {
            assertTrue(expect);
        } else {
            assertFalse(expect);
        }
    }
}