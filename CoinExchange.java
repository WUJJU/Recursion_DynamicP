public class CoinExchange{



	public int [] sets={1,5,10,25};
    //private int [][]temp;
	public int initial(int sum){
			//temp=new int[sets.length+1][sum+1];

			return ways(sets,sum,sets.length);
	}
   
	public int ways(int [] set, int sum,int n){
		 //if(temp[n][sum]!=0) return temp[n][sum];
         if(sum==0) {
            //temp[n][sum]=1;
         	return 1;
         }
         if(n==0&&sum!=0) return 0;
         if(sum<0) return 0;
        

        
        
		return ways(set,sum,n-1)+ways(set,sum-set[n-1],n);


	}

	public static void main(String[] args) {
		CoinExchange ce=new CoinExchange();
		int t=	ce.initial(10);
		System.out.println(t);
	
	}
}