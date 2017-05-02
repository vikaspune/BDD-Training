package com.my_trainings.cucumber_trainings.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setup() {
		System.out.println("Pre-requisite setup");
	}

	@After
	public void tearDown() {
		System.out.println("Break down script");
	}
}
