import java.util.ArrayList;
public class Parens{



	ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
	int start=0;
	public void initial(int N){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("()");
        list.add(arr);
        if(N==1) return;
        findAll(list,N);

        ArrayList<String> result=list.get(N-1);
        for(int i=0;i<result.size();i++){
          System.out.println(result.get(i));
        }

	}

	 public void findAll(ArrayList<ArrayList<String>> list,int n){
      if(start>n-2) return;
	 	   
	 		ArrayList<String> n_array=new ArrayList<String>();
               ArrayList<String> n_l=new ArrayList<String>();
                 n_l.addAll(list.get(start));
            for(int j=0;j<n_l.size();j++){
               String nstring="()"+n_l.get(j);
               if(!n_array.contains(nstring))  n_array.add(nstring);
              for(int k=0;k<n_l.get(j).length();k++){
              	if(n_l.get(j).charAt(k)=='('){
              		String s=n_l.get(j).substring(0,k+1)+"()"+n_l.get(j).substring(k+1,n_l.get(j).length());
              		//System.out.println(s);
                  if(!n_array.contains(s)) n_array.add(s);

              	}
              }
               
               
            }
	 	   start=start+1;
	 	   list.add(n_array);
       findAll(list,n);



	 }


	public static void main(String[] args) {
		   Parens p=new Parens();
       p.initial(3);
	}
}