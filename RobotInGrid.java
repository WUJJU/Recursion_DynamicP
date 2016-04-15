import java.util.LinkedList;
import java.util.Arrays;
public class RobotInGrid{



	int[][] matrix;
	LinkedList<IntPair> result=new LinkedList<IntPair>();
	LinkedList<IntPair> final_result=new LinkedList<IntPair>();
	public LinkedList<IntPair> initial(int n, int m,int dn,int dm,LinkedList<IntPair> list){

		matrix=new int[n][m];
		matrix[dn][dm]=1;
		for(int i=0;i<list.size();i++){
			IntPair ip=list.get(i);
			matrix[ip.getP1()][ip.getP2()]=-1;
		}
		System.out.println(Arrays.deepToString(matrix));
		IntPair ini=new IntPair(1,1);
		result.add(ini);
		findPath(ini,result);
		if(final_result.size()==0) System.out.println("final_result is null");
		return final_result;

	}
	int[][] directs={{0,1},{1,0}};

	public  void findPath(IntPair cur,LinkedList<IntPair> list){
     
        
        if(outofboundary(cur)) return;
        if(matrix[cur.getP1()][cur.getP2()]==-1) return;
        if(matrix[cur.getP1()][cur.getP2()]==1) {
        	final_result=list;
        
        	} 
        	if(final_result.size()!=0) return;

        for(int[] direct:directs ){
        	IntPair temp=new IntPair(cur.getP1()+direct[0],cur.getP2()+direct[1]);

            LinkedList<IntPair>templist=(LinkedList<IntPair>)list.clone();
            templist.add(temp);
        	findPath(temp,templist);

        }

	}
	public Boolean outofboundary(IntPair cur){
		if(cur.getP1()>4||cur.getP2()>4){ return true;}
		else return false;
	}
	public static void main(String[] args) {
		LinkedList<IntPair> list=new LinkedList<IntPair>();
		IntPair ip1=new IntPair(1,3);
		IntPair ip2=new IntPair(2,2);
		IntPair ip3=new IntPair(2,1);
		list.add(ip1);
		list.add(ip2);
		list.add(ip3);

		RobotInGrid ro=new RobotInGrid();
		LinkedList<IntPair> flist=ro.initial(5,5,4,4,list);
        for(int i=0;i<flist.size();i++){
        	System.out.println("["+flist.get(i).getP1()+","+flist.get(i).getP2()+"]"+"--->");
        }		
	}
}