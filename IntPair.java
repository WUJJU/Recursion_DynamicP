import java.util.Arrays;
public class IntPair{

	private int p1;
	private int p2;
	public IntPair(int p1, int p2){
		this.p1=p1;
		this.p2=p2;
	}
	public int getP1(){
		return p1;
	}
	public int getP2(){
		return p2;
	}
	public void set(int p1, int p2){
		this.p1=p1;
		this.p2=p2;
	}
	public static void main(String[] args) {
		int[][] directs={{0,1},{1,0},{1,1,2}};
		//for(int [] row:directs)
		System.out.println(directs[2][2]);
	 //    System.out.println("---------");
	    //System.out.println(Arrays.toString(row));
	}
}