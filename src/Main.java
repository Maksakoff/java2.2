public class Main {
    public static void main(String[] args) {

        //Исходные данные

        int customerAccount = 200;
        int part = 100;
        int uploadVolume = 1500;

        //Логика

        int bonus;
        if (uploadVolume >= 1000){
            bonus = uploadVolume / part;
        } else {
            bonus = 0;
        }

        int balance = customerAccount + uploadVolume;

        System.out.println("Ваш баланс составляет " + balance + " руб.");
        System.out.println("Ваш бонус составляет " + bonus + " руб.");

    }
}
