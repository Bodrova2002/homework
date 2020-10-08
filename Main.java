import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException{
        Vector vector1 = new Vector(5 ,6, 7);
        File file = new File("vector.txt");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){
            objectOutputStream.writeObject(vector1);
            Vector deserialized = (Vector) objectInputStream.readObject();
            System.out.println(deserialized.length());

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
