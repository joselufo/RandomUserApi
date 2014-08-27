package com.terro;

import junit.framework.TestCase;

public class BaseTestCase extends TestCase {

    private static final boolean DEBUG = false;

    private final RandomUser manager = new RandomUser();

    @Override protected void setUp() throws Exception {
        manager.setIsDebug(DEBUG);
    }

    protected final RandomUser getManager () {
        return manager;
    }
}
