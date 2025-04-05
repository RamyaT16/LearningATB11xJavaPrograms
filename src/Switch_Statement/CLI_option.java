package Switch_Statement;

public class CLI_option {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Enter any number");
        switch (a){
            case 1 :

                System.out.println("Monday");
            case 2 :

                System.out.println("Tuesday");
        }

    }
}
