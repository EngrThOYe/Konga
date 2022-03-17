package com.konga.hooks;

import com.konga.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserManager
{
    @Before
    public void setup()
    {
        launchBrowser("Chrome");
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
