package LinkedList;
import java.util.*;
public class threeSum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of list A
        int m = sc.nextInt(); // size of list B
        int k = sc.nextInt(); // size of list C

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) A.add(sc.nextInt());

        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < m; i++) B.add(sc.nextInt());

        List<Integer> C = new ArrayList<>();
        for (int i = 0; i < k; i++) C.add(sc.nextInt());

        int target = sc.nextInt();

        // Store all possible sums of pairs from A and B
        Map<Integer, int[]> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                map.put(a + b, new int[]{a, b});
            }
        }

        // Now check for each element in C if (target - c) exists in map
        boolean found = false;
        for (int c : C) {
            int required = target - c;
            if (map.containsKey(required)) {
                int[] pair = map.get(required);
                System.out.println(pair[0] + " " + pair[1] + " " + c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }

        sc.close();
    }
}


