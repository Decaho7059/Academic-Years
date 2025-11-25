public interface Stack<T> {
	// Stack<Integer> s; // correct
	// s = new Stack<Integer>; // error
	// 0
	// 0 1
	// 0 1 2
	public boolean isEmpty();
	public void push(T obj);
	public T peek();
	public T pop();
}



