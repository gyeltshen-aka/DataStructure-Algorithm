import java.util.Scanner;

public class lab3III{
	void bubbleSort(int array[]){
		int n = array.length;
		int tem = 0;

		for (int i=0; i < n; i++){
			for (int j=1; j<(n-1); j++){
				if(array[j-1] > array[j]){
					tem = array[j-1];
					array[j-1] = array[j];
					array[j] = tem;
				}
			}
		}
	}

	public static void main(String[] args){
		lab3 ob = new lab3();

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = obj.nextInt();
		
		int array[] = new int[length];

		for (int i = 0; i < length; i++){
			System.out.print("Enter array elements: ");
			int a = obj.nextInt();
			array[i] = a;
		}

		System.out.print("Your unsorted array is: ");
		for (int j=0;j<array.length; j++){
			System.out.print(" "+array[j]+" ");
		}

		//calling the method
		ob.insertionSort(array);
		System.out.print("\n");
		System.out.print("Your sorted array: ");
		ob.printing(array);
		System.out.print("\n");
	}
}