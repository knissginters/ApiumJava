package stepsDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.*;
import pages.basePage.BasePage;
import setups.Capabilities;
import setups.Utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CreateSoundId {
    private boolean On;

    @Given("I have configured Mocked english Environment")
    public void iHaveConfiguredMockedEnglishEnvironment(){
        SetEnvironmentSteps.iAmInConfigureEnvironmentPage();
        SetEnvironmentSteps.iSelectDeviceMockButton();
        SetEnvironmentSteps.iSelectQAServer();
        SetEnvironmentSteps.iSelectEnglishLanguage();
        SetEnvironmentSteps.iSelectOpenSoundIDDefaultThemeButton();
        SetEnvironmentSteps.iSeeLoadingPageForACoupleOfSeconds();
        SetEnvironmentSteps.iSelectGetStartedButton();
        //BasePage.getOneEarbudInBoxDismissButton();
        BasePage.waitUntilErrorAppears("Headphones connected!");
    }

    @And("I am in My SoundID page")
    public void iAmInMySoundIDPage() {
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
        Utils.wait(10);
        for (String anObject : text) {
            ProfileUploadPage.getDescription(anObject).isDisplayed();
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
        try {
            String PlayerState = TrackPage.getPlayPauseButton(track).getText();
            Assert.assertEquals(PlayerState, "pause");
        } catch (AssertionError e) {
            Assert.fail("Track is not played");
        }
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
        Utils.wait(10);
        TrackPage.getContinueButton().isDisplayed();
        for (Map<String, String> anObject : trackListTable) {
            TrackPage.getTrackList(anObject.get("First track list")).isDisplayed();
        }
    }

    @Then("I see the profile creation and uploading page")
    public void iSeeTheProfileCreationAndUploadingPage(List<String>text) {
        for (String anObject : text) {
            ProfileUploadPage.getDescription(anObject).isDisplayed();
        }
    }

    @And("I select Continue button")
    public void iSelectContinueButton() {
        Assert.assertTrue(ProfileUploadPage.getContinueButton().isDisplayed());
        ProfileUploadPage.getContinueButton().click();
    }


    @And("^I see SoundID toggle (.*)")
    public void iSeeSoundIDToggle(String toggleState) {
        System.out.println(toggleState);
        Assert.assertTrue(MySoundidPage.getSoundIdToggleState().isDisplayed());
        if (toggleState.equals("Enabled")){toggleState = "Turn off SoundID";}else{toggleState ="Turn on SoundID";}
        String actualToggleState = MySoundidPage.getSoundIdToggleState().getText();
        Assert.assertEquals(actualToggleState, toggleState);
    }

    @And("I have created a SoundID")
    public void iHaveCreatedASoundID() {
        MySoundidPage.getCreateSoundidButton().click();
        TutorialPage.getStartTestButton().click();
        Utils.wait(10);
        TrackPage.getTrackList("Cymatics").click();
        TrackPage.getContinueButton().click();
        iDoThePreferenceTest();
    }
    @When("I select Retake test button")
    public void iSelectRetakeTestButton() {
        MySoundidPage.getRetakeTestButton().isDisplayed();
        MySoundidPage.getRetakeTestButton().click();
    }

    @And("I see toggle tutorial text")
    public void iSeeToggleTutorialText() {
        Assert.assertTrue(MySoundidPage.getToggleTryText().isDisplayed());
        Assert.assertTrue(MySoundidPage.getToggleTutorialText().isDisplayed());
    }

    @And("I do not see toggle tutorial text")
    public void iDoNotSeeToggleTutorialText() {
        try {
            Assert.assertFalse(MySoundidPage.getToggleTryText().isDisplayed());
        }catch(Exception e) {
            Assert.assertTrue(true);
        }
        //MySoundidPage.getToggleTutorialText().isDisplayed()
        //Assert.assertFalse(b = );
        //Assert.assertFalse();
    }

    @When("I toggle the SoundID toggle")
    public void iToggleTheSoundIDToggle() {
        MySoundidPage.getSoundIdToggleState().click();
    }
}
