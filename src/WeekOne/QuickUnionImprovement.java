package WeekOne;

/**
 * Quick Find Optimized
 * The basic idea: to avoid tall trees,
 * Keep track of size of each tree(number of objects)
 * Balance by linking root of smaller tree to root of larger tree
 * Data Structure: Same as quick-union, but maintain extra array
 * sz[i] to count number of objects in the tree rooted at i
 * Find. Identical to quick-union
 * return root(p)==root(q)
 */

/**
 *  Union. Modify quick-union to:
 *  Link root of smaller tree to root of larger tree
 *  Update the sz[] array
 * */
public class QuickUnionImprovement {
    private int ids[];
    private int SZs[];
    private int count;

    public QuickUnionImprovement(int N) {
        count = N;

        ids = new int[N];
        for (int i = 0; i < N; i++) {
            ids[i] = i;
        }

        SZs = new int[N];
        for (int i = 0; i < N; i++) {
            SZs[i] = 1;
        }
    }

    /**
     * returns number of separate tree in UnionFind
     * */
    public int count() {
        return count;
    }

    /**
     * returns the root of the element
     * */
    private int find(int a) {
        while (ids[a] != a) {
            a = ids[a];
        }
        return a;
    }

    /**
     * returns true if two elements have the same root otherwise false
     * */
    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    /**
     * unites two trees that include a and b nodes
     * */
    public void union(int a, int b) {
        int rootOfA = find(a);
        int rootOfB = find(b);

        if (rootOfA == rootOfB) return;
        if (SZs[rootOfA] > SZs[rootOfB]) {
            ids[rootOfB] = rootOfA;
            SZs[rootOfA] += SZs[rootOfB];
        } else {
            ids[rootOfA] = rootOfB;
            SZs[rootOfB] += SZs[rootOfA];
        }
        count--;
    }


}

