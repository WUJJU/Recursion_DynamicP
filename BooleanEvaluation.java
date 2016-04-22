import java.util.ArrayList;
import java.util.HashMap;
public class BooleanEvaluation{

       //int count=0;
       ArrayList<String> list=new ArrayList<String>();
       HashMap<String,Integer> memory=new HashMap<String,Integer>();
        HashMap<String,Integer> resultlist=new HashMap<String,Integer>();
	public int initial(String st,boolean flag){
		for(int i=0;i<st.length();i++){
		       list.add(st.substring(i,i+1));
		}
		memory.put("1",1);
		memory.put("0",0);
        evalute(list,flag);
		return resultlist.size();
	}

	public void evalute(ArrayList<String> list,boolean flag){
		if(list.size()==3){
            int n3=calculate(0,list);
            if((n3==1&&flag==true)||(n3==0&&flag==false)) {
            	String str=list.get(0)+list.get(1)+list.get(2);
            	memory.put(str,n3);
            	resultlist.put(str,n3);
            }
            return;
		}
		for(int i=0;i<list.size()-1;i=i+2){

			int n3=calculate(i,list);

		    String s3="("+list.get(i)+list.get(i+1)+list.get(i+2)+")";
		    if(!memory.containsKey(s3)) memory.put(s3,n3);
			ArrayList<String> n_list=new ArrayList<String>();
 			n_list.addAll(list);
 			n_list.add(i,s3);
 			for(int j=0;j<3;j++){

             n_list.remove(i+1);
 			}
 			//n_list.removeRange(i+1,i+4);
			
			evalute(n_list,flag);

		}
	}
	public int calculate(int i,ArrayList<String> list){
			int n1=memory.get(list.get(i));
			int n2=memory.get(list.get(i+2));
			String op=list.get(i+1);
			int n3;
			if(op.equals("&")) {
				n3=n1&n2;
			}
			else if(op.equals("^")){ n3=n1^n2;}
			else  { n3=n1|n2;}
			return n3;
	}
	public static void main(String[] args) {
		BooleanEvaluation be=new BooleanEvaluation();
		int result=be.initial("0&0&0&1^1|0",true);
		System.out.println(result);
	}
}