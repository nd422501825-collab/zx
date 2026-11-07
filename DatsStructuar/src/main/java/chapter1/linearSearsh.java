
package chapter1;

public class linearSearsh {
    public static void main(String []args){
        int numbers[]=new int [10];
        numbers[0]=5;
        numbers[1]=4;
        numbers[2]=7;
        numbers[3]=9;
        numbers[4]=11;
        numbers[5]=55;
        numbers[6]=36;
        numbers[7]=41;
        numbers[8]=46;
        numbers[9]=44;
        LinearSearch(numbers,81);
        
        
    }
    public static void LinearSearch(int[]arr,int target){
        boolean isfound =false;
        for(int i=0; i< arr.length;i++){
            if(arr[i]==target){
                isfound =true;
                break;
            }
        }
       
        if(isfound){
          System.out.println("Target:"+target+"is found");
        }else{
             System.out.println("Target:"+target+"is not found");
        }
    
}
}

   
