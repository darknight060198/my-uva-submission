import java.util.Scanner;

public class p12032 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		for (int i = 1; i <= tc; i++) {
			int byk = input.nextInt();
			int [] data = new int[byk];
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < byk; j++) {
				data[j] = input.nextInt();
				if (data[j] > max) max = data[j];
			}
			
			System.out.printf("Case %d: %d\n", i, search(data, 0, max, 0));
		}
	}
	
	static int search(int [] arr, int low, int high, int currJawaban) {
		if (low > high) return currJawaban;
		else {
			int mid = (low+high)/2;
			if (cobaJawaban(arr, mid)) {
				high = mid-1;
				currJawaban = mid;
			} else {
				low = mid+1;
			}
			return search(arr, low, high, currJawaban);
		}
	}
	
	static boolean cobaJawaban(int [] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				if (arr[i] > k) {
					return false;
				} else {
					if (arr[i] == k) {
						k--;
					}
				}
			} else {
				if (arr[i] - arr[i-1] > k) {
					return false;
				} else {
					if (arr[i]-arr[i-1] == k) {
						k--;
					}
				}
			}
		}
		return true;
	}
}