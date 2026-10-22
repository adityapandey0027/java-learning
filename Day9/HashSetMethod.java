import java.util.*;
import java.util.function.Predicate;

class HashSetMethod {
    public static void main(String[] args) {

        // 1. add()
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("After add(): " + set);

        // 2. remove()
        set.remove(20);
        System.out.println("After remove(): " + set);

        // 3. contains()
        System.out.println("Contains 10? " + set.contains(10));

        // 4. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 5. size()
        System.out.println("Size: " + set.size());

        // 6. addAll()
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);
        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 7. removeAll()
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 8. retainAll()
        set.add(40);
        set.add(50);
        set.retainAll(set2);
        System.out.println("After retainAll(): " + set);

        // 9. containsAll()
        System.out.println("ContainsAll set2? " + set.containsAll(set2));

        // 10. iterator()
        System.out.print("Using iterator(): ");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 11. forEach()
        System.out.print("Using forEach(): ");
        set.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 12. clear()
        HashSet<Integer> temp = new HashSet<>(set);
        temp.clear();
        System.out.println("After clear(): " + temp);

        // 13. clone()
        HashSet<Integer> cloned = (HashSet<Integer>) set.clone();
        System.out.println("Cloned set: " + cloned);

        // 14. toArray()
        Object[] arr = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr));

        // 15. toArray(T[] a)
        Integer[] arr2 = set.toArray(new Integer[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(arr2));

        // 16. removeIf()
        set.removeIf(x -> x > 40);
        System.out.println("After removeIf(): " + set);

        // 17. spliterator()
        System.out.print("Using spliterator(): ");
        Spliterator<Integer> sp = set.spliterator();
        sp.forEachRemaining(x -> System.out.print(x + " "));
        System.out.println();

        // 18. stream()
        System.out.print("Using stream(): ");
        set.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 19. parallelStream()
        System.out.print("Using parallelStream(): ");
        set.parallelStream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 20. equals()
        HashSet<Integer> anotherSet = new HashSet<>(set);
        System.out.println("Equals anotherSet? " + set.equals(anotherSet));
    }
}