final class BankSecurity {
    final void authenticate(String password) {
        System.out.println("Authenticate using 2FA + Password");
        System.out.println("This is final class");
    }

    void KYC(String idProof) {
        System.out.println("Verify ID Proof");
    }
}

public class Final {
    public static void main(String[] args) {
        BankSecurity hdfc = new BankSecurity();
        hdfc.authenticate("123456");
        hdfc.KYC("Aadhaar");
    }
}