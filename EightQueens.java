public class EightQueens{

    int k=-1;
    int [][]board=new int [8][8];
    boolean flag=false;

 public void initial(){
     find(k,board);
    System.out.println(flag);
 }

	public void find(int k,int [][] board){
    k++;
        if(flag==true) return;
		if(k==8) {
      flag=true;
       for(int i=0;i<8;i++){
               for(int j=0;j<8;j++)
               System.out.print(board[i][j]);
               
               System.out.println("");
           }
       return;
    }

       for(int i=0;i<8;i++){
         int [][] n_board=copy(board);
         if(k==8) return;
       	if(checkRC(n_board,k,i)&&checkDIncreU(board,k,i)&&checkDDecreU(n_board,k,i)) {
       		  n_board[k][i]=1;
            find(k,n_board);
            }


       }
       return;

	}
  public int [][] copy(int [][] board){
    int [][] n_board=new int [8][];
    for(int i=0;i<8;i++){
      n_board[i]=board[i].clone();

    }
    return n_board;
  }
   public boolean checkRC(int [][]board,int k, int i){
     for(int j=0;j<8;j++){
     	if(j!=i){
     		if(board[k][j]==1) return false;
       }
       if(j!=k){
       	   if(board[j][i]==1) return false;
       }

   }

    return true;
   }
   // public boolean checkDIncreD(int [][] board,int k, int i){
   // 	   if(k>=7||i>=7) return true;

   // 	   if(board[++k][++i]==1) return false;
       
   //     return checkDIncreD(board,k,i);

   // }
   public boolean checkDIncreU(int [][] board,int k, int i){
       if(k<=0||i>=7) return true;
       if(board[--k][++i]==1) return false;
       return checkDIncreU(board,k,i);
   }
   public boolean checkDDecreU(int [][] board, int k,int i){
   	   if(k<=0||i<=0) return true;
   	   if(board[--k][--i]==1) return false;
   	   return checkDDecreU(board,k,i);
   }
   //   public boolean checkDDecreD(int [][] board, int k,int i){
   //     if(k>=7||i<=0) return true;
   //     if(board[++k][--i]==1) return false;
   //     return checkDDecreD(board,k,i);
   // }
	public static void main(String[] args) {
		EightQueens eq=new EightQueens();
		eq.initial();

	}
}