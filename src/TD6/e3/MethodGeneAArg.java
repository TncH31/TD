package TD6.e3;

public class MethodGeneAArg {
    public static <T> T maMethode(T [] tableau){
    return tableau[(int) (Math.random() * (tableau.length - 1))];
    }
    public static <T> T alea(T un, T deux){
        return Math.random() > 0.5? un : deux;
    }
}
