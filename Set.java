import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Set{
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        ArrayList<Integer> listall = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listother = new ArrayList<Integer>();
        for(int i=0; i<20;i++){
            int n = Integer.parseInt(reader.readLine());
            listall.add(n);
        }
        for(int i=0;i<listall.size();i++){
            if(listall.get(i) % 3==0){
                list3.add(listall.get(i));
            }
            if(listall.get(i) %2==0){
                list2.add(listall.get(i));
            }
            if(listall.get(i) %3 != 0 && listall.get(i) % 2 !=0){
                listother.add(listall.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(listother);
    }
    public static void printList(List<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
