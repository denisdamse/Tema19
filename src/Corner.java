public class Corner extends Exception{
    public Corner(int x, int y)
    {
        super("Mingea cu coordonatele: ("+x+","+y+")"+"e in corner");
    }   
}