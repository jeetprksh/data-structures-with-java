package com.jeetprksh.ds;

import com.jeetprksh.ds.balancedparentheses.BalancedParenthesesStack;
import junit.framework.TestCase;
import org.junit.Test;

public class BalancedParenthesisTest extends TestCase {

    @Test
    public void testStackPositive() {
        assertTrue(new BalancedParenthesesStack("{}").isBalanced());
    }

    @Test
    public void testStackNegative() {
        assertFalse(new BalancedParenthesesStack("{}[").isBalanced());
    }
}
