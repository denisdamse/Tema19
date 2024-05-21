public class Out extends Exception{
    public Out(int x, int y)
    {
        super("Mingea cu coordonatele: ("+x+","+y+")"+"a iesit afara din teren");
    }
}
