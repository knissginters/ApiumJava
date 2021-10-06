package stepsDefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EnvironmentSettingsPage;
import pages.MySoundidPage;
import pages.WelcomePage;
import setups.Capabilities;

public class SetEnvironmentSteps extends Capabilities {
    @Before({"@RunServer"})
    public void setup()throws Exception{
        preparation();
    }

    @Given("^I am in Configure Environment page$")
    public void iAmInConfigureEnvironmentPage() {
        EnvironmentSettingsPage.getLanguageButtonENG().isDisplayed();
        EnvironmentSettingsPage.getOpenSoundidDefaultThemeButton().isDisplayed();
    }

    @When("^I select English language$")
    public void iSelectEnglishLanguage() {
        EnvironmentSettingsPage.getLanguageButtonENG().click();
    }

    @And("^I select Open SoundID default theme button$")
    public void iSelectOpenSoundIDDefaultThemeButton() {
        EnvironmentSettingsPage.getOpenSoundidDefaultThemeButton().click();
    }
    @And("^I select Get started button$")
    public void iSelectGetStartedButton() {
        WelcomePage.getGetStartedButton().click();
    }
    @Then("^I see My SoundID page$")
    public void iSeeMySoundIDPage() {
       MySoundidPage.getCreateSoundidButton().isDisplayed();
    }

    @And("^the language is english$")
    public void theLanguageIsEnglish() {
        MySoundidPage.getNoSoundidProfileTetBanner().isDisplayed();
    }

    @And("^I select Device mock button$")
    public void iSelectDeviceMockButton() {
        EnvironmentSettingsPage.getDeviceMockButton().click();
    }
}