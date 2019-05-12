package CourseIntroduction;

/**
 * Quick Find Optimized
 * The basic idea: to avoid tall trees,
 * Keep track of size of each tree(number of objects)
 * Balance by linking root of smaller tree to root of larger tree
 */

/**
 * Data Structure: Same as quick-union, but maintain extra array
 * sz[i] to count number of objects in the tree rooted at i
 */

/**
 * Find. Identical to quick-union
 * return root(p)==root(q)
* */

/**
 * Union. Modify quick-union to:
 *  Link root of smaller tree to root of larger tree
 *  Update the sz[] array
 * */
public class QuickUnionImprovement {
}
