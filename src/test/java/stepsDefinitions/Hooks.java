package stepsDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import setups.Capabilities;

public class Hooks extends Capabilities {
    @Before()
    public void setup()throws Exception{
        preparation();
    }


    @After()
    public void End(){
        stopServer();
    }

}
