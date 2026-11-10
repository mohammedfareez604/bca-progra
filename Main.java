class Demo {
    int var1;
    int var2;

    void method1() {
        System.out.println("method 1 called with var1:" + var1);
        int sum = var1 + var2;
        System.out.println("Sum of var1 and var2:" + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.var1 = 10;
        obj1.var2 = 20;
        obj1.method1();

        Demo obj2 = new Demo();
        obj2.var1 = 30;
        obj2.var2 = 40;
        obj2.method1();
    }
}