package TD6.e1;

public class TripletHeterogene <T, U, V>{
    private T un;
    private U deux;
    private V trois;

    public TripletHeterogene(T un, U deux, V trois) {
        this.un = un;
        this.deux = deux;
        this.trois = trois;
    }

    public  T getUn() {
        return this.un;
    }

    public U getDeux() {
        return this.deux;
    }

    public V getTrois() {
        return this.trois;
    }
    public void afficher(){
        System.out.println("Mes trois objets du même type :"+ un
                + ", "+ deux + ", " + trois);
    }
}
/**Notre main pour que cela marche !
 * import TD6.e1.TripletHeterogene;
 *
 * import javax.print.attribute.IntegerSyntax;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         TripletHeterogene<String, Integer, Double> test = new TripletHeterogene<>("un",9,17.2);
 *         System.out.println(test.getUn());
 *         System.out.println(test.getDeux());
 *         System.out.println(test.getTrois());
 *         test.afficher();
 *
 * **/