package com.my_trainings.cucumber_training;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/my_trainings/cucumber_training/tests", 
glue = {
		"com.my_trainings.cucumber_trainings.steps" })
public class TrainingTest1 {

}
