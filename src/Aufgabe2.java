public class Aufgabe2
{

    public static void main(String[] args)
    {
        //Aufgabe2
        //for (int i=0; i<3; i+=2) //es wird nur zweimal ausgegebn da wir angegeben haben, dass der Wert nicht öfter als 3Mal ausgegeben werden darf
        //{
        // printName();
        //}
        //Aufgabe3
        for (int i = 0; i < 5; i++)
        {
            printName();
            printAge(25 + i);
        }
    }

    public static void printName()
    {
        System.out.println("Sabrina");
    }

    public static void printAge(int age)
    {
        System.out.println(age);
    }
}