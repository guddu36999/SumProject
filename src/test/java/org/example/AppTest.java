package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition(){
        int result=Main.add(10,20);
        assertEquals(30,result);

    }

}
