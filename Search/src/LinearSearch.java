public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,10,55,12,9};
        int k=2;
        boolean v=false;
        for(Integer i:arr){
            if(i==k){
                System.out.println("NO "+k+" is found inside the Array !");
                v=true;
            }

        }
        if(!v){
            System.out.println("NO "+k+" is not found inside the Array !");
        }

    }
}
