public class linkListTest {

	public static void main(String[] args) {
		linklist obj = new linklist();
		obj.addFirst(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		
		assert(obj.size() == 4);
		assert(obj.isEmpty() == false);
		assert(obj.first() == 1);
		assert(obj.last() == 4);
		assert(obj.removeFirst() == 1);
		assert(obj.size() == 3);
		assert(obj.first() == 2);
		System.out.println("All Test Cases Passed");
	}
}