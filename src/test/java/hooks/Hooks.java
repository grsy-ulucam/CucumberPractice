package hooks;


import io.cucumber.java.After;
import org.junit.Before;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Before methodu calisti");
    }

    @After
    public void teardown(){
        System.out.println("After methodu calisti");
        Driver.closeDriver();
    }

}
