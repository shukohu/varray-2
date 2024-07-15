public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int[] costs = {80650, 96700, 77400, 120100, 113056};
        int sum = 0;
        for (int index =0; index < costs.length; index++) {
            sum += costs[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей" );

        //Задача 2
        System.out.println("Задача 2");

        int[] costsMinMax = {66102, 84200, 86034, 112503, 134500};
        int max = costsMinMax[0];
        int min = costsMinMax[0];
        for (final int current : costsMinMax) {
            if (max < current) {
                max = current;
            }
            if (min > current) {
                min = current;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max);
        System.out.println("Минимальная сумма трат за неделю составила " + min);

        //Задача 3
        System.out.println("Задача 3");
        int[] costsMonths = {30202, 44100, 42940, 67233, 58547};
        int sumMonth = 0;
        int sumWeek = 0;
        for (int i = 0; i < costsMonths.length; i++) {
            sumMonth += costsMonths[i];
        }
        sumWeek = sumMonth / costsMonths.length;
        System.out.println("Средняя сумма трат за месяц составила " + sumWeek + " рублей");

        //Задача 4
        System.out.println("Задача 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}