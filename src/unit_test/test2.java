package unit_test;

public class test2 {
	private Node x;
	private int[] array1;
	
	public test2(){
		
	}
	
	public void setNode(int r, int l) {
		x = new Node();
		x.setLeftnode(l);
		x.setRightnode(r);
	}
	
	public Node getNode() {
		return x;
		
	}
	
	public void setArray(int[] p) {
		array1 = p;
	}

	public int[] getArray1() {
		return array1;
	}
}
