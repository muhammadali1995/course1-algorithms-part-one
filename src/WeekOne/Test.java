package WeekOne;

public class Test {
    public static void main(String[] args) {

        //Testing QuickFind
        QuickFind quickFind = new QuickFind(15);
        quickFind.union(1, 3);
        assert quickFind.count() == 14;

        //Testing QuickUnion
        QuickUnion quickUnion = new QuickUnion(12);
        quickUnion.union(1, 3);
        assert quickUnion.count() == 11;


        //Testing QuickFindImprovement
        QuickUnionImprovement quickUnionImprovement = new QuickUnionImprovement(15);
        quickUnionImprovement.union(12, 13);
        assert quickUnionImprovement.count() == 14;
    }
}
