package unit_test;

public class Int_test {
	
	private int i;
	private int j;
	
	
	public Int_test(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public int test_output() {
		if (i > j)
			return -1;
		
		while (i < j) {
			i++;
		}
		return i;
		
	}
}
