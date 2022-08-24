public class Main {
    public static void main(String[] args) {
        // Задача 1.
        byte one = 1;
        short two = 2;
        int three = 3;
        long four = 4L;

        float five = 1.0f;
        double six = 2.0;
        System.out.println("Значение переменной b с типом byte равно " + one);
        System.out.println("Значение переменной s с типом short равно " + two);
        System.out.println("Значение переменной i с типом int равно " + three);
        System.out.println("Значение переменной l с типом long равно " + four);
        System.out.println("Значение переменной f с типом float равно " + five);
        System.out.println("Значение переменной d с типом double равно " + six);

        // Задание 2.
        byte b1 = 2;
        byte b2 = 67;
        short s1 = 768;
        short s2 = 569;
        short s3 = -159;
        int i = 27897;
        long l = 987678965549L;

        float f = 27.12f;

        boolean bool = false;

        // Задание 3.
        byte lyudmila = 23;
        byte anna = 27;
        byte ekaterina = 30;

        int paper = 480;

        int everyStudent = paper / (lyudmila + anna + ekaterina);

        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");

        // Задание 4.
        byte productivityPerMinute = 16 / 2;
        byte twentyMinutes = 20;
        short day = 24 * 60;
        short threeDay = 24 * 60 * 3;
        int month = 24 * 30 * 60;

        System.out.println("За " + twentyMinutes + " минут машины произвели бутылок " + (productivityPerMinute * twentyMinutes) + " штук.");
        System.out.println("За сутки машины произвели бутылок " + (productivityPerMinute * day) + " штук.");
        System.out.println("За три дня машины произвели бутылок " + (productivityPerMinute * threeDay) + " штук.");
        System.out.println("За месяц машины произвели бутылок " + (productivityPerMinute * month) + " штук.");

        // Задание 5.
        byte paintForSchool = 120;
        byte paintPerClass = 2 + 4;

        int numberOfClasses = paintForSchool / paintPerClass;
        int whitePaint = numberOfClasses * 2;
        int brownPaint = numberOfClasses * 4;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        // Задание 6.
        // Задание 7.
        // Задание 8.
        // Эти задания есть в предыдущей домашней работе.


    }
}