package com.thbs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
       App ob=new App();
       boolean e=ob.testmethod("abab5");
       assertEquals( true,e);
    
    }
}
