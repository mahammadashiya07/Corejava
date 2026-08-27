interface Printable {

    void printDocument();
}

class Printer implements Printable {

    public void printDocument() {
        System.out.println("Printing the document...");
    }

    void printerDetails() {
        System.out.println("Printer: Laser Printer");
    }
}

public class PrinterDemo {

    public static void main(String[] args) {

        Printer p = new Printer();

        p.printDocument();
        p.printerDetails();
    }
}
