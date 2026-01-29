public class locateMinimum {
    public static void main(String[]args){
        int[]nums = {10,9,8,7,6,5,4,3,2,1,1,1};
        System.out.println(locateMinimum1(nums));
    }

public static int locateMinimum1(int [] num){
    int min = num[0];
    int index =0;
        for(int i = 0;i < num.length;i++){
        if(min >=num[i]){
            min = num[i];
            index = i; 
}	
}
    return index;
}
}