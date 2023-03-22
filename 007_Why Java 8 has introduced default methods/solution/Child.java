package solution;

import diamondProblem.Interface1;

public class Child implements Interface1, Interface2 {

    @Override
    public void hello() {
        System.out.println("inside Child class hello method");
        Interface1.super.hello();
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.hello();
    }
}
