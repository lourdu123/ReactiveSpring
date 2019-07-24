package com.threads;

public class StartingSameThreadTwice {

    public static void main(String[] args) {

        ThreadUsingThreadClass1 tutc = new ThreadUsingThreadClass1();
        tutc.start();

        tutc.start();  // starting thread again will give
                      // IllegalThreadStateException
    }
}
