//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double[] payments = {20000, 35000, 150000, 37000, 74000};

//1
        double sun = 0;
        for (int i = 0; i < payments.length; i++) {
            sun += payments[i];
            System.out.println("Сумма трат за месяц составила" + sun + "рублей");
        }
        //2
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double payment : payments) {
            if (payment < min) {
                min = payment;
            }
            if (max < payment) {
                max = payment;
            }
        }
        System.out.print("Минимальная сумма трат за неделю составила" + min + "рублей." + "Максимальная сумма трат за неделю составила" + max + "рублей");

        //3
        double average = sun / payments.length;
        System.out.print("Средняя сумма трат за месяц составила" + average + "рублей.");


        //4
        char[] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}