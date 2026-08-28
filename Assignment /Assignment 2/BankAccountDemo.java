interface BasicService {

    void basicService();
}

interface OnlineService {

    void onlineService();
}

interface PremiumService extends BasicService, OnlineService {

    void premiumService();
}

class BankAccount implements PremiumService {

    public void basicService() {
        System.out.println("Basic Service: Cash Deposit");
    }

    public void onlineService() {
        System.out.println("Online Service: Internet Banking");
    }

    public void premiumService() {
        System.out.println("Premium Service: Priority Banking");
    }

    void accountDetails() {
        System.out.println("Account Type: Premium Account");
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.basicService();
        account.onlineService();
        account.premiumService();
        account.accountDetails();
    }
}
