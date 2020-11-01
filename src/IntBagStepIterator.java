import java.util.Iterator;

public class IntBagStepIterator extends IntBagIterator {
    private final int m;
    private IntBag aBag;
    private static int index = 0 ;

    public IntBagStepIterator( int m, IntBag bag ){
        super(bag);//WHATS THE POINT OF THIS.
        this.m = m;
        aBag = bag;//WHY CANT SUPER(BAG) DO THIS? WHAT'S THE DIFFERENCE??
    }

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
    public boolean hasNext() {
        if( index < aBag.arraySize()){
            return true;
        }
        return false;
    }
}
