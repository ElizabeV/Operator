public class Main {
    public static void main(String[] args) {

        int account = 100;
        int refill = 300;

        //boolean thous = true; //пополнение от тысячи тру
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Сумма бонуса: " + bonus);
        int result = account + refill + bonus;
        System.out.println("Итоговый счет: " + result);
    }
}
