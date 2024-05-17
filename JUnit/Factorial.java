package com.junit.mevenjunt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Factorial {
    public int fact(int n) {
        int fact=1;
        for (int i = 1; i <=n; i++) {
        fact=fact*i;
        }
        return fact;
        }
        @Test
        public void testFact() {
            //Factorial f=new Factorial();
        assertEquals(120, fact(5));
        }
}