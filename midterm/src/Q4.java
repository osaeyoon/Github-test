


public class Q4 {
	public static String toKary(int n, int k) {
		if (n < k) return "" + n;
		else return toKary(n/k, k) + n % k;
		// fill here!
		
	}
	public static void main(String[] args) {
		System.out.println(toKary(15, 2)); // 1111
		System.out.println(toKary(15, 3)); // 120
	}
}
