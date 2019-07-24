package com.corejava;

public class ClassImplementing2InterfacesJava8WithDefaultMethods implements Interface1, Interface2 {

    public void test(String str) {  // we should override this method. otherwise
                                   // we will get compilation error....
        System.out.println("Hello:" + str);
    }

    @Override
    public void m2() {
        // TODO Auto-generated method stub

    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub

    }

    /* public void test1() {  // we should override this method. otherwise
         // we will get compilation error....
         System.out.println("Hello fjsdlfjdlks");
     }*/

    public static void main(String[] args) {
        ClassImplementing2InterfacesJava8WithDefaultMethods ciifjwdm = new ClassImplementing2InterfacesJava8WithDefaultMethods();
        ciifjwdm.test("Lourdu...");
        ciifjwdm.test1();
        ciifjwdm.test2();
    }

    @Override
    public void test2() {
        // TODO Auto-generated method stub

    }

    @Override
    public void test1() {
        // TODO Auto-generated method stub

    }

}
