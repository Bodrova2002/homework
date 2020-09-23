
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double x1,y1,z1,x2,y2,z2;
        Scanner in = new
                Scanner(System.in);
        x1=in.nextDouble();
        y1=in.nextDouble();
        z1=in.nextDouble();
        x2=in.nextDouble();
        y2=in.nextDouble();
        z2=in.nextDouble();
        Vector vector1 = new Vector(x1,y1,z1);
        Vector vector2 = new Vector(x2,y2,z2);
        System.out.println(vector1.length());
        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.cos(vector2));
    }
}
