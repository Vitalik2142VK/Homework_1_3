public class Main
{
    public static void Task1()
    {
        System.out.println("Task1: ");
        int age = 10;
        if (age > 17)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("##########");
    }

    public static void Task2()
    {
        System.out.println("Task2: ");
        int temperature = -3;
        if (temperature > 5)
        {
            System.out.println("На улице \'" + temperature + "\' градусов, можно идти без шапки».");
        }
        else
        {
            System.out.println("На улице \'" + temperature + "\' градусов, нужно надеть шапку».");
        }
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3: ");
        float speed = 81.4f;
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else
        {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно.");
        }
        System.out.println("##########");
    }

    public static void Task4()
    {
        System.out.println("Task4: ");
        int age = 28;
        if (age < 2)
            System.out.println("Если возраст человека равен " + age + ", то ему рано куда либо ходить.");
        else if (age >= 2 && age <= 6)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        else if (age > 6 && age <= 18)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        else if (age > 18 && age <= 24)
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        else
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        System.out.println("##########");
    }

    public static void Task5()
    {
        System.out.println("Task5: ");
        int age = 10;
        if (age <= 5)
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        else if (age > 5 && age <= 14)
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        else
            System.out.println("Если возраст ребенка равен " + age + ", то можно кататься ему без сопровождения взрослого");
        System.out.println("##########");
    }

    public static void Task6()
    {
        System.out.println("Task6: ");
        int commonPlaces = 102;
        int seating = 60;
        int peoples = 96;
        if (peoples <= seating)
            System.out.println("В вагоне есть сидячие места.");
        else if (peoples > seating && peoples <= commonPlaces)
            System.out.println("В вагоне остались только стоячие места.");
        else
            System.out.println("В вагоне мест нет!");
        System.out.println("##########");
    }

    public static void Task7()
    {
        System.out.println("Task7: ");
        int one = 4;
        int two = 10;
        int three = 7;
        if (one > two && one > three)
            System.out.println("one больше two и three");
        else if (two > one && two > three)
            System.out.println("two больше one и three");
        else if (three > one && three > two)
            System.out.println("three больше one и two");
        System.out.println("##########");
    }

    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
    }
}