import java.util.Iterator;

public class IntBagStepIterator extends IntBagIterator {
    private final int m;
    private IntBag aBag;
    private static int index = 0 ;

    /**
     * Creates a step iterator
     * @param m Step number
     * @param bag IntBag bag
     */
    public IntBagStepIterator( int m, IntBag bag ){
        super(bag);
        this.m = m;
        aBag = bag;
    }

    /**
     * @return Returns the next object in the bag.
     */
    public Object next(){
        if( super.hasNext() ){
           index += m;
           Integer obj = Integer.valueOf( aBag.get( index - m) );
           return obj;
        }
        else{
            return null;
        }
    }

    @Override
    /**
     * @return boolean Check if the bag has a next object.
     */
    public boolean hasNext() {
        if( index < aBag.arraySize()){
            return true;
        }
        return false;
    }
}
