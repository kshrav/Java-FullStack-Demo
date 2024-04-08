import java.util.Scanner;

class Helloworld{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is the first program in Java");
        
        //primitive types

        byte age = 49;
        short pincode = 9383;
        long number = 738484734;
        float height = 5.7f;
        char initial = 'k';
        boolean isTrue = true;
        
        //non primitive types
        String str = "My name is";

        System.out.println(age);
        System.out.println(pincode);
        System.out.println(number);

        System.out.println(height);

        System.out.println(initial);

        System.out.println(isTrue);
        System.out.println(str);
    
        // reading input from user

        System.out.println("Enter your name:  ");
        String name;
        name = scanner.nextLine();
        System.out.println("name :" + name);
        System.out.println("Enter your age:  ");

        int years = scanner.nextInt();
        System.out.println("age :" + years);

        //Implicit type cast (widening)

        short code = 897;
        int code2 = code;
        //Explicit type casting (narrowing)
        double weight1 = 200.65;
        int weight2 = (int) weight1;

        System.out.println(weight2);
        System.out.println(code2);
    }
}