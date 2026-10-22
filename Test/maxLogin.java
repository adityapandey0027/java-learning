import java.util.*;

public class maxLogin {
    public static void main(String [] args){
        String [] arr = {"alice 2026-02-11",
                            "bob 2026-02-10",
                            "alice 2026-02-10",
                            "carol 2026-05-02",
                            "alice 2026-02-12",
                            "bob 2026-02-11",
                            "carol 2026-05-01",
                            "alice 2026-02-10",
                            "carol 2026-05-03"};

        maxLoginFreq(arr);
    }

   static void maxLoginFreq(String [] arr){
        Map<String, List<String>> map = new HashMap<>();

        for(String str : arr){
            String key = str.split(" ")[0];
            String value = str.split(" ")[1];

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(value);
        }

        int maxFreq = 0;
        Map<String, Integer> ans = new TreeMap<>();

        for(String key : map.keySet()){
            List<String> list = map.get(key);
            Collections.sort(list);
            int count = 1;
            int maxCount = 1;
            for(int i= 1; i<list.size(); i++){
                if(list.get(i).equals(list.get(i -1))) continue;

                if(isNext(list.get(i -1), list.get(i))){
                    count++;
                }else{
                    count = 1;
                }
                maxCount = Math.max(maxCount, count);
                maxFreq = Math.max(maxFreq, maxCount);
            }

            ans.put(key, maxCount);
        }

        for(String key : ans.keySet()){
            if(ans.get(key) == maxFreq){
                System.out.println(key + " "+ans.get(key));
            }
        }
   }

   static boolean isNext(String date1, String date2){
        java.time.LocalDate d1 = java.time.LocalDate.parse(date1);
        java.time.LocalDate d2 = java.time.LocalDate.parse(date2);

        return d1.plusDays(1).equals(d2);

   }
}
