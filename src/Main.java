public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }

        // Задача 2
        int degree = 4;
        if (degree <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        int normalSpeed = 60;
        if (normalSpeed > 60) {
            System.out.println("Если скорость " + normalSpeed + " km/h придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + normalSpeed + " km/h можно ездить спокойно");
        }

        // Задача 4
        int littlePeople = 5;
        int middlePeople = 14;
        int adultPeople = 20;
        int workPeople = 25;
        if (littlePeople >= 3 && littlePeople <= 6) {
            System.out.println("Если возраст человека равен " + littlePeople + " то ему нужно ходить в детский сад");
        }
        if (middlePeople >= 7 && middlePeople <= 17) {
            System.out.println("Если возраст человека равен " + middlePeople + " то ему нужно ходить в школу");
        }
        if (adultPeople >= 18 && adultPeople <= 24) {
            System.out.println("Если возраст человека равен " + adultPeople + " то его место в университете");
        }
        if (workPeople > 24) {
            System.out.println("Если возраст человека равен " + workPeople + " то ему пора ходить на работу");
        } else {
            System.out.println("Возраст " + workPeople + " не подходит ни под один этап (не >24)");
        }

        // Задача 5
        int ageForRide = 15;
        if (ageForRide < 5) {
            System.out.println("Если возраст ребенка равен " + ageForRide + " нельзя кататься на аттракционе");
        } else if (ageForRide >= 5 && ageForRide <= 14) {
            System.out.println("Если возраст ребенка равен " + ageForRide + " можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageForRide + " можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        int allSeat = 102;
        int seatingPlace = 60;
        int numPassengers = 70;
        if (numPassengers >= allSeat) {
            System.out.println("Вагон уже полностью забит");
        } else if (numPassengers > seatingPlace) {
            System.out.println("Места есть только стоячие");
        } else {
            System.out.println("Места есть и сидячие");
        }

        // Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one - Данное число самое большое из всех");
        } else if (two > one && two > three) {
            System.out.println("two - Данное число самое большое из всех");
        } else if (three > one && three > two) {
            System.out.println("three - Данное число самое большое из всех");
        } else {
            System.out.println("Нет уникального наибольшего числа (есть равенства)");
        }
    }
}