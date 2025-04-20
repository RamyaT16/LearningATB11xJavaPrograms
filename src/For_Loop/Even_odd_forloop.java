package For_Loop;

public class Even_odd_forloop {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for(; a<=50; a++){
            if (a%2==0){
                System.out.println(a +" is even");
            }
            else{
                System.out.println(a + " is odd" );
            }
        }
    }
}
