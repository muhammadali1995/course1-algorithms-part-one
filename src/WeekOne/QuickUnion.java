package WeekOne;

/**
 * QuickUnion
 */
public class QuickUnion {
    private int[] ids;
    private int count;

    public QuickUnion(int N) {
        ids = new int[N];
        count = N;
        for (int i = 0; i < N; i++) ids[i] = i;
    }

    /**
     * returns number of elements in the QuickUnion
     */
    public int count() {
        return count;
    }

    /**
     * returns the root of the element
     */
    private int find(int a) {
        while (ids[a] != a) {
            a = ids[a];
        }
        return a;
    }

    /**
     * returns true if the to element has the same root
     */
    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    /**
     * unites two element
     */
    public void union(int a, int b) {
        int rootOfA = find(a);
        int rootOfB = find(b);
        if (rootOfA == rootOfB) return;

        ids[rootOfA] = rootOfB;
        count--;
    }


}
