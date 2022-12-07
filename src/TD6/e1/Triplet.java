package TD6.e1;

public class Triplet<T> {
    private T un, deux, trois;

    public Triplet(T un, T deux, T trois) {
        this.un = un;
        this.deux = deux;
        this.trois = trois;
    }

    public  T getUn() {
        return this.un;
    }

    public T getDeux() {
        return this.deux;
    }

    public T getTrois() {
        return this.trois;
    }
    public void afficher(){
        System.out.println("Mes trois objets du même type :"+ un
                + ", "+ deux + ", " + trois);
    }
  }
/**
 * Notre main pour que cela marche !
import TD6.Triplet;

public class Main {
    public static void main(String[] args) {
        Triplet<String> test = new Triplet<>("un","deux","trois");
        System.out.println(test.getUn());
        System.out.println(test.getDeux());
        System.out.println(test.getTrois());
        test.afficher();
    }
}
 **/
