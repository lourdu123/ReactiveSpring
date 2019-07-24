package com.corejava.math;

public class Power {

    public static void main(String[] args) {

        // print PI value
        System.out.println(Math.PI);

        System.out.println("ceiling values");
        System.out.println(Math.ceil(10.56));
        System.out.println(Math.ceil(10.16));

        

        System.out.println("floor values");
        System.out.println(Math.floor(10.56));
        System.out.println(Math.floor(10.16));

        System.out.println("log values");
        System.out.println(Math.log(0));
        System.out.println(Math.log(1));
        System.out.println(Math.log(2));
        System.out.println(Math.log(8));

        System.out.println("max of 2 numbers");
        System.out.println(Math.max(100, 200));

        System.out.println("min of 2 numbers");
        System.out.println(Math.min(100, 200));

        System.out.println("power of number");
        System.out.println(Math.pow(2, 3));

        System.out.println("square root  of number");
        System.out.println(Math.sqrt(25)); // 5*5
        System.out.println(Math.sqrt(2));
        System.out.println(Math.sqrt(3));
        System.out.println(Math.sqrt(5));

        System.out.println("cubth root  of number");
        System.out.println(Math.cbrt(64)); // 4*4*4
    }

}
