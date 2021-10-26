package stepsDefinitions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import setups.Capabilities;

public class Hooks extends Capabilities {
    @Before({"@RunServer"})
    public void setup()throws Exception{
        preparation();
    }


    @After({""})
    public void End(){
        stopServer();
    }

}
