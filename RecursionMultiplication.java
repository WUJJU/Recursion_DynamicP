public class RecursionMultiplication{


    int x;
    int y;
    public int multiple(){
    		x=1001;
		y=66;
    return 	recursion_m(x,y,32);

    }
    public int recursion_m(int x, int y,int n){
    	if(n==1){
    		if((x&1)==0||(y&1)==0) return 0;
    		else return 1;
    	}
        int m=(1<<(n/2))-1;
        int xr=x&m;    
       int  xl=x&(~m);
       xl=xl>>>(n/2);
       int  yr=y&m;
       int  yl=y&(~m);
       yl=yl>>>(n/2);
    	return (recursion_m(xl,yl,n/2)<<n)+(recursion_m(xl,yr,n/2)<<(n/2))
    	     +(recursion_m(xr,yl,n/2)<<(n/2))+recursion_m(xr,yr,n/2);
    }
	public static void main(String[] args) {
		RecursionMultiplication rm=new RecursionMultiplication();
	
		int result=rm.multiple();
		System.out.println(result);
	}
}