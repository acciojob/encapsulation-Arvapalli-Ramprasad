package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import com.driver.RWOnly;
import org.junit.Test;

public class TestCases {
     @Test
    public void testGetterSetter() {
        RWOnly obj = new RWOnly();
        obj.setName("TestName");
        assertEquals("TestName", obj.getName());
    }
}
