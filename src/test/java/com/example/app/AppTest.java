package com.example.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

@Test
public class AppTest

{
    @Test
    public void testGreet() {
        String result = App.greet("Student");
        assertEquals("Hello, Student! Welcome to Maven CI/CD Demo.", result);
    }

}
