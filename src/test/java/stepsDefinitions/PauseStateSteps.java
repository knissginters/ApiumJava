package stepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import setups.Utils;

public class PauseStateSteps {

    @When("I go to the track page")
    public void iGoToTheTrackPage() {
        MySoundidPage.getCreateSoundidButton().click();
        Assert.assertTrue(TutorialPage.getStartTestButton().isDisplayed());
        TutorialPage.getStartTestButton().click();
    }

    @And("I play {string} Track")
    public void iPlayDistortedGuitarsTrack(String trackName) {

        Assert.assertTrue(TrackPage.getContinueButton().isDisplayed());
        TrackPage.getTrackList(trackName).click();
        try {
            String PlayerState = TrackPage.getPlayPauseButton(trackName).getText();
            Assert.assertEquals(PlayerState, "pause");
        } catch (AssertionError e) {
            Assert.fail("Track is not played");
        }
    }

    @And("I set the SDK app to background for {int} seconds")
    public void iSetTheSDKAppToBackgroundForSeconds(int Seconds) {
        Utils.setAppToBackground(Seconds);
    }

    @Then("I see the {string} is paused")
    public void iSeeTheTrackIsPaused(String trackName) {
        try {
            String PlayerState = TrackPage.getPlayPauseButton(trackName).getText();
            Assert.assertEquals(PlayerState, "play");
        } catch (AssertionError e) {
           Assert.fail("Track is not paused");
        }
    }

    @When("I go to the Preference test page")
    public void iGoToThePreferenceTestPage() {
        MySoundidPage.getCreateSoundidButton().click();
        TutorialPage.getStartTestButton().isDisplayed();
        TutorialPage.getStartTestButton().click();
        Utils.wait(5);
        TrackPage.getContinueButton().isDisplayed();
        TrackPage.getTrackList("Electronic beats 1").click();
        try {
            String PlayerState = TrackPage.getPlayPauseButton("Electronic beats 1").getText();
            Assert.assertEquals(PlayerState, "pause");
        } catch (AssertionError e) {
           Assert.fail("Track is not played");
        }
        TrackPage.getContinueButton().click();
        PreferenceTestPage.getPauseButton().isDisplayed();
    }


    @Then("I see the Preference test is paused")
    public void iSeeThePreferenceTestIsPaused() {
        try {
            PausePage.getPauseHeader().isDisplayed();
            PausePage.getQuitAndRestartButton().isDisplayed();
            PausePage.getResumeButton().isDisplayed();
        } catch (AssertionError e) {
            Assert.fail("Pause state is not activated");
        }

    }
}