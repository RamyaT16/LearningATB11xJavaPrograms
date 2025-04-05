package Type_Casting;

public class max_3_num {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 10;
        int n3 = -65;
        // n1>n2 and n1>n3 ; n1
        //n2> n3 and n2> n1 ; n2
        //n3
        int x = (n1>n2) ? (n1>n3) ? n1 :n3: ((n2>n3)? n2:n3);
        System.out.println(x);
    }
}
