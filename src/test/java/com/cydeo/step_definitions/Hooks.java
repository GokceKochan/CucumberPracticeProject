package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In the class we will be able to pass pre and post conditions to
each scenario and each step
 */

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setUp(){
        System.out.println("Setting up browser using cucumber @Before");
    }
    @Before(value = "@login",order = 2)
    public void setUpScenarioForLogin(){
        System.out.println("==== this will only aplly to scenarios with @login tag");
    }

    @Before(value = "@db",order = 0)
    public void setupForDatabaseScenarios(){
        System.out.println("==== this will only aplly to scenarios with @db");
    }
    @After
    public void tearDown(){
        System.out.println("==== Closing browser using cucumber @After");
        System.out.println("==== Scenario ended/take screenshot if failed!");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("--------> Applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("--------> Applying tearDown using @AfterStep");
    }

}
