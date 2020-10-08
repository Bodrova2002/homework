import java.io.Serializable;

public class Vector{
    private double x;
    private double y;
    private double z;
    public Vector(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }
    public double scalarProduct(Vector vector){
        return x*vector.x + y*vector.y + z*vector.z;
    }
    public Vector crossProduct(Vector vector){
        return new Vector(
                y*vector.z - z*vector.y,
                z*vector.x - x*vector.z,
                x*vector.y - y*vector.x);
    }
    public double cos(Vector vector){
        return scalarProduct(vector)/(length()*vector.length());
    }
    public Vector add(Vector vector){
        return new Vector(
                x+vector.x,
                y+vector.y,
                z+vector.z
        );
    }
    public Vector subtract(Vector vector){
        return new Vector(
                x-vector.x,
                y-vector.y,
                z-vector.z
        );
    }
}
