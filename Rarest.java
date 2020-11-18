import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rarest {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = new FileInputStream(reader.readLine());
        List<Integer> list = new ArrayList<>();
        while(file.available()>0){
            list.add(file.read());
        }
        Collections.sort(list);
        int current =0;
        int min = list.size();
        List<Integer> file1 = new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                current++;
            }
            else{
                if(current<min){
                    file1.clear();
                    file1.add(list.get(i));
                    min=current;
                }
                else if(current==min){
                    file1.add(list.get(i));
                }
                current = 0;
            }
        }
        for(int x:file1){
            System.out.println(x + " ");
        }
        reader.close();
        file.close();
    }
}

