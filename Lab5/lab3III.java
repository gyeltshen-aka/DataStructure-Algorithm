// import java.util.Scanner;

public class lab3III{
	void bubbleSort(int a[]){
		int n = a.length;
		int tem = 0;

		for (int i=0; i < n; i++){
			for (int j=1; j<n; j++){
				if(a[j-1] > a[j]){
					tem = a[j-1];
					a[j-1] = a[j];
					a[j] = tem;
				}
			}
		}
	}

	void printing(int a[]){
		int w = a.length;
		for (int i : a ) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args){
		lab3III ob = new lab3III();

		// Scanner obj = new Scanner(System.in);
		// System.out.print("Enter the length of the a: ");
		// int length = obj.nextInt();

		// int a[] = new int[length];

		// for (int i = 0; i < length; i++){
		// 	System.out.print("Enter a elements: ");
		// 	int a = obj.nextInt();
		// 	a[i] = a;
		// }
		// int a[] = {13,15,2,7,3,9,10,12,23,1,4};

		// System.out.print("Your unsorted array is: ");
		// for (int j=0;j<a.length; j++){
		// 	System.out.print(" "+a[j]+" ");
		// }

		// //calling the method
		// ob.bubbleSort(a);
		// System.out.print("\n");
		// System.out.print("Your sorted array: ");
		// ob.printing(a);
		// System.out.print("\n");
	}
} 