import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

class ListClass {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        
        arr.add(10);
        arr.add(4);
        arr.add(20);
        arr.add(1);
        arr.add(3);
        Collections.sort(arr, Collections.reverseOrder());
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        System.out.println(it.next());


        // ensure capacity of ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        

    }
}