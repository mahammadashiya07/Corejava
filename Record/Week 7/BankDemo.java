// Parent class
class Bank {

    // Method of parent class
    void getRateOfInterest() {
        System.out.println("Bank Rate of Interest: 5%");
    }
}

// Child class SBI
class SBI extends Bank {

    // Overriding the parent class method
    @Override
    void getRateOfInterest() {
        System.out.println("SBI Rate of Interest: 6.5%");
    }
}

// Child class HDFC
class HDFC extends Bank {

    // Overriding the parent class method
    @Override
    void getRateOfInterest() {
        System.out.println("HDFC Rate of Interest: 7%");
    }
}

// Child class ICICI
class ICICI extends Bank {

    // Overriding the parent class method
    @Override
    void getRateOfInterest() {
        System.out.println("ICICI Rate of Interest: 7.5%");
    }
}

// Main class
public class BankDemo {

    public static void main(String[] args) {

        // Parent class reference referring to SBI object
        Bank b1 = new SBI();

        // Parent class reference referring to HDFC object
        Bank b2 = new HDFC();

        // Parent class reference referring to ICICI object
        Bank b3 = new ICICI();

        // Calling the overridden methods
        b1.getRateOfInterest();
        b2.getRateOfInterest();
        b3.getRateOfInterest();
    }
}
