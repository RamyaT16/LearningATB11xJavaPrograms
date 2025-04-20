package For_Loop;

public class Continue_evennoExample8 {
    public static void main(String[] args) {
        for(int i = 1; i<=50; i++){
            if(i % 2 != 0){
                continue; // it will go to top and execute it will not execute the if condition
            }
            System.out.println(i);
        }
    }
}
