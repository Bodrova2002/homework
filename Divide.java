import java.io.*;

public class Divide {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        FileInputStream file11 = new FileInputStream(filename1);
        FileOutputStream file22 = new FileOutputStream(filename2);
        FileOutputStream file33 = new FileOutputStream(filename3);
        int len2;
        while(file11.available()>0){
            if(file11.available() %2 == 0){
                len2 = file11.available() /2;
            }
            else{
                len2 = file11.available() /2 + 1;
            }
            byte[] bufferforSecond = new byte[len2];
            byte[] bufferforThird = new byte[file11.available() / 2];
            file22.write(bufferforSecond,0,file11.read(bufferforSecond));
            file33.write(bufferforThird,0,file11.read(bufferforThird));
        }
        reader.close();
        file11.close();
        file22.close();
        file33.close();
    }
}
