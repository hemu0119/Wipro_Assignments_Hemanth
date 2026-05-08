package Day5;

final class Security {
    void encrypt() {
        System.out.println("Data encrypted successfully");
    }
}

public class Encrypt {
    public static void main(String[] args) {
        Security obj = new Security();
        obj.encrypt();
    }
}