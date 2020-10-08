/**
 * @author marina
 * @version 1.0
 */

public class Vector{
    /**
     * fields that store the coordinates of the vector
     */
    private double x;
    private double y;
    private double z;

    /**
     * This is constructor of creating a new vector
     * @param x
     * @param y
     * @param z
     * @since 1.0
     */
    public Vector(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    /**
     * calculates the length of the vector
     * @return a number, which is a length of the given vector
     */
    public double length(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * calculates the scalar product of two vectors
     * @param vector vector
     * @return a number, which is a scalarProduct of two given vectors
     */
    public double scalarProduct(Vector vector){
        return x*vector.x + y*vector.y + z*vector.z;
    }

    /**
     * calculates the cross product of two vectors
     * @param vector vector
     * @return vector, which is a crossProduct of two given vectors
     */
    public Vector crossProduct(Vector vector){
        return new Vector( y*vector.z - z*vector.y,
        z*vector.x - x*vector.z,
        x*vector.y - y*vector.x);
    }

    /**
     * claculates the cos between two vectors
     * @param vector vector
     * @return cos between two given vectors
     */
    public double cos(Vector vector){
        return scalarProduct(vector)/(length()*vector.length());
    }

    /**
     * calculates the sum of two vectors
     * @param vector vector
     * @return vector, which is the sum of two given vectors
     */
    public Vector add(Vector vector){
        return new Vector(
                x+vector.x,
                y+vector.y,
                z+vector.z
        );
    }

    /**
     * calculates the subtraction of two vectors
     * @param vector vector
     * @return vector, which is subtraction of two given vectors
     */
    public Vector subtract(Vector vector){
        return new Vector(
                x-vector.x,
                y-vector.y,
                z-vector.z
        );
    }
}
