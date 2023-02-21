public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {// Пишем код для задачи 1
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 1 Инициализация ||");
        System.out.println(separator);
        byte smallNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2_000_000_000;
        long bigNumber = 9;
        float floatNumber = 3.444f;
        double doubleNumber = 1.75;
        System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной bigNumber с типом long равно " + bigNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
    }

    public static void task2() {// Пишем код для задачи 2
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 2 Инициализация ||");
        System.out.println(separator);
        float floatNumber = 27.12f;
        System.out.println("floatNumber= " + floatNumber);
        long bigNumber = 987678965549L;
        System.out.println("bigNumber= " + bigNumber);
        float floatNumber2 = 2.786f;
        System.out.println("floatNumber2= " + floatNumber2);
        short shortNumber = 569;
        System.out.println("shortNumber " + shortNumber);
        short shortNumber2 = -159;
        System.out.println("shortNumber2 " + shortNumber2);
        short shortNumber3 = 27897;
        System.out.println("shortNumber3 " + shortNumber3);
        byte smallNumber = 67;
        System.out.println("smallNumber " + smallNumber);
    }

    public static void task3() {// Пишем код для задачи 3
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 3 Учителя ||");
        System.out.println(separator);
        byte classLudmilaPavlovna = 23;
        byte classAnnaSergeevna = 27;
        byte classYekaterinaAndreevna = 30;
        short sheetTotalNumber = 480;
        int sheetPerStudent = sheetTotalNumber / (classLudmilaPavlovna + classAnnaSergeevna + classYekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetPerStudent + " листов бумаги");
    }

    public static void task4() {// Пишем код для задачи 4
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 4 Конвейер ||");
        System.out.println(separator);
        byte bottlesPerMinute = 8;
        System.out.println("Производительность в минуту: " + bottlesPerMinute + " бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerMinute * 60 * 24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMinute * 60 * 24 * 30 + " штук бутылок");
    }

    public static void task5() {// Пишем код для задачи 5
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 5 Ремонт ||");
        System.out.println(separator);
        byte paintTotal = 120;
        byte white = 2;
        byte brown = 4;
        int roomNumber = paintTotal / (white + brown);
        int whiteSpent = roomNumber * white;
        int brownSpent = roomNumber * brown;
        System.out.println("В школе, где " + roomNumber + " классов, нужно " + whiteSpent + " банок белой краски и " + brownSpent + " банок коричневой краски");
    }

    public static void task6() {// Пишем код для задачи 6
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 6 Завтрак чемпиона ||");
        System.out.println(separator);
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeight100ml = 105;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        short weightTotal = (short) (bananas * bananaWeight + milk * milkWeight100ml / 100 + icecream * icecreamWeight + eggs * eggWeight);
        System.out.println("Вес завтрака в граммах: "+weightTotal);
        float weightTotalKG = (float) weightTotal / 1000;
        System.out.println("Вес завтрака в килограммах: "+weightTotalKG);
    }
    public static void task7() {// Пишем код для задачи 7
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 7 Диета для чемпиона ||");
        System.out.println(separator);
        short weightToLose = 7000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        float daysToPerfectFit1 = (float) weightToLose / (float) weightLoss1;
        System.out.println("Теряя по "+weightLoss1+" граммов вдень, спортсмен похудеет на "+weightToLose/1000+"кг за "+daysToPerfectFit1+" дней.");
        float daysToPerfectFit2 = (float) weightToLose / (float) weightLoss2;
        System.out.println("Теряя по "+weightLoss2+" граммов вдень, спортсмен похудеет на "+weightToLose/1000+"кг за "+daysToPerfectFit2+" дней.");
        float averageDaysToPerfectFit = (daysToPerfectFit1 + daysToPerfectFit2) /2;
        System.out.println("В среднем спортсмен похудеет на "+weightToLose/1000+"кг за "+averageDaysToPerfectFit+" дней.");
    }
    public static void task8() {// Пишем код для задачи 8
        var separator = "=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        System.out.println(separator);
        System.out.println("|| Задача 8 Повышение зарплат ||");
        System.out.println(separator);
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int salaryMashaNew = (int) (salaryMasha * 0.1)+salaryMasha;
        int salaryMashaDiff = salaryMashaNew - salaryMasha;
        int salaryDenisNew = (int) (salaryDenis *0.1)+salaryDenis;
        int salaryDenisDiff = salaryDenisNew - salaryDenis;
        int salaryChristinaNew = (int) (salaryChristina *0.1)+salaryChristina;
        int salaryChristinaDiff = salaryChristinaNew - salaryChristina;

        System.out.println("Маша теперь получает "+salaryMashaNew+" рублей. Годовой доход вырос на "+salaryMashaDiff+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisNew+" рублей. Годовой доход вырос на "+salaryDenisDiff+" рублей");
        System.out.println("Кристина теперь получает "+salaryChristinaNew+" рублей. Годовой доход вырос на "+salaryChristinaDiff+" рублей");
    }
}