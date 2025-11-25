import java.util.ArrayList;


public class ArrayListStack<T> implements Stack<T> {

	private ArrayList<T> list = new ArrayList<T>();

	// 0
	// 0 1
	// 0 1 2
	// 0 1

	// 0
	// 1 0
	// 2 1 0
	// 1 0

	public boolean isEmpty() {
		// return list.size() == 0;
		return list.isEmpty();
	}

	public void push(T obj) {
		// list.add(0, obj);
		list.add(obj);
	}

	public T peek(){
		// return list.get(0);
		return list.get(list.size()-1);
	}

	public T pop() {
		// return list.remove(0);
		return list.remove(list.size()-1);
	}

	public static void main(String[] args) {
		// ArrayListStack<Integer> l;
		// l = new ArrayListStack<Integer>();

		// System.out.println(l.isEmpty());
		// l.push(1);
		// System.out.println(l.isEmpty());
		// l.push(2);
		// System.out.println(l.peek());
		// System.out.println(l.pop());
		// System.out.println(l.pop());
		// System.out.println(l.isEmpty());


		String[] s = new String[]{"a", "b", "c", "d"};

		ArrayListStack<String> stack = new ArrayListStack<String>();

		// s = "a", "b", "c", "d" --> length = 4
		//      0    1    2    3
		// 0 1 2
		// | d |
		// | c |
		// | b |
		// | a | 
		for(int i=0; i<s.length; i++) {
			stack.push(s[i]);
		}

		int i = 0;
		while(!stack.isEmpty()) {
			s[i++] = stack.pop();
		}

		for(i=0; i<s.length; i++) {
			System.out.print(s[i]+", ");	
		}
		System.out.println();
		// s = "d", "c", "b", "a" 

		// for(i=s.length-1; i>=0; i--) {
		// 	stack.push(s[i]);
		// }

		// i = s.length;
		// while(!stack.isEmpty()) {
		// 	s[--i] = stack.pop();
		// }

		// for(i=0; i<s.length; i++) {
		// 	System.out.print(s[i]+", ");	
		// }

		for(int i=0; i<s.length; i++) {
			stack.push(s[i]);
		}

		i = 0;
		while(!stack.isEmpty()) {
			s[i++] = stack.pop();
		}

		for(i=0; i<s.length; i++) {
			System.out.print(s[i]+", ");	
		}
		System.out.println();		

	}
}
