
class A {
    void performAction() throws Exception {
        throw new Exception("Exception thrown from Class A");
    }
}

class B extends A {
    @Override
    void performAction() {
        try {
            super.performAction();
        } catch (Exception e) {
            System.out.println("Exception caught in Class B: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.performAction();
    }
}
