// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    int arr[]=new int[1001];
    int curr=0;
    int itr=0;
	public PeekingIterator(Iterator<Integer> iterator) {

        while(iterator.hasNext()){
            arr[curr]=iterator.next();
            curr++;
        }
	    // initialize any member here.
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {

        return arr[itr];
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
int val=arr[itr];
itr++;
return val;

	    
	}
	
	@Override
	public boolean hasNext() {

        if(itr<curr){
         
            return true;
        }
        return false;
	    
	
	    
	}
}