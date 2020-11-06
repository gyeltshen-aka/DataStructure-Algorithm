public class binary{
	public static void main(String[] args) {
		lab3III obj = new lab3III();

		int a[] = {13,15,2,7,3,9,10,12,23,1,4};
		int target = 4;
		int hi = a.length - 1;
		int lo = 0;	

		
		obj.bubbleSort(a);
		printingArray(a);
		binarySearch(a, target, hi, lo);
	}

	public static void binarySearch(int a[], int target, int hi, int lo){
		int mid = (lo+hi) / 2;

		while(lo <= hi){
			if(a[mid] < target){
				lo = mid + 1;
			}
			else if(a[mid] == target){
				System.out.println("The given target "+target+" is found at index: "+mid);
				break;
			}
			else{
				hi = mid - 1;
			}
			mid = (lo + hi) / 2;
		}
		if (lo > hi) {
			System.out.println("Target not found.");
		}

	}

	public static void printingArray(int a[]){
		for (int i : a){
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
}