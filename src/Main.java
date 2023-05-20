import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }
    public static void task1(){
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if(num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
    public static void task2(){
        List<Integer> nums = new ArrayList<>(List.of(1, 22, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> nums1 = new TreeSet<>();
        for (Integer num : nums) {
            if(num % 2 == 0) {
                nums1.add(num);
            }
        }
        System.out.println(nums1);
    }

    public static void task3(){
        List<String> days =new ArrayList<>(List.of("Monday", "Monday", "Monday", "Tuesday", "Wednesday",
                "Wednesday","Wednesday"," Thursday", "Friday"));
        Set<String> days1 = new HashSet<>();
        for (String day : days) {
            days1.add(day);
        }
        System.out.println(days1);
    }
    public static void task4(){
        List<String> strings = new ArrayList<>(List.of("два","два","два","один", "два","два", "три", "три", "три"));
        Map<String, Integer> stringsMap = new LinkedHashMap<>();
        for (String string : strings) {
            if (!stringsMap.containsKey(string)) {
                stringsMap.put(string, 0);
            }
            if (stringsMap.containsKey(string)) {
                stringsMap.put(string,stringsMap.get(string)+1);
            }
        }
        System.out.println(stringsMap.values());
    }


}