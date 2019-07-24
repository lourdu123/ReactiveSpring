package com.corejava;

public class ReturnStatementInTryBlockStillExecutesFinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println("this is try block");
            return;  // in this case finally block will be executed
            // System.exit(1); // in this case finally block will not be executed
        }
        catch (Exception e) {
            System.out.println("this is catch block");
        }
        finally {
            System.out.println("this is finally block");
        }
    }

}
