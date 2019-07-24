public class TestStaticMethodOverriding {

    public static void main(String[] args) {

        Child c = new Child();
        c.addIntergers();

        Parent p = new Parent();
        p.addIntergers();

        Parent p1 = new Child();
        p1.addIntergers();

        System.out.println("********************");

        Child child = new Child();
        child.m();

        Parent parent = new Parent();
        parent.m();

        Parent parent1 = new Child();
        parent1.m();

    }
}
