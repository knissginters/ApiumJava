package stepsDefinitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Allure;
import pages.*;
import pages.basePage.BasePage;
import java.util.List;
import java.util.Map;

public class CreateSoundId {
    @Given("I have configured Mocked english Environment")
    public void iHaveConfiguredMockedEnglishEnvironment(){
        SetEnvironmentSteps.iAmInConfigureEnvironmentPage();
        SetEnvironmentSteps.iSelectDeviceMockButton();
        SetEnvironmentSteps.iSelectQAServer();
        SetEnvironmentSteps.iSelectEnglishLanguage();
        SetEnvironmentSteps.iSelectOpenSoundIDDefaultThemeButton();
        SetEnvironmentSteps.iSeeLoadingPageForACoupleOfSeconds();
        SetEnvironmentSteps.iSelectGetStartedButton();
        BasePage.getOneEarbudInBoxDismissButton();
        BasePage.waitUntilErrorAppears("Headphones connected!");
    }

    @And("I am in My SoundID page")
    public void iAmInMySoundIDPage() {
        Allure.addAttachment("Console log: ", "I am in My SoundID page");
        MySoundidPage.getCreateSoundidButton().isDisplayed();
        MySoundidPage.getCreateSoundidButton().isDisplayed();
    }

    @And("No soundId should exist")
    public void noSoundIdShouldExist() {
        MySoundidPage.getNoSoundidProfileYetBanner().isDisplayed();
    }

    @When("I select Create SoundID button")
    public void iSelectCreateSoundIDButton() {
        MySoundidPage.getCreateSoundidButton().click();
    }

    @And("I see the tutorial description:")
    public void iSeeTheTutorialDescription(List<String>text) {
        for (String anObject : text) {
            BasePage.getDescription(anObject).isDisplayed();
        }
    }

    @And("I select start test button")
    public void siSelectStartTestButton() {
        TutorialPage.getStartTestButton().isDisplayed();
        TutorialPage.getStartTestButton().click();
    }

    @And("I chose Track and Continue")
    public void iChoseTrackAndContinue(String track) {
    TrackPage.getTrackList(track).click();
    TrackPage.getContinueButton().click();

    }

    @And("I do The preference test")
    public void iDoThePreferenceTest() {
        int incrementPercentage = 0;
        for(int PreferenceTestStep = 1; PreferenceTestStep < 9; PreferenceTestStep++) {
            PreferenceTestPage.getAbButton().isDisplayed();
            PreferenceTestPage.getNextStepButton().isDisplayed();
            PreferenceTestPage.getPauseButton().isDisplayed();
            PreferenceTestPage.getNextStepButton().click();
            PreferenceTestPage.getDoneIndicator(String.valueOf(incrementPercentage)).isDisplayed();
            PreferenceTestPage.getAbButton().click();
            PreferenceTestPage.getNextStepButton().click();
            if(PreferenceTestStep % 2 == 0) {
                incrementPercentage = incrementPercentage + 12;
            }
            else{
                incrementPercentage = incrementPercentage + 13;
            }
        }
    }


    @And("The First track list are visible and the Second track list ar not visible")
    public void theFirstTrackListAreVisibleAndTheSecondTrackListArNotVisible(List<Map<String, String>> trackListTable) {
        TrackPage.getContinueButton().isDisplayed();
        for (Map<String, String> anObject : trackListTable) {
            TrackPage.getTrackList(anObject.get("First track list")).isDisplayed();
        }
    }

    @Then("I see the profile creation page")
    public void iSeeTheProfileCreationPage(List<String>text) {
        for (String anObject : text) {
            BasePage.getDescription(anObject).isDisplayed();
        }
    }

    @And("I see the profile uploading")
    public void iSeeTheProfileUploading() {
       MySoundidPage.getSoundIdToggleState("Uploading...").isDisplayed();
    }


    @And("^I see SoundID toggle (.*)")
    public void iSeeSoundIDToggle(String toggleState) {
        MySoundidPage.getSoundIdToggleState(toggleState).isDisplayed();
    }

    @And("I have created a SoundID")
    public void iHaveCreatedASoundID() {
        MySoundidPage.getCreateSoundidButton().click();
        TutorialPage.getStartTestButton().click();
        TrackPage.getTrackList("Cymatics").click();
        TrackPage.getContinueButton().click();
        iDoThePreferenceTest();

    }
    @When("I select Retake test button")
    public void iSelectRetakeTestButton() {
        MySoundidPage.getRetakeTestButton().isDisplayed();
        MySoundidPage.getRetakeTestButton().click();
    }
}
