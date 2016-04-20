public class CoinDynamic{


    public int [] sets={1,5,10,25};
    public int dyfind(int sum){
       int [][] temp=new int[sets.length+1][sum+1];
        
       for(int i=0;i<sets.length+1;i++) temp[i][0]=1;

       for(int i=1;i<sum+1;i++) temp[0][i]=0;



       	for(int j=1;j<=sets.length;j++) {
       		for(int k=1;k<=sum;k++){
       			if(sets[j-1]<=k){
                   temp[j][k]=temp[j][k-sets[j-1]]+temp[j-1][k];
       			}else{
       				temp[j][k]=temp[j-1][k];
       			}
       			
       		}
       	}

       	return temp[sets.length][sum];

    }


	public static void main(String[] args) {
		CoinDynamic cd=new CoinDynamic();
		int t=cd.dyfind(10);
        System.out.println(t);
	}
}