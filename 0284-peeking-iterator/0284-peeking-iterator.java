// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
int arr[]=new int[1001];
int k=0;
int i=0;
	public PeekingIterator(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
arr[k]= iterator.next();
k++;

}

 
	    // initialize any member here.
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {

        return arr[i];

    
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {

        int v=arr[i];
i++;
return v;


	    
	}
	
	@Override
	public boolean hasNext() {
if(i<k){
    return true;
}
 
 return false;
	
	    
	}
}