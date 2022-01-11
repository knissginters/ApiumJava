package stepsDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EnvironmentSettingsPage;
import pages.LoadingPage;
import pages.MySoundidPage;
import pages.WelcomePage;


public class SetEnvironmentSteps {
    @Given("^I am in Configure Environment page$")
    public static void iAmInConfigureEnvironmentPage() {
        EnvironmentSettingsPage.getLanguageButtonENG().isDisplayed();
        EnvironmentSettingsPage.getOpenSoundidDefaultThemeButton().isDisplayed();
    }

    @When("^I select English language$")
    public static void iSelectEnglishLanguage() {
        EnvironmentSettingsPage.getLanguageButtonENG().click();
    }

    @And("^I select Open SoundID default theme button$")
    public static void iSelectOpenSoundIDDefaultThemeButton() {
        EnvironmentSettingsPage.getOpenSoundidDefaultThemeButton().click();
    }
    @And("^I select Get started button$")
    public static void iSelectGetStartedButton() {
        WelcomePage.getGetStartedButton().click();
    }
    @Then("^I see My SoundID page$")
    public static void iSeeMySoundIDPage() {
       MySoundidPage.getCreateSoundidButton().isDisplayed();
    }

    @And("^the language is english$")
    public static void theLanguageIsEnglish() {
        MySoundidPage.getNoSoundidProfileYetBanner().isDisplayed();
    }

    @And("^I select Device mock button$")
    public static void iSelectDeviceMockButton() {
        EnvironmentSettingsPage.getDeviceMockButton().click();
    }


    @And("I select QA server")
    public static void iSelectQAServer() {
        EnvironmentSettingsPage.getServerQA().click();
    }

    @And("I see loading page for a couple of seconds")
    public static void iSeeLoadingPageForACoupleOfSeconds(){
        LoadingPage.getLoadingSoundIdLogo().isDisplayed();

    }
}