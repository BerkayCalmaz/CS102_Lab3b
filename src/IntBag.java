/*
 * This class has methods to modify a collection
 */
import java.util.Arrays;
import java.util.Iterator;

public class IntBag {
    // properties
    private int[] bag;

    /**
     * Constructs a integer array with the first element -1.
     */
    public IntBag(){
        bag = new int[4];
        bag[0] = -1;
    }

    /**
     * Adds an integer
     * @param add The integer which will be added.
     */
    public void add( int add ){
        if( bag[bag.length - 1] == -1 ){
            int[] bagReplace;
            bagReplace = Arrays.copyOf(bag, 2 * bag.length);
            bag = bagReplace;
        }
        for( int i = 0; i < bag.length - 1; i++ ){
            if( bag[i] == -1){
                bag[i] = add;
                bag[i+1] = -1;
                i = bag.length;
            }
        }
    }

    /**
     * Adds an integer to a specific index.
     * @param add The integer which will be added.
     * @param index The index int will be added.
     * @return int A number to represent if the addition is successful or not.
     */
    public int addIntTo( int add, int index ){
        int iIndex = this.arraySize(); //Just to prevent initializing problems.
        if( bag[bag.length-1] == -1 ){ //If the array is full, double it.
            int[] bagReplace;
            bagReplace = Arrays.copyOf(bag, 2 * bag.length);
            bag = bagReplace;
        }
        if( iIndex <= index ){ //Setting the rules for index.
            return -1; //Means that the num is not added.
        }
        else{
            for(int i = iIndex; i > index -1; i--){
                bag[i+1] = bag[i];
            }
            bag[index] = add;
            return 1;//Means that the num is added.
        }
    }

    /**
     * Removes an int from an index
     * @param index The index which will be removed
     */
    public void remove( int index ){
        int iIndex = this.arraySize();
        bag[index] = bag[iIndex-1];
    }

    /**
     * Check if a num is in the collection
     * @param num The int which will be checked
     * @return boolean Returns true if the num is in collection
     */
    public boolean check( int num ){
        boolean returnValue = false;
        for(int i = 0; i< this.arraySize(); i++ ){
            if( bag[i] == num ){
                returnValue = true;
            }
        }
        return returnValue;
    }

    /**
     * @return int Returns the filled array size.
     */
    public int arraySize(){
        int iIndex = 0;
        for( int i = 0; i < bag.length; i++){//finding the index of i.
            if( bag[i] == -1 ){
                iIndex = i;
                i = bag.length;
            }
        }
        return iIndex;
    }

    /**
     * Returns the integer in a specified index.
     * @param index Wanted index of an array.
     * @return int The integer in the index.
     */
    public int get( int index ){
        return ( bag[index] );
    }

    /**
     * return String Returns the elements in the array
     */
    public String toString(){
        String returner = "";
        for ( int i = 0; i < this.arraySize(); i++ ){
            returner = returner + " " + bag[i];
        }
        return returner;
    }

    /**
     * @param remove the index of the element of removal
     */
    public void removeAll( int remove){
        int[] removeBag = new int[ bag.length ];
        int counter = 0;
        for( int i = 0; i <=  this.arraySize(); i++ ){
            if( remove != bag[i] ){
                removeBag[i - counter] = bag[i];
            }
            else{
                counter++;
            }
        }
        bag = removeBag;
    }

    public Iterator iterator(){
        Iterator IntBagIterator;
        IntBagIterator = new IntBagIterator( this );
        return IntBagIterator;
    }

    public Iterator iterator( int m ){
        Iterator IntBagStepIterator = new IntBagStepIterator( m, this);
        return IntBagStepIterator;
    }
}