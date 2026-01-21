public class Search {
    public static void main(String[]args){
        String [] names ={"Jack","Uri","kiana","Kellin","Remi"};
        
        for(String name:names){
            if(name.substring(0,1).equals("k")){
                System.out.println(name);
            }
        }
    }
}
