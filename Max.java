import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Max {
        public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            reader.close();
            FileInputStream file = new FileInputStream(filename);
            int max= file.read();
            while(file.available() > 0){
                int current = file.read();
                if(current>max){
                    max=current;
                }
            }
            file.close();
            System.out.println(max);
        }
    }

