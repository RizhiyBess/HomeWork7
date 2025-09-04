//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int month = 0;
        int salary = 0;
        while (salary <= 2_459_000) {
            salary = salary + 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + salary + " рублей");
        }

        System.out.println("Задание 2");
        int a = 0;
        int b = 10;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }

        System.out.println();
        System.out.println("Задание 3");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            population = (population + population / 1000 * 17 - population / 1000 * 8);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println("Задание 4 + Задание 5");
        int initialAmount = 15_000;
        int c = 0;
        while (initialAmount < 12_000_000) {
            c++;
            initialAmount = initialAmount + initialAmount / 100 * 7;
            if (c % 6 == 0) {
                System.out.println("месяц " + c + " наколение " + initialAmount);
            }
        }

        System.out.println("Задание 6");
        int saving = 15_000;
        int e = 0;
        while (e < 108) {
            e++;
            saving = saving + saving / 100 * 7;
            if (e % 6 == 0) {
                System.out.println("месяц " + e + " сумма " + saving);
            }
        }

        System.out.println("Задание 7");
        int firstFriday = 1;
        int day = firstFriday;
        for (; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет.");
        }

        System.out.println("Задание 8");
        int yearComet = -79;
        int currentYear = 2025;
        while (yearComet <= currentYear) {
            yearComet = yearComet + 79;
            if (yearComet >= (currentYear - 200) && yearComet <= (currentYear + 100)) {
                System.out.println(yearComet + " год кометы");
            }
        }
    }
}