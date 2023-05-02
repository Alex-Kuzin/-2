public class Main {
    public static void main(String[] args) {
         int balance = 8000;
        int replenishment_1 = 500;
        int balance_2 = balance  + replenishment_1;
         int points;
  if (balance_2 > 1000)
  {
      points = (balance_2 - 1000) / 100;
  }
else  {
      points = 0;
  }
    System.out.println("Баланс:" + balance_2 + " " + "Кол-во бонусов:" + points);

        }

    }