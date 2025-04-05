package Switch_Statement;

public class Example2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch(ch){
            case 66 :
                System.out.println("It is A");// Char will pick based on ASCII
                break;
            default :
                System.out.println("Not match");
                break;
//boolean is not allowed
// duplicate is not allowed
        }
    }
}
