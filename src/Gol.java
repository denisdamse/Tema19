public class Gol extends Exception{
    public Gol(int x, int y)
    {
        super("Mingea cu coordonatele: ("+x+","+y+")"+"a intrat in poarta");
    }
}
