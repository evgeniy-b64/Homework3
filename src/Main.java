public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
    }

    public static void task1 () {// Пишем код для задачи 1
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1 Инициализация ||" );
        System.out.println(separator);
        byte smallNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2_000_000_000;
        long bigNumber = 9;
        float floatNumber = 3.444f;
        double doubleNumber = 1.75d;
        System.out.println("Значение переменной smallNumber с типом byte равно "+ smallNumber);
        System.out.println("Значение переменной shortNumber с типом short равно "+ shortNumber);
        System.out.println("Значение переменной intNumber с типом int равно "+ intNumber);
        System.out.println("Значение переменной bigNumber с типом long равно "+ bigNumber);
        System.out.println("Значение переменной floatNumber с типом float равно "+ floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно "+ doubleNumber);
    }

    public static void task2 () {// Пишем код для задачи 2
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2 Инициализация ||" );
        System.out.println(separator);
        float floatNumber = 27.12f;     System.out.println("floatNumber= "+ floatNumber);
        long bigNumber = 987678965549L;  System.out.println("bigNumber= "+ bigNumber);
        float floatNumber2 = 2.786f;    System.out.println("floatNumber2= "+ floatNumber2);
        short shortNumber = 569;        System.out.println("shortNumber "+ shortNumber);
        short shortNumber2= -159;       System.out.println("shortNumber2 "+ shortNumber2);
        short shortNumber3= 27897;      System.out.println("shortNumber3 "+ shortNumber3);
        byte smallNumber = 67;          System.out.println("smallNumber "+ smallNumber);
    }
    public static void task3 () {// Пишем код для задачи 3
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3 Учителя ||" );
        System.out.println(separator);
        byte classLudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classYekaterinaAndreevna = 30;
        short sheetTotalNumber = 480;
        int sheetPerStudent = sheetTotalNumber/(classLudmilaPavlovna+classAnnaSergeevna+classYekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано "+ sheetPerStudent +" листов бумаги");
    }
    public static void task4 () {// Пишем код для задачи 4
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4 Конвейер ||" );
        System.out.println(separator);
        byte bottlesPerMinute = 8;
        System.out.println("Производительность в минуту: "+ bottlesPerMinute +" бутылок");
        System.out.println("За 20 минут машина произвела "+ bottlesPerMinute*20 +" штук бутылок");
        System.out.println("За сутки машина произвела "+ bottlesPerMinute*60*24 +" штук бутылок");
        System.out.println("За 3 дня машина произвела "+ bottlesPerMinute*60*24*3 +" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+ bottlesPerMinute*60*24*30 +" штук бутылок");
    }

}