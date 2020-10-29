import java.util.HashMap;
import java.util.Map;

public class Solution6 {
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Bodrova", "Marina");
        map.put("Stepanova", "Daria");
        map.put("Bunchuk", "Maria");
        map.put("Litvak", "Nikolay");
        map.put("Dobretsov", "Boris");
        map.put("Chugreeva", "Daria");
        map.put("Parfenov", "Dima");
        map.put("Koroleva", "Maria");
        map.put("Korogodin", "Egor");
        map.put("Ilynskiy", "Dima");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            copy2.remove(pair.getKey());
            if (copy2.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
    public static void printMap(HashMap<String, String> map){
        for (Map.Entry<String, String> pair : map.entrySet()){
            System.out.print(pair.getKey() + " ");
            System.out.println(pair.getValue());
        }
    }
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }
}
