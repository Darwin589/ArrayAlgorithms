public class Dulpicate {
    public static void main(String[]args){
        String [] totalClass = {"tree","chemistry","AlgebraII","English","lunch","APCSA","studyhall","SpaishV","History"};
        System.out.println(ContainsDulpicate(totalClass));
    }
    public static boolean ContainsDulpicate(String [] array){
        int j = 0;
        for(int i=1;i<array.length;i++){

            while(j<array.length){
                j++;
                if(array[i].equals(array[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
