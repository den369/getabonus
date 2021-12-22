public class Main {

    public static void main(String[] args) {
        int startBalance = 100;
        int added = 1100;
        int bonus = added / 100;

        int finishBalance;
        if (added >= 1100) {
            finishBalance = startBalance + added + bonus;
        } else {
            finishBalance = startBalance + added;
        }


        System.out.println(finishBalance);
    }
}

