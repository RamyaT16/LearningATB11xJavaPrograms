package For_Loop;

public class Example7_continue {
    public static void main(String[] args) {
        for(int i = 0; i<20; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
