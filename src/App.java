public class App {
    public static void main(String[] args) throws Exception {
       Exemplu e = new Exemplu();
       e.doSomething(1);
       Joc joc1 = new Joc("Real Madrid", "FC Barcelona");
       Joc joc2 = new Joc("FC Sanmartin", "FC Hidiselu de Sus");
       joc1.simuleaza();
       joc2.simuleaza();
    }
}
