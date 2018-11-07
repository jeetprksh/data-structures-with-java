package com.jeetprksh.ds.balancedparentheses;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String args[]) {
        BalancedParenthesesStack bp = new BalancedParenthesesStack("{}[]({}");
        logger.info("Is Balanced " + bp.isBalanced());
    }
}
