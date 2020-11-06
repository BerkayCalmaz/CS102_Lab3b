import java.util.Iterator;
public class TestIterators {
    public static void main(String[] args) {
        IntBag bag = new IntBag();

        //Element insertion
        bag.add(1);
        bag.add(2);
        bag.add(3);
        bag.add(4);
        bag.add(5);
        bag.add(6);
        bag.add(7);
        bag.add(8);
        bag.add(9);
        bag.add(10);

        //IntBagIterator Test!
//        Iterator i, j;
//        i = bag.iterator();
//
//        while ( i.hasNext() )
//        {
//            System.out.println( i.next() );
//            j = bag.iterator();
//            while ( j.hasNext() )
//            {
//                System.out.println( "--" + j.next() );
//            }
//        }


//        IntBagStepIterator Test
        Iterator k, z;
        k = bag.iterator(3);
        while ( k.hasNext() )
        {
            System.out.println( k.next() );
            z = bag.iterator(3);
            while ( z.hasNext() )
            {
                System.out.println( "--" + z.next() );
            }
        }


    }
}
