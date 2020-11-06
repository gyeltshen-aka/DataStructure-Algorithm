public class keyindex{
	public static void main(String[] args){
		int arr[] = {'a','r','w','j','c'};
		int N = arr.length;
		int R = 256;
		int aux[] = new int[R+1];

		
		int[] count = new int[R+1];
		for (int i = 0; i<N; i++){
			count[arr[i]+ 1]++;
		}

		for(int r = 0; r < R; r++){
			count[r+1] = count[r+1] + count[r];
		}

		for (int i = 0; i<N; i++){
			aux[count[arr[i]]++] = arr[i];
		}

		for (int i= 0; i<N; i++){
			arr[i] = aux[i];
		}
			
		show(arr);
	}
	public static void show(int arr[]) {
		for(int i : arr){
			System.out.print(i+ " ");
		}
		System.out.print("\n");	
	}
}