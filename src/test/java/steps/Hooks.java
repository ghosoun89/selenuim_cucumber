package steps;

import com.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
    // run only for scenario has sanity tag
    @Before("@Sanity")
//    @Before
    public void runsBeforeAnyScenario(){
    System.out.println("Runs before any scenario");
    }

    @After
    public void runsAfterAnyScenario(){
        System.out.println("Runs After any scenario");
        driver.quit();
    }
}
