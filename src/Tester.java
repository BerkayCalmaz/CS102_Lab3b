public class Tester {
    public static void main(String[] args) {
        IntBag bag = new IntBag();
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);

        IntBagIterator j = new IntBagIterator(bag);
        System.out.println( (j.next() ) );
        System.out.println( (int) j.next());
        System.out.println( (int) j.next());
        System.out.println( bag.toString() );
    }
}
