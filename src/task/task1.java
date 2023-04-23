package task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class task1 {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов", 8956453, bookPhone);
        addNumber("Иванов", 8945654, bookPhone);
        addNumber("Агмалов", 8978905, bookPhone);
        addNumber("Петров", 8956617, bookPhone);
        addNumber("Иванов", 89123456, bookPhone);
        addNumber("Петров", 89123543, bookPhone);
        addNumber("Друнов", 891345213, bookPhone);
        printBook(bookPhone);
    }
}
