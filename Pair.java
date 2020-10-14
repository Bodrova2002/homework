public class Pair <X1, X2>{
    private Pair(X1 x1, X2 x2){
        firstValue = x1;
        secondValue = x2;
    }
    private X1 firstValue;
    private X2 secondValue;
    public static <X1, X2> Pair<X1, X2>of(X1 x1, X2 x2){
        return new Pair(x1, x2);
    }
    public X1 getFirst(){
        return firstValue;
    }
    public X2 getSecond(){
        return secondValue;
    }
}
