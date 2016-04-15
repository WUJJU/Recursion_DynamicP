public class MagicIndex{

    int []array={-40,-20,-1,1,2,3,5,7,9,12,13};
    boolean flag=false;
    public boolean findMagic(){

        return  find(array,0,array.length-1);
    
    }
     public boolean find(int []array,int start,int end){
     	int mid =(start+end)/2;

     	if(start>end) {
     	
     		return false;
     	}
     	if(mid>array[mid]){
     		return find(array,mid+1,end);
     	}else if(mid<array[mid]){
     		return find(array,start,mid-1);
     	}else {
     		return true;
     	}

     }
	public static void main(String[] args) {
		
		MagicIndex mi=new MagicIndex();
		Boolean flag=mi.findMagic();
		System.out.println(flag);
	}
}