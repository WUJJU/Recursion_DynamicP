import java.util.ArrayList;
public class PowerSet{
 //N subset is add array[N] to N-1 subsets and combine
  static ArrayList<String> set=new ArrayList<String>();

 

  ArrayList<String> list=new ArrayList<String>();


  public ArrayList<String> allsub(){
	 list.add("");
  	  findall(set);
  	  return list;
  }
  public void findall(ArrayList<String> set){

  //	StringBuilder sbuilder=new StringBuilder();
     
     for(int i=0;i<set.size();i++){
     	    ArrayList<String> templist=new ArrayList<String>();
     	//for(int j=0;j<list.get(i).size();j++){
            for(int j=0;j<list.size();j++){
               String temp_st=list.get(j)+set.get(i);
               //ArrayList<String> templist=new ArrayList<String>();
               templist.add(temp_st);


            }
          list.addAll(templist);
     }

  }



 public static void main(String[] args) {
 	 set.add("a");
  set.add("b");
  set.add("c");
  //set.add("d");
  
 	PowerSet ps=new PowerSet();
 	ArrayList<String> result=ps.allsub();
 	for(String st:result){
 		System.out.println(st);
 	}
 }
}