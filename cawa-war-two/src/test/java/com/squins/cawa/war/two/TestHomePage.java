package com.squins.cawa.war.two;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.squins.cawa.war.two.HomePage;
import com.squins.cawa.war.two.WicketApplication;

/**
 * Simple test using the WicketTester
 */
@Ignore("No dependency injection here currently :)")
public class TestHomePage {
    private WicketTester tester;

    @Before
    public void setUp() {
        tester = new WicketTester(new WicketApplication());
    }

    @Test
    public void homepageRendersSuccessfully() {
        // start and render the test page
        tester.startPage(HomePage.class);

        // assert rendered page class
        tester.assertRenderedPage(HomePage.class);
    }
}
