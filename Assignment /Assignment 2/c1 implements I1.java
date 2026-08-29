interface I1 {

    void displayI1();
}

class C1 implements I1 {

    public void displayI1() {
        System.out.println("This method is implemented from I1");
    }

    void displayC1() {
        System.out.println("This is Class C1");
    }
}

public class Question3 {

    public static void main(String[] args) {

        C1 obj = new C1();

        obj.displayI1();
        obj.displayC1();
    }
}
