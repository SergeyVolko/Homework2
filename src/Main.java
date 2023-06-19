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

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat + 1.6;
        paper = paper + 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog  = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух боксеров: " + totalWeight);
        var differentWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в весе между двумя боксерами: " + differentWeight);
    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var differentWeight = secondBoxer - firstBoxer;
        System.out.println("Получаем разницу в весе операцией вычитания из большего меньшее: " + differentWeight);
        differentWeight = secondBoxer % firstBoxer;
        System.out.println("Получаем разницу в весе при помощи оператора %: " + differentWeight);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalTime =640;
        var workTime = 8;
        var totalEmploys = totalTime / workTime;
        System.out.println("Всего работников в компании — " + totalEmploys + " человек.");
        var totalNewEmploys = totalEmploys + 94;
        var workNewTime = totalTime / totalNewEmploys;
        System.out.println("Если в компании работает " + totalNewEmploys + " человек, то всего "
                + workNewTime + " часов работы может быть поделено между сотрудниками.");
    }
}