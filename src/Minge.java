public class Minge {
    private int x;
    private int y;
    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void suteaza() throws Out, Corner, Gol
    {
        CoordinateGenerator generator = new CoordinateGenerator();
        this.setX(generator.generateX());
        this.setY(generator.generateY());
        if(this.x==0 || this.y==50)
        {
            throw new Out(x, y);
        }
        else if((this.x==0 || this.x==100) && this.y>=20 && this.y<=30)
        {
            throw new Gol(x, y);
        }
        else if ((this.x==0 || this.x==100) && ((this.y>0 && this.y<20) || (this.y>30 && this.y<50)))
        {
            throw new Corner(x, y);
        }
    }
}
