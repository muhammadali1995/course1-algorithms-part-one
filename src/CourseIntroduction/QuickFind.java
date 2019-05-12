package CourseIntroduction;

/**
 * Constructor, taking the number of elements as an argument
 * count -> number of elements in the quickfind
 * connected(a, b) check if two sites are connected
 * find(b) returns the value of the element at index b
 * union(a, b) unites a to b by changing the values equal to id[a] to id[b]
 * ids [] -> the holder of elements in the QuickFind
 * -
 */
public class QuickFind {
    private int[] ids;
    private int count;

    public QuickFind(int N) {
        count = N;
        ids = new int[N];
        for (int i = 0; i < N; i++)
            ids[i] = i;
    }

    public int count() {
        return count;
    }

    public int find(int a) {
        return ids[a];
    }

    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public void union(int a, int b) {
        int valueOfA = find(a);
        int valueOfB = find(b);
        if (valueOfA == valueOfB) return;
        for (int i = 0; i <ids.length ; i++) {
            if (ids[i]==valueOfA) ids[i]=valueOfB;
        }
    }

}
