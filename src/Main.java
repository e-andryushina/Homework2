public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var commonWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес боксеров " + commonWeight + " кг!");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");

        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница в весе боксеров составляет " + (boxer2Weight - boxer1Weight) + " кг (1 способ)");
        System.out.println("Разница в весе боксеров составляет " + (boxer2Weight % boxer1Weight) + " кг (2 способ)");

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var oneEmployeeWorkingTime = 8;
        var totalEmployeeAmount = totalWorkingTime / oneEmployeeWorkingTime;
        System.out.println("Всего работников в компании - " + totalEmployeeAmount + " человек");
        totalEmployeeAmount += 94;
        totalWorkingTime = oneEmployeeWorkingTime * totalEmployeeAmount;
        System.out.println("Если в компании работает " + totalEmployeeAmount + " человек, то всего " + totalWorkingTime + " часов работы может быть поделено между сотрудниками. ");

    }
}