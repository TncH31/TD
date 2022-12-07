import TD6.e1.Triplet;
import TD6.e1.TripletHeterogene;

import javax.print.attribute.IntegerSyntax;

public class Main {
    public static void main(String[] args) {
        TripletHeterogene<String, Integer, Double> test = new TripletHeterogene<>("un",9,17.2);
        System.out.println(test.getUn());
        System.out.println(test.getDeux());
        System.out.println(test.getTrois());
        test.afficher();
    }
}