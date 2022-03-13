package test.skypro;

public class Main {

    public static void main(String[] args) {

        // задание 1
        int i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for (i=10; i>0; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        // задание 2
        int firstFridayOfMonth = 4;
        int countDaysInMarch = 31;
        for (int friday = firstFridayOfMonth; friday<=countDaysInMarch; friday++){
            if ((friday-firstFridayOfMonth) % 7 == 0){
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        // задание 3
        int cometFirstDate = 0;
        int cometInterval = 79;
        int yearNow = 2022;
        int minYear = yearNow - 200;
        int maxYear = yearNow + 100;
        for (int comet = cometFirstDate;; comet+=cometInterval){
            if (comet>maxYear) {
                break;
            }
            if (comet>minYear){
                System.out.println("Комета пролетает в " + comet + " году.");
            }
        }
        System.out.println();




        // урок 2, задание 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        int invertResult = result * (-1);
        System.out.println(result);
        System.out.println();

        // урок 2, задание 7
        // аналог решения (по подсказке сделала, сама так и не поняла задание)
        int a7 = 9;
        int b7 = 20;
        System.out.println("Было: " + a7 + " " + b7);
        a7 = a7 * b7;
        b7 = a7 / b7;
        a7 = a7 / b7;
        System.out.println("Стало: " + a7 + " " + b7);
        System.out.println();

        // урок 2, задание 8
        int a8 = 650;
        int b8 = (a8 % 100)/10;
        System.out.println("У трехзначного числа " + a8 + " средняя цифра - " + b8);
        System.out.println();

        // урок 4, задание 4
        // не проверть, по подсказке, сама бы сделала 3 проверки :)
        for (int ii = 1; ii<=30; ii++){
            System.out.print (ii + ": ");
            if (ii % 3 == 0) {
                System.out.print("ping ");
            }
            if (ii % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
        System.out.println();

        // урок 4 задание 5
        int fib1 = 0;
        int fib2 = 1;
        System.out.print (fib1 + " " + fib2 + " ");
        for (int j=0; j<8      ; j++) {
            fib2 = fib1 + fib2;
            System.out.print (fib2 + " ");
            fib1 = fib2 - fib1;
        }
        System.out.println();
        System.out.println();

        // урок 4 задание 6
        int ageMin = 23;
        int ageClient = 19;
        int salary1 = 50_000;
        int salary2 = 80_000;
        int salaryClient = 58_000;
        float stuff = 1f;
        if (ageClient<ageMin) stuff = 2f;
        else stuff = 3f;
        if (salaryClient > salary2) stuff *= 1.5f;
        else if (salaryClient > salary1) stuff *= 1.2f;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salaryClient * stuff + " рублей");
        System.out.println();

        // урок 4 задание 7
        ageClient =25;
        salaryClient = 60_000;
        int wantedSum = 330_000;
        int permittedSum = 0;
        float creditPercentBasic = 0.1f;
        float creditPercentClient = creditPercentBasic;
        int creditMonths = 12;
        float payMonthMax = 0.5f * salaryClient;
        if (ageClient < 23) creditPercentClient += 0.01;
        else if (ageClient < 30) creditPercentClient += 0.005;
        if (salaryClient > 80_000) creditPercentClient -= 0.007;
        float creditWantedForClientMonth = (float)wantedSum * (1f + creditPercentClient) / creditMonths;
        if (creditWantedForClientMonth <= payMonthMax) {
            System.out.print("Кредит одобрен.\nМаксимальный платеж при зарплате " + salaryClient + " составляет " + payMonthMax + " руб.\nПлатеж по кредиту " + creditWantedForClientMonth + " руб.(запрашиваемая сумма - " + wantedSum + " руб.)\n");
        } else {
            System.out.print("Кредит не одобрен\nМаксимальный платеж при зарплате " + salaryClient + " составляет " + payMonthMax + " руб.\nПлатеж по кредиту " + creditWantedForClientMonth + " руб.(запрашиваемая сумма - " + wantedSum + " руб.)\n");
        }
        System.out.println();

        // урок 4 задание "таблица умножения"
        for (int mn1 = 1; mn1 <= 10; mn1 ++) {
            for (int mn2 = 1; mn2 <= 10; mn2++) {
                System.out.print(mn1 * mn2 + " ");
            }
            System.out.println();
        }

    }
}
