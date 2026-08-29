interface I2 {

    void displayI2();
}

interface I1 extends I2 {

    void displayI1();
}

class C1 implements I1 {

    public void displayI2() {
        System.out.println("Method inherited from I2");
    }

    public void displayI1() {
        System.out.println("Method declared in I1");
    }

    void displayC1() {
        System.out.println("Method of Class C1");
    }
}

public class Question {

    public static void main(String[] args) {

        C1 obj = new C1();

        obj.displayI2();
        obj.displayI1();
        obj.displayC1();
    }
}
