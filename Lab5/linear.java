public class linear{
	public static void main(String[] args) {
		int [] a = {3,4,2,1,4,2,5,6,23,45,12,5,3,};
		int target = 4;

		linearSearch(a, target);
	}
	public static void linearSearch(int a[], int target){
		int x = a.length;
		System.out.println("The target is: "+target);
		System.out.print("\n");
		for (int i = 0; i< x; i++){
			if (target==a[i]){
				System.out.println("Target present at index: "+ i);
				// break; 
			}
			else{
				System.out.println("Target not found at index: "+i);
			}
		}
	}
}