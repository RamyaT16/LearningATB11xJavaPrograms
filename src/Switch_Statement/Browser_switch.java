package Switch_Statement;

import java.util.Scanner;

public class Browser_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser name");
        String browser = scanner.next();
        switch(browser){
            case "Chrome" :
                System.out.println("Its a Chrome Browser. Enjoy using it !!!");
                break;
            case "Edge":
                System.out.println("Its a Edge Browser Enjoy using it !!!");
                break;
            default:
                    System.out.println("Sorry we do not support this browser :(");
                    break;
        }
    }
}