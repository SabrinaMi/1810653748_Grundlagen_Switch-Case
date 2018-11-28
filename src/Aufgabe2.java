public class Aufgabe2
{

    public static void main(String[] args)
    {
        for (int i=0; i<3; i+=2) //es wird nur zweimal ausgegebn da wir angegeben haben, dass der Wert nicht öfter als 3Mal ausgegeben werden darf
        {
            printName();
        }
    }

    public static void printName()
    {
        System.out.println("Sabrina");
    }
}