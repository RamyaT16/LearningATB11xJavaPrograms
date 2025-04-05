package Type_Casting;

public class Nested_Ternary_interview {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(Math.max(a, b));// math function


        int age = 28;
        String vote = (age > 18) ? ((age>30)? "Yes age is greater": "No age is not greater"): "NO";
        System.out.println(vote);

    }}
// examples are maximum of 2 nums, minimum of 2 nums, odd nums, even nums