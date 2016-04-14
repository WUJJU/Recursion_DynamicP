public class TripleStep2{

    int count(int n){
    	int [] temp=new int[n+1];
    	return countWays(n,temp);

    }

	int countWays(int n,int [] temp){

		if(n<0) return 0;
		else if(n==0) return 1;
		else if(temp[n]!=0) return temp[n];
		else{

		temp[n]= countWays(n-1,temp)+countWays(n-2,temp)+countWays(n-3,temp);
		return temp[n];
		}
	}

	public static void main(String[] args) {
		TripleStep2 t2=new TripleStep2();
		int w=t2.count(10);
        System.out.println(w);
	}
}