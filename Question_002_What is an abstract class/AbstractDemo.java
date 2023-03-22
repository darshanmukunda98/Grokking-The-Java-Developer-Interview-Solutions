 class AbstractDemo extends MyAbstractClass {
    @Override
    void print() {
        System.out.println("In print method");
    }

    public static void main(String[] args) {
        AbstractDemo obj = new AbstractDemo();
        obj.print();
        obj.display();
    }
}
