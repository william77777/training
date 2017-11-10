package app.data;

/**
 * Reference: https://en.wikipedia.org/wiki/Heap_(data_structure)
 * 
 * @author wums
 *
 */
public class HeapExample {
	public static void main(String[] args) {

	}
}

interface Heap<T> {
	T insert();

	T delete();
//	T replace(T value);

//	Heap<T> createHeap();
//
//	Heap<T> heapify(T[] arr);

	// add more general methods
	// find
	// extract
	// replace
	int size();
}

abstract class BinaryHeap<T> implements Heap<T> {

	private T[] data;

	@Override
	public int size() {
		return data.length;
	}
	
	abstract void doubleArray();
}

//class MaxBinaryHeap<T> extends BinaryHeap<T>{
//	
//}
