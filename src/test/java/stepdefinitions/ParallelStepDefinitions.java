package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class ParallelStepDefinitions {


    @Given("Print thread id")
    public void printThreadId() {

        System.out.println("Thread id = " + Thread.currentThread().getId());

    }
}
