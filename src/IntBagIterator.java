import java.util.Iterator;

public class IntBagIterator implements Iterator {
    private IntBag aBag;
    private static int index;

    /**
     * Creates a bag
     * @param bag
     */
    public IntBagIterator( IntBag bag ){
        aBag = bag;
    }

    @Override
    public boolean hasNext() {
        if( index < aBag.arraySize() ){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if( hasNext() ) {
            index++;
            Integer obj = Integer.valueOf(aBag.get(index - 1));
            return obj;
        }
        else{
            return null;
        }
    }

    public int nextInt(){
        if( hasNext() ) {
            index++;
            return aBag.get( index -1 );
        }
        else{
            return -1;
        }
    }
}
