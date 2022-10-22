package que55;
import java.util.*;

public class que55 {    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //Scanner
		int T=sc.nextInt();                 //input num of test cases
		int sum[]=new int[10000];

		for(int loop=0;loop<T;loop++){

			int N = sc.nextInt();           // input num of elements in arr
			int D = sc.nextInt();           // input difference limit
			int arr[]=new int[N];


			for(int i =0; i<N; i++){
				arr[i]=sc.nextInt();
			}

			//sorting
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}

			//comparing
			sum[loop]=0;
			for (int i = n - 1; i > 0; i--)
			{
				if (arr[i] - arr[i - 1] < D)
				{
					sum[loop] += (arr[i - 1] + arr[i]);
					i--;
				}
			}
		}

		//display

		for(int loop=0;loop<T;loop++){
			System.out.println(sum[loop]);
		}
		sc.close();
	}
}
