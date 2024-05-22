public class Joc {
    private String numeEchipa1;
    private String numeEchipa2;
    private int numarGoluriEchipa1;
    private int numarGoluriEchipa2;
    private int numarOut;
    private int numarCorner;   
    public Joc(String numeEchipa1, String numeEchipa2) {
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        numarGoluriEchipa1=0;
        numarGoluriEchipa2=0;
    }
    public String getNumeEchipa1() {
        return numeEchipa1;
    }
    public String getNumeEchipa2() {
        return numeEchipa2;
    }
    public int getNumarGoluriEchipa1() {
        return numarGoluriEchipa1;
    }
    public int getNumarGoluriEchipa2() {
        return numarGoluriEchipa2;
    }
    public int getNumarOut() {
        return numarOut;
    }
    public int getNumarCorner() {
        return numarCorner;
    }
    public String toString()
    {
        return "Echipa1: "+numeEchipa1+", Echipa2:"+numeEchipa2+", Scor: "+numarGoluriEchipa1+"-"+numarGoluriEchipa2+", Numar Out-uri:"+numarOut+", Numar Corner:"+numarCorner;
    }
    public void simuleaza() throws Out, Corner, Gol
    {
        Minge minge = new Minge(50, 25);
        int pozitiaVecheX=minge.getX();
        int pozitiaVecheY=minge.getY();
        for(int i=0;i<1000;i++)
        {
            System.out.println(numeEchipa1+" - "+numeEchipa2+": Mingea se afla la coordonatele: "+"("+minge.getX()+","+minge.getY()+")");
            try {
                pozitiaVecheX=minge.getX();
                pozitiaVecheY=minge.getY();
                minge.suteaza();
            } catch (Out o) {
                minge.setX(pozitiaVecheX);
                minge.setY(pozitiaVecheY);
            } catch (Corner c){
                if(minge.getX()==0 && minge.getY()>30)
                {
                    minge.setX(0);
                    minge.setY(50);
                }
                else if(minge.getX()==0 && minge.getY()<20)
                {
                    minge.setX(0);
                    minge.setY(0);
                }
                else if(minge.getX()==100 && minge.getY()>30)
                {
                    minge.setX(100);
                    minge.setY(50);
                }
                else if(minge.getX()==100 && minge.getY()<20)
                {
                    minge.setX(100);
                    minge.setY(0);
                }
            } catch(Gol g){
                if(minge.getX()==0)
                {
                    numarGoluriEchipa1++;
                }
                else if(minge.getX()==100)
                {
                    numarGoluriEchipa2++;
                }
                minge.setX(50);
                minge.setY(25);
            }
        }
        this.toString();
    }
}
