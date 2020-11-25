import java.io.*;

public class EmphasizingNumbers {
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        while(file1.ready()){
            for(String string: file1.readLine().split(" ")){
                if(checkString(string)) {
                    file2.write(string + " ");
                }
            }
        }
        file1.close();
        file2.close();
        reader.close();
    }
    public static boolean checkString(String string1){
        if(string1==null || string1.length()==0){
            return false;
        }
        try{
            Integer.parseInt(string1);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }
}
