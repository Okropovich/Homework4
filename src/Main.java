//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }

        //Задача 2
        int degree = 4;

        if (degree >= 5) {
            System.out.println("«На улице холодно, нужно надеть шапку");
        } else if (degree < 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        //задача 3
        int normalSpeed = 60;
        if (normalSpeed >= 60) System.out.println("Если скорость " + normalSpeed + " km можно ездить спокойно");
        else {
            System.out.println("Если скорость " + normalSpeed + "придется заплатить штраф ");

        }
        //Задача 4
        int littlePeople = 5;
        int middlePeople = 14;
        int adultPeople = 20;

        if (littlePeople <= 2 || littlePeople <= 6) ;
        if (middlePeople <= 7 || middlePeople <= 170) ;
        if (adultPeople <= 18 || adultPeople <= 24) ;

        System.out.println("Если возраст человека равен " + littlePeople + " то ему нужно ходить в детский сад");
        System.out.println("Если возраст человека равен " + middlePeople + " то ему нужно ходить в школу");
        System.out.println("Если возраст человека равен " + adultPeople + "  то его место в университете");
        //задача 5

        int childrenLittle = 4;
        int childrenMiddle = 10;
        int childrenAdult = 15;
        boolean perentsYeas = true;
        boolean perentsNot = false;

        if (childrenLittle < 5)
            System.out.println("Если возраст ребенка равен " + childrenLittle + " нельзя кататься на аттракционе");
        else {
            System.out.println("Ребенок может кататься на аттракционе");
        }
        if (childrenMiddle > 5 || childrenMiddle < 14 && perentsYeas) {
            System.out.println("Если возраст ребенка равен " + childrenMiddle + " можно кататься на аттракционе в сопровождении взрослого " + perentsYeas);
        } else {

            {
                System.out.println("Ребенок не может кататься на аттракционе");
            }


        }
        if (childrenAdult > 14 || perentsNot)
            System.out.println("Если возраст ребенка равен " + childrenAdult + " то ему можно кататься на аттракционе без сопровождения взрослого " + perentsNot);
        else {
            System.out.println("Если возраст ребенка меньше , то нельзя");
        }

        //Задача 6
        int allSeat = 102;
        int seatingPlace = 60;
        int standingPlace = allSeat - seatingPlace;
        System.out.println(standingPlace);
        int standingPlaceNew = 42;
        if (seatingPlace < 61 && standingPlaceNew < 43)
            System.out.println("вагон уже полностью забит");
        else {
            System.out.println("Места еще есть");
        }
        if (seatingPlace < 61 && standingPlaceNew > 41)
            System.out.println("Места есть стоящие и есть сидячие");

        else {
            System.out.println("Нет вообще мест");
        }
        //Задача 7
        int one =1;
        int two = 2;
        int three = 3;
        if (three>two&&three>one)
            System.out.println("<three> Данное число самое большое из всех");
        else{
            System.out.println("Ошибка");
        }

    }

}


