import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
public class Permutation1{


	ArrayList<Character> list=new ArrayList<Character>();
    ArrayList<String> result=new ArrayList<String>();
    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    StringBuilder st=new StringBuilder();
	public void setList(String str){
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==null)			map.put(str.charAt(i),1);
			else {
			int count=	map.get(str.charAt(i));
            map.put(str.charAt(i),++count);
			}
		}
       permutate2(map,st);
		// permutate(list,st);
		for(String resu:result){
			System.out.println(resu);
		}
	}


	public void permutate(ArrayList<Character> list,StringBuilder s){
		if(list.size()==0) {
			result.add(s.toString());
			return;
		}

		for(int i=0;i<list.size();i++){
			StringBuilder sb=new StringBuilder(s.toString());
			ArrayList<Character> copylist=new ArrayList<Character>();
			
			copylist.addAll(list);
  			
            sb.append(list.get(i));
            copylist.remove(i);
            permutate(copylist,sb);
		}

	}

	public void permutate2(HashMap<Character,Integer> list,StringBuilder s){
		if(list.isEmpty()) {
			result.add(s.toString());
			return;
		}
		Set<Character> keys=list.keySet();
		List<Character> keylist=new ArrayList<Character>(keys);
		for(int i=0;i<keylist.size();i++){
			StringBuilder sb=new StringBuilder(s.toString());
		
			sb.append(keylist.get(i));
			HashMap<Character,Integer> n_map=new HashMap<Character,Integer>();
			n_map.putAll(list);
            Integer count=n_map.get(keylist.get(i));
            n_map.put(keylist.get(i),--count);
            if(n_map.get(keylist.get(i))==0)  n_map.remove(keylist.get(i));
            permutate2(n_map,sb);
		}



	}
	public static void main(String[] args) {
		Permutation1 p1=new Permutation1();
		p1.setList("aabbbbc");
	}
}