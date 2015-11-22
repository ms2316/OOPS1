
public class Task {

	public static int sum(int[] a) {
		int ans = 0;
		for (int i = 0; i < a.length; i++)
			ans+=a[i];
		return ans;
	}
	
	public static int[] cumsum(int[] a) {
		int[] ans = new int[a.length];
		ans[0] = a[0];
		for (int i = 1; i < a.length; i++)
			ans[i] = ans[i-1] + a[i];
		return ans;
	}
	
	public static int[] positives(int[] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] > 0) cnt++;
			
		int[] ans = new int[cnt];
		for (int i = 0; i < a.length; i++)
			if (a[i] > 0) ans[--cnt] = a[i];
			
		return ans;
	}
	
	public static float[][] create(int n) {
		return (new float[n][n]);
	}
	
	public static void vectorAdd(int[] x, int[] y, int dx, int dy) {
		x[0] += dx;
		y[0] += dy;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int[] psum = cumsum(nums);
		int[] pos = positives(nums);
		
		System.out.println( sum(nums) );
		
		for (int i = 0; i < psum.length; i++)
			System.out.print(psum[i] + " ");
		System.out.println();	
		
		for (int i = 0; i < pos.length; i++)
			System.out.print(pos[i] + " ");
		System.out.println();	
		
		int[] a = {0};
		int[] b = {2};
		vectorAdd(a,b,1,1);
		System.out.println(a[0]+" "+b[0]);
	}

}