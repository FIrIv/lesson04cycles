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

        // задание 4
        System.out.println();

        // задание 5
        System.out.println();
    }
}
