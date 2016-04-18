import java.util.Stack;
public class Hanoi{

   Stack orginal=new Stack();
   Stack buffer=new Stack();
   Stack destination=new Stack();

   public void perform(){
    orginal.push(5);
    orginal.push(4);
    orginal.push(3);
    orginal.push(2);
    orginal.push(1);
    perform_s(5,orginal,destination,buffer);

   }
   public void perform_s(int n,Stack org, Stack dest,Stack buf){
   	   if(n<=0)     return;
   	 
       
       perform_s(n-1,org,buf,dest);
       moveTop(org,dest);//move n to destination
       perform_s(n-1,buf,dest,org);//move (n-1) from buf to destination use org as bufferring



         
   }
   public void moveTop(Stack org,Stack dest){
 
       dest.push(org.pop());
   

   }
   public static void main(String[] args) {
   	Hanoi hanoi=new Hanoi();
   	hanoi.perform();
   	  while(hanoi.destination.empty()!=true)
       System.out.println(hanoi.destination.pop());
   }

}