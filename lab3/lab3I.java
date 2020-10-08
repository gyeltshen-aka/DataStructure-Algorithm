import java.util.Scanner;

public class lab3I{
	void insertionSort(int array[]){
		int n = array.length;
		for (int i=1;i<n ; i++) {
			int newArray = array[i];
			int j = i-1;
			while (j>=0 && array[j] > newArray) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = newArray;
		}
	}
	void printing(int array[]){
		int q = array.length;
		for (int i=0; i<q;i++){
			System.out.print(" "+array[i]+" ");
		}
	}
	public static void main(String[] args){
		lab3 object = new lab3();

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = obj.nextInt();
		
		int array[] = new int[length];

		for (int i = 0; i < length; i++){
			System.out.print("Enter array elements: ");
			int a = obj.nextInt();
			array[i] = a;
		}

		System.out.print("Your array is: ");
		for (int j=0;j<array.length; j++){
			System.out.print(" "+array[j]+" ");
		}

		//calling the method
		object.insertionSort(array);
		System.out.print("\n");
		System.out.print("Your sorted array: ");
		object.printing(array);
		System.out.print("\n");
	}
}