interface I1 {

    void displayI1();
}

interface I2 {

    void displayI2();
}

class C1 implements I1, I2 {

    public void displayI1() {
        System.out.println("Method of Interface I1");
    }

    public void displayI2() {
        System.out.println("Method of Interface I2");
    }

    void displayC1() {
        System.out.println("Method of Class C1");
    }
}

public class Question {

    public static void main(String[] args) {

        C1 obj = new C1();

        obj.displayI1();
        obj.displayI2();
        obj.displayC1();
    }
}
