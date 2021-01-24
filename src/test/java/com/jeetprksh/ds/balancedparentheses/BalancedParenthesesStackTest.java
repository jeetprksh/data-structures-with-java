package com.jeetprksh.ds.balancedparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesStackTest {

  @Test
  public void test() {
    BalancedParenthesesStack bp = new BalancedParenthesesStack("{}[]({}");
    assertTrue(bp.isBalanced());
  }

  @Test
  public void testStackPositive() {
    assertTrue(new BalancedParenthesesStack("{}").isBalanced());
  }

  @Test
  public void testStackNegative() {
    assertFalse(new BalancedParenthesesStack("{}[").isBalanced());
  }

}