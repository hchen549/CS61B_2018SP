
public class ArrayDeque<T> {
	
	private T[] items;
	private int nextFirst;
	private int nextLast;
	private int size;
	
	public ArrayDeque() {
		items = (T[]) new Object[8];
		size = 0;
		nextFirst = 7;
		nextLast = 0;
		
	}
	
	private void resize() {
		T[] largeArray = (T[]) new Object[size * 2];
		for (int i = 1; i <= size; i++ ) {
			int newIndex = (nextFirst + i) % size;
			System.out.print(items[newIndex]);
			largeArray[newIndex] = items[newIndex];
		}
//		System.arraycopy(items, nextLast, largeArray, nextLast, size);
		nextLast = size + nextLast;
		nextFirst = size + nextFirst;
		items = largeArray;
		for(T item: items){
			System.out.println(item + " ");
		}
	}
	
	public void addFirst(T item) {
		if(size < items.length) {
			items[nextFirst] = item;
			nextFirst --;
			if (nextFirst == -1) {
				nextFirst = items.length - 1;
			}
		} else {
			resize();
//			System.out.println(nextFirst);
//			System.out.println(nextLast);
//			System.out.println(items.length);
			items[nextFirst] = item;
			nextFirst --;
			if (nextFirst == -1) {
				nextFirst = items.length - 1;
			}
			
		}
		
		size ++;
	}
	
	public void addLast(T item) {
		if(size < items.length) {
			items[nextLast] = item;
			nextLast ++;
			
			if (nextLast == items.length) {
				nextLast = 0;
			}
		} else {
			resize();
			items[nextLast] = item;
			nextLast ++;
			
			if (nextLast == items.length) {
				nextLast = 0;
			}
		}
		
		size ++;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void printDeque() {
		String output = "";
		for (int i = 1; i <= size; i++) {
			int newIndex = (nextFirst + i) % items.length;
			output += items[newIndex];
			output += " ";
		}
		System.out.println(output);
	}
	
	public T removeFirst() {
		if(nextFirst == items.length - 1) {
			nextFirst = 0;
		} else {
			nextFirst ++;
		}
		T returnValue = items[nextFirst];
		items[nextFirst] = null;
		size --;
		return returnValue;
		
		
	}
	
	public T removeLast() {
		if (nextLast == 0) {
			nextLast = items.length - 1;
		} else {
			nextLast --;
		}
		T returnValue = items[nextLast];
		items[nextLast] = null;
		size --;
		return returnValue;
	}
	
	public T get(int index) {
		int newIndex = (nextFirst + index + 1) % items.length;
		return items[newIndex];
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayDeque<Integer> target = new ArrayDeque<>();
//        target.addFirst(3);
//        target.addFirst(5);
//        target.addFirst(11);
//        target.addFirst(4);
//        target.addFirst(7);
//        target.addFirst(14);
//        target.addFirst(24);
//        target.addFirst(56);
////        System.out.println(target.get(1));
//        target.addFirst(70);
//        
//        target.printDeque();
//	}

}
