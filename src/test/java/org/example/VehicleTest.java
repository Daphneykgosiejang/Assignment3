package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void start() {
        boolean condition = true;
        assertTrue(condition);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stop() {
        boolean condition = false;
        assertTrue(condition);
    }
}