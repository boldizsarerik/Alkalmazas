public class Adatok_megosztasa
{
    public static int kor_pontszam = 0;    
    public static int haromszog_pontszam = 0;    
    public static int negyszog_pontszam = 0;  
    public static int teszt_pontszam = 0;
    
    public static double kerekit(double value, int places)
    { //A kerekítés függvény, megkap 1 értéket, és hogy hány tizedesjegyre szeretnénk kerekíteni, majd visszatér a kerekített értékkel
    if (places < 0) throw new IllegalArgumentException();
    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
    }
}