public class TripleStep{

  int n=0;
   int sum=0;
  public int pways(int steps){
  	recursion(0,steps);
  	return n;

  }
  public void recursion(int t,int steps){

   
  	for(int i=1;i<4;i++){
        sum=t+i;
        if(sum<steps) recursion(t+i,steps);
        else if(sum==steps)  {
        

        	n++;
        }else{ return;}
  	}

  }


  public static void main(String[] args) {
  	TripleStep ts=new TripleStep();
    int ps=	ts.pways(Integer.parseInt(args[0]));
    System.out.println(ps);
  }



}
