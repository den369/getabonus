public class Main {

    public static void main(String[] args) {
        int startBalance = 150;
        int added = 1350;
        int bonus = added / 100;

        int finishBalance;
        if (added >= 1000) {
            finishBalance = startBalance + added + bonus;
        } else {
            finishBalance = startBalance + added;
        }

        System.out.println("Вы пополнили счет на " + added + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("И теперь ваш баланс " + finishBalance + " руб.");

    }
}

