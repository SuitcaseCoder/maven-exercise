import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SpringUtilsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type something");
        
        // put the input down
        String input = sc.nextLine();
        System.out.println("You entered: " + input);
    
        System.out.println("is it a number: " + StringUtils.isNumeric(input));
        // flip it
        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        // and reverse it
        System.out.println("reverse!: " + StringUtils.reverse(input));

        // another possible answer:
//        if(StringUtils.isNumeric(input)){
//            System.out.println('"' + input + '"' + " is a number");
//        } else if(!StringUtils.isNumeric(input)){
//            System.out.println('"' + input + '"' + " is not a number");
//        }
    
       
    }
}
