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
        bag.add(12);
        Iterator i, j;
        i = bag.iterator();
        while ( i.hasNext() )
        {
            System.out.println( i.next() );
            j = bag.iterator();
            while ( j.hasNext() )
            {
                System.out.println( "--" + j.next() );
            }
        }

    }
}
