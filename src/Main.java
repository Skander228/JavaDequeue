import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        long maxCount = 0;
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > maxCount) {
                    maxCount = set.size();
                }

                int removed = (int) deque.remove();

                if (!deque.contains(removed)){
                    set.remove(removed);
                }
            }
        }
        System.out.println(maxCount);
    }
}